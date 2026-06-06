public class Lil{
    static class Node{
        int data;
        Node next;
        
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    static Node addAtHead(Node head, int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(head == null){
            return newNode;
        }
        return head;
    }

    static Node addAtTail(Node head, int val){
        Node newNode = new Node(val);

        if(head==null){
            return newNode;
        }
        node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static Node addAtPos(Node head, int val, int pos){
        Node newNode = new Node(val);

        if(pos == 1){
            return addAtHead(head,val);
        }
        
        Node temp = head;
        for(int i=1; i<= pos-2; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    static Node deleteAtHead(){
    
        
    }

    public static void main(String[] args){
    
    }
}