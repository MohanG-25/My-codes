import java.util.*;
class  Node{
    int val;
    Node left;
    Node right;
    Node(){}
    Node(int val){
        this.val=val;
    }
    Node(int val,Node left,Node right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
   
    public  boolean isSame(Node n1,Node n2){
        if(n1==null &&  n2==null){
          return true;
        }
        if (n1==null || n2==null){
            return false;
        }
        if(n1.val!=n2.val){
            return false;
        }
        return isSame(n1.left,n2.left) && isSame(n1.right,n2.right);
    }
}
public class sameTree{
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);
        System.out.println(root.isSame(root,root1));
    }
}