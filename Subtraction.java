import java.util.*;
public class Subtraction{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=s.nextInt();
        System.out.println("enter the no of subtractions:");
        int k=s.nextInt();
        while(k>0){
            if((n%10)!=0){
                 n=n-1;
            }
            else{
                n=n/10;
            }
            k-=1;
        }
        System.out.println(n);
    }
}