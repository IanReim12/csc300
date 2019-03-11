package com.example.ianreim.addback;

public class Node
{
    private int payload;
    private Node nextNode;

    public Node (int Payload)
    {
        this.payload = payload;
        this.nextNode = null;
    }

    public int getPayload() {
        return payload;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
