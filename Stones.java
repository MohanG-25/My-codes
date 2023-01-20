import java.util.*;
public class Stones{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of stones:");
        int n=s.nextInt();
        System.out.println("enter the stones:");
        String ss=s.next();
        int count=0;
        for(int i=0;i<ss.length()-1;i++){
            if(ss.charAt(i)==ss.charAt(i+1)){
                count+=1;
            }
        }
        System.out.println(count);
    }
}