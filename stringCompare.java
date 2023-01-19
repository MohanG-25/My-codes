import java.util.*;
public class stringCompare{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        if(a.compareToIgnoreCase(b)==0){
          System.out.println(0);
        }
        if(a.compareToIgnoreCase(b)>0){
          System.out.println(1);
        }
        if(a.compareToIgnoreCase(b)<0){
          System.out.println(-1);
        }
    }
}