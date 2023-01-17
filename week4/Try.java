import java.lang.*;
public class Try{
   static void division(int a,int b){
      try{
            int ans= a/b;
      }
       catch(ArithmeticException e){
                System.out.println(e);
       }
       return a/b;
   }
    public static void main(String args[]){
        int result=division(2,0);
        System.out.println(result);
    }
}