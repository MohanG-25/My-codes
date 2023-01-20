import java.util.*;
public class Elephant{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[] a={5,4,3,2,1};
        System.out.println("enter the distance from elephant house to his friend's house:");
        int d=s.nextInt();
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==d){
                 System.out.println("1");
            }
        }
        int sum=0;
        if(d>a[0]){
            while(d>a[0]){
                d-=a[0];
                count+=1;
            }
        System.out.println(count+1);
        }
    }
}