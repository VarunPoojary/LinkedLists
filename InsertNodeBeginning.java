public class InsertNodeBeginning
{
    ListNode head;
    static class ListNode
    {
        int data;
        ListNode next;
        ListNode(int d)
        {
            data=d;
            next=null;
        }

    }

    public void display()
    {
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"---->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int value)
    {
        ListNode new_node=new ListNode(value);
        new_node.next=head;
        head=new_node;
    }

    public static void main(String[] args)
    {
        InsertNodeBeginning sll=new InsertNodeBeginning();
        sll.head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);

        sll.head.next=second;
        second.next=third;

        sll.display();
        sll.insertFirst(0);
        sll.display();


    }
}
