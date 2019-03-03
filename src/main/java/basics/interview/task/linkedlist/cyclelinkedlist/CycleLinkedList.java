package basics.interview.task.linkedlist.cyclelinkedlist;

public class CycleLinkedList
{
    public static class CycleNode
    {
        private CycleNode next;
        private String data;

        public CycleNode(String data)
        {
            this.data = data;
        }

        public String data()
        {
            return data;
        }

        public void setData(String data)
        {
            this.data = data;
        }

        private CycleNode next()
        {
            return next;
        }

        private void setNext(CycleNode next)
        {
            this.next = next;
        }

        @Override
        public String toString()
        {
            return this.data;
        }
    }

    private CycleNode head;

    public CycleLinkedList()
    {
        this.head = new CycleNode("head");
    }

    public CycleNode head()
    {
        return head;
    }

    public void appendIntoTail(CycleNode cycleNode)
    {
        CycleNode current = head;

        //find last element of LinkedList i.e. tail
        while (current.next() != null)
        {
            current = current.next();
        }

        //appending new node to tail in LinkedList
        current.setNext(cycleNode);
    }

    public boolean isCyclic()
    {
        CycleNode fast = head;
        CycleNode slow = head;

        while (fast != null && fast.next() != null)
        {
            fast = fast.next.next;
            slow = slow.next;

            //if fast and slow pointers are meeting then LinkedList is cyclic
            if (slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString()
    {
        if (isCyclic())
        {
            return "LinkedList is cyclic";
        }

        StringBuilder result = new StringBuilder();
        CycleNode current = head.next();

        while (current != null)
        {
            result.append(current).append("-->");
            current.next();
        }

        result.delete(result.length() - 3, result.length());

        return result.toString();
    }
}
