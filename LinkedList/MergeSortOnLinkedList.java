// Problem - https://practice.geeksforgeeks.org/problems/sort-a-linked-list/1

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)    // extra logn space for recursion
    {
        
        if(head.next == null) return head;
        
         Node middle = getMiddle(head);
         Node nextToMiddle = middle.next;
         middle.next = null;
         
         Node leftHead = mergeSort(head);
         Node rightHead = mergeSort(nextToMiddle);
         
         Node sortedHead = sort(leftHead,rightHead);
         return sortedHead;
    }
    
    static Node sort(Node left, Node right){   // Recursive use extra space of n - use loop for O(1) space             
        Node head = null;
        if(left == null) return right;
        if(right == null) return left;
        if(left.data <= right.data){
            head = left;
            head.next = sort(left.next,right);
        }else{
            head = right;
            head.next = sort(left,right.next);
        }
        
        return head;
    }   
    static Node getMiddle(Node head){
        Node a=head,b=head;
        while(b.next != null && b.next.next != null){
            a = a.next;
            b = b.next.next;
        }
        return a;
    }
    // Total extra nlogn space
}
