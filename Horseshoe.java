import java.util.*;
public class Horseshoe{
    public static void main(String args[]){
           Scanner s=new Scanner(System.in);
           System.out.println("enter the no of horseshoes:");
           int n=s.nextInt();
           int[] a=new int[n];
           int count=0;
           System.out.println("enter the diff colors of horseshoes:");
           for(int i=0;i<n;i++){
               a[i]=s.nextInt();
           }
           Arrays.sort(a);
           for(int i=0;i<n;i++){
              if(i>0 &&  a[i]==a[i-1]){
                 count+=1;
               }
           }
           System.out.println(count);
    }
}