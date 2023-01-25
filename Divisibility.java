import java.util.*;
public class Divisibility{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of test cases:");
        int n=s.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the no1:");
            int p=s.nextInt();
            System.out.println("enter the no2:");
            int q=s.nextInt();
            if(p%q==0){
                System.out.println("0");
            }
            else{
                int w=p%q;
                 System.out.println(q-w);
            }
        }
        
    }
}