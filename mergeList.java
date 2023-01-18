public class mergeList{
        static class Node{
           int data;
           Node next;
        }
        static Node newNode(int val){
          Node temp=new Node();
          temp.data=val;
          temp.next=null;
          return temp;
        }
       static  Node mergNode(Node h1,Node h2){
           if(h1==null && h2==null){
            return null;
           }
           if(h1==null){return h2;}
           if(h2==null){return h1;}
           if(h1.data<h2.data){
             h1.next=mergNode(h1.next,h2);
             return h1;
           }
          else{
            h2.next=mergNode(h1,h2.next);
            return h2;
          }
        }
       static void printNode(Node node){
           while(node!=null){
             System.out.println(node.data);
             node=node.next;
           }
        }
  public static void main(String args[]){
      Node head1=newNode(1);
      head1.next=newNode(2);
      head1.next.next=newNode(3);

      Node head2=newNode(4);
      head2.next=newNode(5);
      head2.next.next=newNode(6);
    
      Node node=mergNode(head1,head2);
      printNode(node);

  }
}