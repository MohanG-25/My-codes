import java.util.*;
public class Fence{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of pernsons:");
        int n=s.nextInt();
        System.out.println("enter the fence height:");
        int h=s.nextInt();
        int h1=0;
        int width=0;
        for(int i=0;i<n;i++){
             System.out.println("enter the heights for each of the person:");
             h1=s.nextInt();
             if(h1<=h){
                width+=1;
             }
             if(h1>h){
                width+=2;
             }
        }
        System.out.println(width);
    }
}