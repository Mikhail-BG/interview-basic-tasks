package basics.interview.task.linkedlist.reversewithoutrecursion;

public class SinglyLinkedListWReverse<T>
{
    public Node head;

    public void append(T data)
    {
        if (head == null)
        {
            head = new Node<>(data);
            return;
        }
        tail().next = new Node<>(data);
    }

    private Node tail()
    {
        Node tail = head;

        while (tail.next() != null)
        {
            tail = tail.next();
        }
        return tail;
    }

    public void reverseIteratively()
    {
        Node current = head;
        Node previous = null;
        Node forward = null;

        while (current.next() != null)
        {
            // Saving reference of next node, since we are changing current node
            forward = current.next;

            // Inserting node at start of new list
            current.next = previous;
            previous = current;

            // Advancing to next node
            current = forward;
        }

        head = current;
        head.next = previous;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null)
        {
            sb.append(current).append("-->");
            current = current.next;
        }

        if (sb.length() >= 3)
        {
            sb.delete(sb.length() - 3, sb.length());
        }
        return sb.toString();
    }

    private static class Node<T>
    {
        private T data;
        private Node next;

        public Node(T data)
        {
            this.data = data;
        }

        public T data()
        {
            return data;
        }

        public Node next()
        {
            return next;
        }

        public void setNext(Node next)
        {
            this.next = next;
        }

        @Override
        public String toString()
        {
            return data.toString();
        }
    }
}
