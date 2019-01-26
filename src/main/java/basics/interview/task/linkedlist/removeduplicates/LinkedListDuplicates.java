package basics.interview.task.linkedlist.removeduplicates;

public class LinkedListDuplicates<T>
{
    private Node<T> head;

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

        while (tail.next != null)
        {
            tail = tail.next;
        }
        return tail;
    }

    @SuppressWarnings("unchecked")
    public void removeDuplicates()
    {
        Node currentOuter = head;
        Node currentInner = null;

        while (currentOuter != null)
        {
            currentInner = currentOuter;
            while (currentInner != null)
            {
                if (currentOuter.data.equals(currentInner.data))
                {
                    remove((T) currentOuter.data);
                    currentOuter = head;
                    break;
                }
                currentInner = currentInner.next;
            }
            if (currentOuter != null)
            {
                currentOuter = currentOuter.next;
            }

        }
    }

    public int size()
    {
        Node current = head;
        int size = 0;

        while (current.next != null)
        {
            size++;
            current = current.next;
        }

        return size;
    }

    public void remove(T data)
    {
        Node current = head;
        Node previous = head;

        //remove first node
        if (current.data.equals(data))
        {
            if (current.next != null)
            {
                current.data = current.next.data;
                current.next = current.next.next;
            } else
            {
                current.data = null;
                current.next = null;
                return;
            }
        }

        //remove middle nodes
        while (current.next != null)
        {
            if (current.data.equals(data))
            {
                current.data = current.next.data;
                current.next = current.next.next;
            } else
            {
                previous = current;
                current = current.next;
            }
        }

        //remove last node
        if (current.data != null && current.data.equals(data))
        {
            previous.next = null;
            if (previous.equals(head))
            {
                head = null;
            }
        }
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

        @Override
        public String toString()
        {
            return data.toString();
        }
    }
}
