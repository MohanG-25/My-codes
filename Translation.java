import java.util.*;
public class Translation{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string1:");
        String s1= s.next();
        System.out.println("enter the string2:");
        StringBuilder s2=new StringBuilder(s.next());
        String s3=s2.reverse().toString();
        if(s1.equals(s3)){
            System.out.println("YES");
        }
        else{
           System.out.println("NO"); 
        }
    }
}