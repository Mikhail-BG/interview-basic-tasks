package basics.interview.task.linkedlist.sizeoflinkedlist;

public class SizeOfLinkedList
{
    public static void main(String[] args)
    {
        InnerLinkedList<String> stringInnerLinkedList =
                new InnerLinkedList<>();
        stringInnerLinkedList.append("A");
        stringInnerLinkedList.append("B");
        stringInnerLinkedList.append("C");
        stringInnerLinkedList.append("D");
        stringInnerLinkedList.append("E");
        stringInnerLinkedList.append("F");

        System.out.println(stringInnerLinkedList);
        System.out.println("Non Recursion. Size of list = " + stringInnerLinkedList.size());
        System.out.println("Recursion. Size of list = " + stringInnerLinkedList.length(stringInnerLinkedList.head()));
    }

    public static class InnerLinkedList<T>
    {
        private Node head;

        private void append(T data)
        {
            if (head == null)
            {
                head = new Node<>(data);
                return;
            }
            tail().next = new Node<>(data);
        }

        public Node head()
        {
            return head;
        }

        private int size()
        {
            Node current = head;
            int size = 0;

            while (current != null)
            {
                size++;
                current = current.next;
            }

            return size;
        }

        public int length(Node node)
        {
            if (node == null)
            {
                return 0;
            }
            return 1 + length(node.next);
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

        private Node tail()
        {
            Node tail = head;

            while (tail.next != null)
            {
                tail = tail.next;
            }
            return tail;
        }

        public static class Node<T>
        {
            private T data;
            private Node next;

            Node(T data)
            {
                this.data = data;
            }

            @Override
            public String toString()
            {
                return this.data.toString();
            }
        }
    }
}
