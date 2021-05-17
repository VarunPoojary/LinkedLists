public class DeleteNodeBeginning
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
            while (current!=null)
            {
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.println("null");
        }

        public void insertLast(int value)
        {
            ListNode newNode=new ListNode(value);
            if(head==null)
            {
                head=newNode;
                return;
            }
            ListNode current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;
        }

        public ListNode deleteFirst()
        {
            if(head==null)
            {
                return null;
            }
            ListNode deletedNode=head;
            head=head.next;
            deletedNode.next=null;
            return deletedNode;

        }


        public static void main(String[] args)
        {
            DeleteNodeBeginning sll=new DeleteNodeBeginning();
            sll.head=new ListNode(1);
            ListNode second=new ListNode(2);
            ListNode third=new ListNode(3);

            sll.head.next=second;
            second.next=third;


            sll.display();
            ListNode deletedNode=sll.deleteFirst();
            System.out.println("Deleted Node: "+deletedNode.data);
            sll.display();
        }
    }

