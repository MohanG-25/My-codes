import java.util.*;
public class Ultra{
    public static void main(String args[]){
            Scanner s=new Scanner(System.in);
            System.out.println("enter the first number:");
            String s1=s.next();
            System.out.println("enter the first number:");
            String s2=s.next();
            String s3="";
            int j=0;
            for(int i=0;i<s1.length();i++){
                  if(s1.charAt(i)!=s2.charAt(j)){
                      s3+="1";
                      j+=1;
                  }
                  else{
                    s3+="0";
                    j+=1;
                  }
            }
            System.out.println(s3);
    }
}