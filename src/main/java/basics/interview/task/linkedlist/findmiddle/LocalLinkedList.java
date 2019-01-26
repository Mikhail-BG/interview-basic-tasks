package basics.interview.task.linkedlist.findmiddle;

public class LocalLinkedList
{
    private Node head;
    private Node tail;

    public LocalLinkedList()
    {
        this.head = new Node("head");
        tail = head;
    }

    public Node head()
    {
        return head;
    }

    public void add(Node node)
    {
        tail.setNext(node);
        tail = node;
    }
}

