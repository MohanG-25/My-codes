import java.util.*;
public class Word{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string:");
        String ss=s.next();
        char[] c=ss.toCharArray();
        int countU=0;
        int countL=0;
        for(int i=0;i<c.length;i++){
            if(c[i]==Character.toUpperCase(c[i])){
                countU+=1;
            }
            else{
                countL+=1;
            }
        }
        if(countL==countU){
            for(int i=0;i<c.length;i++){
                  c[i]=Character.toLowerCase(c[i]);
            }
        }
        if(countU>countL){
            for(int i=0;i<c.length;i++){
                  c[i]=Character.toUpperCase(c[i]);
            }
        }
        if(countL>countU){
            for(int i=0;i<c.length;i++){
                 c[i]=Character.toLowerCase(c[i]);
            }
        }
        for(int i=0;i<c.length;i++){
                  System.out.print(c[i]);
         }
       
    }

}