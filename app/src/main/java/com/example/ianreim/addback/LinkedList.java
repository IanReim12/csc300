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
