public class InsertNodeAtGivenPos
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
            System.out.print(current.data+"--->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void insertGivenPos(int position, int value)
    {
        ListNode node=new ListNode(value);
        if(position==1)
        {
            node.next=head;
            head=node;
        }
        else
        {
            ListNode previous=head;
            int count=1;
            while(count<position-1)
            {
                previous=previous.next;
                count++;
            }

            ListNode current=previous.next;
            node.next=current;
            previous.next=node;
        }

    }


    public static void main(String[] args)
    {
        InsertNodeAtGivenPos sll=new InsertNodeAtGivenPos();
        sll.head=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);

        sll.head.next=second;
        second.next=third;

        sll.display();
        sll.insertGivenPos(1,0);
        sll.display();
        sll.insertGivenPos(3,0);
        sll.display();
        sll.insertGivenPos(6,0);
        sll.display();
    }
}
