import java.util.*;
public class Position{
    public int search(int a[],int target){
           for(int i=0;i<a.length;i++){
               if(a[i]==target){
                     return i;
               }
           }
           if(target<a[0]){return 0;}
           if(target>a[a.length-1]){return (a.length-1)+1;}
           for(int i=0;i<a.length-1;i++){
               if(a[i]<target && target<a[i+1]){
                    return i+1;
               }
           }
           return -1;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Position r=new Position();
        System.out.println("enter n:");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("enter no of elements:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("enter the target:");
        int target=s.nextInt();
        int k=r.search(a,target);
        System.out.println(k);
    }
}