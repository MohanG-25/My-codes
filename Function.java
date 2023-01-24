import java.util.*;
public class Function{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        long n=s.nextLong();
        // int sum=0;
        // int k=-1;
        // int l=2;
        // for(int i=1;i<=n;i++){ 
        //     if((i%2)!=0){
        //         sum=sum+k;
        //         k-=2;
        //     }
        //     else{
        //         sum=sum+l;
        //         l+=2;
        //     }
        // }
        long result=0;
        if(n%2==0){
            result=n/2;
        }
        else{
            result=(-1)*(n/2+1);
        }
        System.out.println(result);
    }
}