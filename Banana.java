import java.util.*;
public class Banana{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the initial cost:");
        int k=s.nextInt();
        System.out.println("enter the no of dollars:");
        int n=s.nextInt();
        System.out.println("enter the no of bananas wants to be buy:");
        int w=s.nextInt();
        int total=0;
        for(int i=1;i<=w;i++){
            total=total+k*i;
        }
        if(total-n>0){
            System.out.println(total-n);
        }
        else{
           System.out.println("0"); 
        }
    }
}