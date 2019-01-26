package basics.interview.task.linkedlist.reverselinkedlist;

public class SinglyLinkedList
{
    static class SinglyNode
    {
        private int data;
        private SinglyNode next;

        public SinglyNode(int data)
        {
            this.data = data;
        }

        public int getData()
        {
            return data;
        }

        public void setData(int data)
        {
            this.data = data;
        }

        public SinglyNode next()
        {
            return next;
        }
    }

    private SinglyNode head;

    public SinglyLinkedList(SinglyNode head)
    {
        this.head = head;
    }

    public void add(SinglyNode node)
    {
        SinglyNode current = head;
        while (current != null)
        {
            if (current.next == null)
            {
                current.next = node;
                break;
            }
            current = current.next;
        }
    }

    public void print()
    {
        SinglyNode current = head;
        while (current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse()
    {
        SinglyNode pointer = head;
        SinglyNode current = null;
        SinglyNode previous = null;

        while (pointer != null)
        {
            current = pointer;
            pointer = pointer.next;

            //reverse the link
            current.next = previous;
            previous = current;
            head = current;
        }
    }
}
