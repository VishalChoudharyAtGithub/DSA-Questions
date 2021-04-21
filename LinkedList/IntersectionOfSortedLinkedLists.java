// Problem - https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1

public static Node findIntersection(Node head1, Node head2)
    {
        Node head=null,current=null;
        while(head1 != null && head2 != null){
            if(head1.data == head2.data){
                if(head == null){
                    head = new Node(head1.data);
                    current = head;
                }else{
                   current.next = new Node(head1.data);
                    current = current.next; 
                }
                head1 = head1.next;
                head2 = head2.next;
                
                
            }else{
                if(head1.data>head2.data)
                    head2 = head2.next;
                else
                    head1 = head1.next;
            }
        }
        return head;
    }
