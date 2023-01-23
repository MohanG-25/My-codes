import java.util.*;
public class Chess{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of games:");
        int n=s.nextInt();
        System.out.println("enter the string:");
        String ss=s.next();
        int countA=0,countD=0;
        for(int i=0;i<ss.length();i++){
            if(ss.charAt(i)=='A'){
                    countA+=1;
            }
             if(ss.charAt(i)=='D'){
                    countD+=1;
            }
        }
        if(countA>countD){
             System.out.println("Anton");
        }
        if(countA<countD){
             System.out.println("Danik");
        }
        if(countA==countD){
             System.out.println("Friendship");
        }
    }
}