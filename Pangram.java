import java.util.*;
public class Pangram{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string length:");
        int n=s.nextInt();
        System.out.println("enter the string:");
        String ss=s.next();
        int k=0;
        for(char i='a';i<='z';i++){
            if(ss.toLowerCase().contains(String.valueOf(i))){
                k+=1;
            }
        }
        if(k==26){System.out.println("YES");}
        else{System.out.println("NO");}
    }
}