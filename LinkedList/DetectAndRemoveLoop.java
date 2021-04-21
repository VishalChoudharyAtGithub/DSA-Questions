//Problem - https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1

public static void removeLoop(Node head){
        Node a = head,b = head,temp;
        while(b != null && b.next != null){
            a = a.next;
            b = b.next.next;
            if(a==b){
                a = head;
                removeLoop(a,b);
                break;
            }
        }
    }
    public static void removeLoop(Node a, Node b){
        Node temp = b;
        if(a==b){
            while(b.next != a)
                b = b.next;
            b.next = null;
        }else{
            while(true){
            if(a==b){
                temp.next = null;
                break;
            }
            a = a.next;
            temp = b;
            b = b.next;
        }
        }
    }
