// https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
 
Node removeDuplicates(Node head)
    {
        if (head.next == null) return head;
	    Node start= head,end= head.next,current = head,temp = null;
	    
	    while(end != null){
	        if(end.data == start.data){
	            while(end != null && end.data == start.data){
	                temp = end;
	                end = end.next;
	            }
	            temp.next = null;
	            start.next = end;
	                
	        }else{
    	        end = end.next;
    	        start = start.next;
	        }
	    }
	    return head;
    }
