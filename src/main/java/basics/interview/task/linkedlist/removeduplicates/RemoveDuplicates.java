package basics.interview.task.linkedlist.removeduplicates;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        LinkedListDuplicates<String> stringLinkedListDuplicates = new LinkedListDuplicates<>();
        stringLinkedListDuplicates.append("E");
        stringLinkedListDuplicates.append("B");
        stringLinkedListDuplicates.append("A");
        stringLinkedListDuplicates.append("D");
        stringLinkedListDuplicates.append("E");
        stringLinkedListDuplicates.append("A");
        stringLinkedListDuplicates.append("C");
        stringLinkedListDuplicates.append("D");
        stringLinkedListDuplicates.append("B");

        System.out.println(stringLinkedListDuplicates);

        stringLinkedListDuplicates.removeDuplicates();

        System.out.println(stringLinkedListDuplicates);
    }
}
