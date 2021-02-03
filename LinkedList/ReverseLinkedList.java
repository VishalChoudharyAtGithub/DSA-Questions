class ReverseLinkedList
{
    
    Node reverseList(Node head)
    {
        Node current = head;
        Node prev=null,next;
        while(current != null){
            
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;        
    }
}
