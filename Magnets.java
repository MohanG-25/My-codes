import java.util.*;
public class Magnets{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of magnets:");
        int n=s.nextInt();
        String[] a=new String[n];
        System.out.println("enter the pole values of each magnet:");
        int count=1;
        for(int i=0;i<n;i++){
              a[i]=s.next();
              if(i>0 && a[i].charAt(0)==a[i-1].charAt(1)){
                 count+=1;
              }
        }
        System.out.println(count);
    }
}