import java.util.*;
public class bigBrother{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the weigh of the Limak:");
        int a=s.nextInt();
        System.out.println("enter the weigh of the Bob:");
        int b=s.nextInt();
        int count=0;
        if(a==b){System.out.println("1");}
        else{
                while(!(a>b)){
                    a=a*3;
                    b=b*2;
                    count+=1;
                }
                System.out.println(count);
        }
    }
}