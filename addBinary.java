import java.util.*;
public class addBinary{
    String solution(String a,String b){
        StringBuilder p=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
           int sum=0;
           if(i>=0 && a.charAt(i)=='1'){
             sum+=1;
           }
           if(j>=0 && b.charAt(j)=='1'){
            sum+=1;
           }
           sum+=carry;
           if(sum>=2){
                carry=1;
           }
           else{
               carry=0;
           }
           p.insert(0,(char)((sum%2)+'0'));
           i--;
           j--;
        }
        if(carry==1){
            p.insert(0,'1');
        }
        return p.toString();
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        addBinary r=new addBinary();
        System.out.println("enter the strings:");
        String a=s.next();
        String b=s.next();
        String res=r.solution(a,b);
        System.out.println(res);
        //System.out.println((char)((1%2)+'0'));
    }
}