package com.example.ianreim.addback;

public class LinkedList
{
    private Node head;
    private int count;

    public LinkedList()
    {
        this.head = null;
        this.count = 0;

    }



    public int getAtIndex(int index)
    {
        Node currNode = this.head;
        for(int i = 0; i < index; i++)
        {
            currNode = currNode.getNextNode();
        }
        return currNode.getPayload();
    }


    public int removeLast()
    {
        if(this.count == 1)
        {
            return this.removeFront();
        }
        else
        {

            Node currNode = this.head;
            for(int i = 0; i < this.count-2; i++)
            {
                currNode = currNode.getNextNode();
            }


            currNode.setNextNode(null);
            Node nodeToReturn = currNode.getNextNode();
            this.count--;
            return nodeToReturn.getPayload();
        }
    }


    public int removeFront()
    {
        Node currNode = this.head;
        this.head = this.head.getNextNode();
        currNode.setNextNode(null);
        this.count--;
        return currNode.getPayload();
    }




    public void addFirst(int value)
    {
        Node n = new Node (value);
        if (this.head == null)
        {
            this.head = n;
        }
        else{
            n.setNextNode(head);
            head = n;
        }
        count++;
    }

    public void addAtIndex(int value, int index)
    {
        if(index == 0)
        {
            this.addFirst(value);
        }
        else if(this.count == index)
        {
            this.BackAdd(value);
        }
        else
        {

            Node currNode = this.head;
            for(int i = 0; i < index - 1; i++)
            {
                currNode = currNode.getNextNode();
            }
            Node n = new Node(value);
            n.setNextNode(currNode.getNextNode());
            currNode.setNextNode(n);
            this.count++;
        }
    }

    public int removeIndex(int index)
    {
        if(index == 0)
        {
            return this.removeFront();
        }
        else if(index == this.count-1)
        {
            return this.removeLast();
        }
        else
        {
            Node currNode = this.head;

            for(int i = 0; i < index-1; i++)
            {
                currNode = currNode.getNextNode();
            }

            Node nodeToReturn = currNode.getNextNode();
            currNode.setNextNode(nodeToReturn.getNextNode());
            nodeToReturn.setNextNode(null);
            this.count--;
            return nodeToReturn.getPayload();
        }
    }



    public void BackAdd(int value)
    {
        if (this.head == null)
        {
            this.addFirst(value);
        }
        else
        {
            Node currNode = this.head;
            while(currNode.getNextNode() !=null)
            {
                currNode = currNode.getNextNode();
            }
            Node n = new Node(value);
            currNode.setNextNode(n);
        }

    }


    public void display ()
    {
        String answer = "";
        Node currNode = head;

        for(int i = 0; i < this.count; i++)
        {
            answer = answer + currNode.getPayload() + " ->";
            currNode = currNode.getNextNode();
        }
    }
}
