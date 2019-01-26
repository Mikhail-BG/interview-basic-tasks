package basics.interview.task.linkedlist.reverselinkedlist;

public class ReverseLinkedList
{
    public static void main(String[] args)
    {
        // creating a singly linked list
        SinglyLinkedList.SinglyNode head = new SinglyLinkedList.SinglyNode(1);
        SinglyLinkedList linkedlist = new SinglyLinkedList(head);

        // adding node into singly linked list
        linkedlist.add(new SinglyLinkedList.SinglyNode(2));
        linkedlist.add(new SinglyLinkedList.SinglyNode(3));
        linkedlist.add(new SinglyLinkedList.SinglyNode(4));

        // printing a singly linked list
        linkedlist.print();

        // reversing the singly linked list
        linkedlist.reverse();

        // printing the singly linked list again
        linkedlist.print();
    }
}
