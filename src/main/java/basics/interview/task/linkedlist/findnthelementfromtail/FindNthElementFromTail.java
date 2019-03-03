package basics.interview.task.linkedlist.findnthelementfromtail;

public class FindNthElementFromTail
{
    public static void main(String[] args)
    {
        SinglyLinkedList<String> stringSinglyLinkedList =
                new SinglyLinkedList<>();
        stringSinglyLinkedList.append("A");
        stringSinglyLinkedList.append("B");
        stringSinglyLinkedList.append("C");
        stringSinglyLinkedList.append("D");
        stringSinglyLinkedList.append("E");
        stringSinglyLinkedList.append("F");

        System.out.println(stringSinglyLinkedList);
        System.out.println(stringSinglyLinkedList.getNodeNumberFromTail(3));
    }

    public static class SinglyLinkedList<T>
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
        private T getNodeNumberFromTail(int number)
        {
            Node fast = head;
            Node slow = head;
            int counter = 1;

            while (fast.next != null)
            {
                fast = fast.next;
                counter++;

                if (counter > number)
                {
                    slow = slow.next;
                }
            }

            return (T) slow.data;
        }

        @Override
        public String toString()
        {
            Node current = head;
            StringBuffer stringBuffer = new StringBuffer();
            while (current != null)
            {
                stringBuffer
                        .append(current.data)
                        .append("-->");
                current = current.next;
            }

            if (stringBuffer.length() >= 3)
            {
                stringBuffer.delete(stringBuffer.length() - 3, stringBuffer.length());
            }

            return stringBuffer.toString();
        }

        public static class Node<T>
        {
            private T data;
            private Node next;

            private Node(T data)
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
