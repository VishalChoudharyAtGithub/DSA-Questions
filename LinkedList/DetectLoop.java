// Problem - https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1

public static boolean detectLoop(Node head){
        // Add code here
        Node a = head,b = head;
        while(b != null && b.next != null){
            a = a.next;
            b = b.next.next;
            if(a==b) return true;
        }
        return false;
    }
