// Problem - https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1

public static Node reverse(Node head, int k)
    {   
        Node prev=null,next=null,current = head;
        int count = 1;
        while(count++ <= k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        if(next != null){
            head.next = reverse(next,k);
        }
        return prev;
    }
