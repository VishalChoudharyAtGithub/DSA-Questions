// Probelm - https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1

public static Node addOne(Node head) 
    {
        Node current = head,temp = null;
        while(current.next != null){
            if(current.data != 9){
                temp = current;
            }
            current = current.next;
        }
        if(current.data != 9){
            current.data +=1;
            return head;
        }
        if(temp == null){
            Node n = new Node(1);
            current = head;
            n.next = head;
            head = n;
        }else{
            temp.data+=1;
            current = temp.next;
        }
        while(current != null){
                current.data = 0;
                current = current.next;
        }
        return head; 
    }
