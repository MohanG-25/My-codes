import java.util.*;
import java.lang.*;
public class stringCapitalize{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String ss=s.next();
        String c=ss.substring(0,1).toUpperCase()+ss.substring(1);
        System.out.println(c);
    }
}