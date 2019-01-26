package basics.interview.task.linkedlist.findmiddle;

public class FindMiddle
{
    public static void main(String args[])
    {
        //creating LinkedList with 5 elements including head
        LocalLinkedList localLinkedList = new LocalLinkedList();
        Node head = localLinkedList.head();
        localLinkedList.add(new Node("1"));
        localLinkedList.add(new Node("2"));
        localLinkedList.add(new Node("3"));
        localLinkedList.add(new Node("4"));
        localLinkedList.add(new Node("5"));

        //finding middle element of LinkedList in single pass
        Node current = head;
        int length = 0;
        Node middle = head;

        while (current.next() != null)
        {
            length++;
            if (length % 2 == 0)
            {
                middle = middle.next();
            }
            current = current.next();
        }

        if (length % 2 == 1)
        {
            middle = middle.next();
        }

        System.out.println("length of LinkedList: " + length);
        System.out.println("middle element of LinkedList : " + middle);
    }
}
