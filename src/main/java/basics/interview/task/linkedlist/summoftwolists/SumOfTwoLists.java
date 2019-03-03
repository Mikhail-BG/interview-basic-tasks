package basics.interview.task.linkedlist.summoftwolists;

public class SumOfTwoLists
{
    public static void main(String[] args)
    {
        SinglyLinkedList first = new SinglyLinkedList();
        first.append(3);
        first.append(6);
        first.append(8);

        SinglyLinkedList second = new SinglyLinkedList();
        second.append(1);
        second.append(4);
        second.append(6);
        second.append(8);

        System.out.println(first);
        System.out.println(convertToInt(first));
        System.out.println(convertToInt(second));
        System.out.println(sumTwoLists(first, second));
    }

    private static SinglyLinkedList sumTwoLists(SinglyLinkedList first, SinglyLinkedList second)
    {
        SinglyLinkedList result = new SinglyLinkedList();
        int sum = convertToInt(first) + convertToInt(second);
        result = convertToList(sum);

        return result;
    }

    private static int convertToInt(SinglyLinkedList list)
    {
        int result = 0;
        for (int i = 0; i < list.size(); i++)
        {
            result = result + list.get(i) * (int) Math.pow(10, (list.size() - 1 - i));
        }

        return result;
    }

    private static SinglyLinkedList convertToList(int number)
    {
        SinglyLinkedList result = new SinglyLinkedList();
        while (number > 0)
        {
            result.append(number % 10);
            number = number / 10;
        }

        result.reverse();

        return result;
    }

    public static class SinglyLinkedList
    {
        private SinglyLinkedList.Node head;

        private void append(int data)
        {
            if (head == null)
            {
                head = new SinglyLinkedList.Node(data);
                return;
            }
            tail().next = new SinglyLinkedList.Node(data);
        }

        private SinglyLinkedList.Node tail()
        {
            SinglyLinkedList.Node tail = head;

            while (tail.next != null)
            {
                tail = tail.next;
            }

            return tail;
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

        private int get(int position)
        {
            Node current = head;
            int result = 0;
            while (position >= 0)
            {
                result = current.data;
                current = current.next;
                position--;
            }

            return result;
        }

        private void reverse()
        {
            Node pointer = head;
            Node previous = null;
            Node current = null;

            while (pointer != null)
            {
                current = pointer;
                pointer = pointer.next;

                current.next = previous;
                previous = current;
                head = current;
            }
        }

        @Override
        public String toString()
        {
            SinglyLinkedList.Node current = head;
            StringBuilder stringBuilder = new StringBuilder();
            while (current != null)
            {
                stringBuilder
                        .append(current.data)
                        .append("-->");
                current = current.next;
            }

            if (stringBuilder.length() >= 3)
            {
                stringBuilder.delete(stringBuilder.length() - 3, stringBuilder.length());
            }

            return stringBuilder.toString();
        }

        public static class Node
        {
            private int data;
            private Node next;

            private Node(int data)
            {
                this.data = data;
            }

            @Override
            public String toString()
            {
                return String.valueOf(this.data);
            }
        }
    }
}
