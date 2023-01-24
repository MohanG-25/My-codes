import java.util.*;
public class Presents{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the arr size:");
        int n=s.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        System.out.println("enter the arr elements:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int count=0,j=1;
        for(int m=0;m<n;m++){
            inner:{
                for(int i=0;i<n;i++){
                    if(a[i]==j){
                        b[count]=i+1;
                        count+=1;
                        j+=1;
                        break inner;
                    }
                }
            }
        }
        for(Integer oo:b){System.out.println(oo);}
    }
}
