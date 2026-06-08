package Stack;

import java.util.ArrayDeque;

public class HashMap {

    // Remove k digits from a number to get smallest number
    static class Node{
        String key;
        String value;
        Node next;


        Node(String k, String v){
            key = k;
            value = v;
        }
    }

    int capacity = 5;
    Node[] table = new Node[capacity];

    int hash(String key){
        return Math.abs(key.hashCode()) % capacity;
    }


    public void put(String shortCode, String originalURL){
        int index = hash(shortCode);

        Node head = table[index];
        
        while(head!= null){
            if(head.key.equals(shortCode)){
                
            }
        }
    }
    public  static void main(String[] args){
        Stack<Integer> st = new ArrayDeque<>();

    }    
}
