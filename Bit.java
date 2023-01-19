import java.util.*;
public class Bit{
    public static void main(String args[]){
           Scanner s=new Scanner(System.in);
          System.out.println("enter the number of operations:");
           int n=s.nextInt();
           int X=0;
           String ss="";
          System.out.println("enter statement:");
           for(int i=0;i<n;i++){
               ss=s.next();
               if(ss.equals("++X")){
                 X=++X;
               }
               if(ss.equals("--X")){
                 X=--X;
               }
               if(ss.equals("X++")){
                 X=++X;
               }
               if(ss.equals("X--")){
                 X=--X;
               }
           }
           System.out.println(X);
    }
}