import java.util.*;
public class RemoveSort{
    static class Node{
        int data;
        Node next;
    }
   static  Node newNode(int val){
        Node temp=new Node();
        temp.data=val;
        temp.next=null;
        return temp;
    }
    static Node printNode(Node h){
        Node m=h;
        if(h==null && h.next==null){
            return h;
        } 
        while(m.next!=null){
            if(m.data==m.next.data){
                 m.next=m.next.next;
            }
            else{
                m=m.next;
            }
        }
        return h;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        RemoveSort r=new RemoveSort();
        Node h=newNode(1);
        h.next=newNode(2);
        h.next.next=newNode(2);
        h.next.next.next=newNode(4);
        LinkedList<Integer> l=new LinkedList<Integer>(); 
        Node p=r.printNode(h);
        while(p!=null){
            l.add(p.data);
            p=p.next;
        }
        System.out.println(l); 
    }
}