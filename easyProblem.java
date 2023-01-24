import java.util.*;
public class easyProblem{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("enter the  array elements:");
        for(int i=0;i<n;i++){
                   a[i]=s.nextInt();
        }
        if(n==1){
             if(a[0]==0){ System.out.println("EASY");}
             else{ System.out.println("HARD");}
        }
        if(n!=1){
            for(int i=0;i<n;i++){
                if(a[i]==1){
                    System.out.println("HARD");
                    break;
                }
                if(i==n-1){
                     System.out.println("EASY");
                }
            }
             
        }
    }
}