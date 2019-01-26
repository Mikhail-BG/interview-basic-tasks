package basics.interview.task.linkedlist.reversewithoutrecursion;

public class ReverseLinkedListWithoutRecursion
{
    public static void main(String[] args)
    {
        SinglyLinkedListWReverse<String> stringSinglyLinkedListWReverse =
                new SinglyLinkedListWReverse<>();
        stringSinglyLinkedListWReverse.append("A");
        stringSinglyLinkedListWReverse.append("B");
        stringSinglyLinkedListWReverse.append("C");
        stringSinglyLinkedListWReverse.append("D");
        stringSinglyLinkedListWReverse.append("E");
        stringSinglyLinkedListWReverse.append("F");

        System.out.println(stringSinglyLinkedListWReverse);

        stringSinglyLinkedListWReverse.reverseIteratively();

        System.out.println(stringSinglyLinkedListWReverse);
    }
}
