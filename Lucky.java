import java.util.*;
public class Lucky{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        String n=s.next();
        // boolean b=false;
        // int k=0;
        // while((n/10)!=0){
        //     k=n%10;
        //     n=n/10;
        //     if(k==4 || k==7){
        //         b=true;
        //     }
        //     else{
        //          b=false;
        //         break;
        //     } 
        // }
        int count=0;
        for(int i=0;i<n.length();i++){
              if(n.charAt(i)=='4'|| n.charAt(i)=='7'){
                  count+=1;
              }
        }
        if(count>=4 || count==7){System.out.println("YES");}
        else{System.out.println("NO");}
    }
}