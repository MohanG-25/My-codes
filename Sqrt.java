import java.util.*;
import java.lang.Math;
public class Sqrt{
    int square(int n){
         double val= Math.sqrt(n);
         int res=(int)val;
         return res;
    }
    public static void main(String args[]){
         Scanner s=new Scanner(System.in);
         Sqrt r=new Sqrt();
         System.out.println("enter the number:");
         int n=s.nextInt();
         int k=r.square(n);
         System.out.println(k);
    }
}