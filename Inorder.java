import java.util.*;
class Node{
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
}
public class Inorder{
    public void helper(Node root,List<Integer> l){
            if(root!=null){
                helper(root.left,l);
                l.add(root.val);
                helper(root.right,l); 
            }
    }
    public List<Integer> inTraversal(Node root){
       List<Integer> l=new ArrayList<Integer>();
       if(root==null){
         return l;
       }
       helper(root ,l);
       return l;
    }
    public static void main(String args[]){
         Node root=new Node(2);
         root.left=new Node(1);
         root.right=new Node(3);
         Inorder o=new Inorder();
         System.out.println(o.inTraversal(root));
    }
}