package basics.interview.task.linkedlist.cyclelinkedlist;

public class CycleLinkedListTest
{
    public static void main(String args[])
    {
        CycleLinkedList cycleLinkedList = new CycleLinkedList();
        cycleLinkedList.appendIntoTail(new CycleLinkedList.CycleNode("101"));
        cycleLinkedList.appendIntoTail(new CycleLinkedList.CycleNode("201"));
        cycleLinkedList.appendIntoTail(new CycleLinkedList.CycleNode("301"));
        cycleLinkedList.appendIntoTail(new CycleLinkedList.CycleNode("401"));

        System.out.println("Linked List : " + cycleLinkedList);

        if (cycleLinkedList.isCyclic())
        {
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        } else
        {
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }
    }
}
