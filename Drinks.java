import java.util.*;
import java.lang.Math;
public class Drinks{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the total no of drinks:");
        int n=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
             int k=s.nextInt();
             sum+=k;
        }
        double d=(double)sum/n;
        System.out.println(Math.abs(d));
    }
}