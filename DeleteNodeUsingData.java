public class DeleteNodeUsingData
{
        static ListNode head;
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

        public void delete(int key)
        {
            ListNode current=head;
            ListNode previous=null;
            if(current!=null && current.data==key)
            {
                head=current.next;
                return;
            }
            while(current!=null && current.data!=key)
            {
                previous=current;
                current=current.next;
            }
            if(current==null)
                return;
            previous.next=current.next;
        }


        public void display(ListNode head)
        {
            ListNode current=head;
            while(current!=null)
            {
                System.out.print(current.data+"---->");
                current=current.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args)
        {
            DeleteNodeUsingData sll=new DeleteNodeUsingData();
            sll.head=new ListNode(1);
            ListNode second=new ListNode(2);
            ListNode third=new ListNode(3);
            ListNode fourth=new ListNode(4);

            sll.head.next=second;
            second.next=third;
            third.next=fourth;

            sll.display(head);
            sll.delete(3);
            sll.display(head);
        }
    }