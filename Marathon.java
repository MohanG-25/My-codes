import java.util.*;
public class Marathon{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of test cases:");
        int n=s.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            count=0;
             int a=s.nextInt();
             int b=s.nextInt();
             int c=s.nextInt();
             int d=s.nextInt();
             if (a<b){count+=1;}    
             if (a<c){count+=1;}   
             if (a<d){count+=1;}   
             System.out.println(count);
        }
    }
}