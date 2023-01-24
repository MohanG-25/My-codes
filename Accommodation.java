import java.util.*;
public class Accommodation{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        // System.out.println("enter the no of rows:");
        // int n=s.nextInt();
        // System.out.println("enter the no of cols:");
        // int m=s.nextInt();
        // int[][] a=new int[n][m];
        // System.out.println("enter the arr elements:");
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         a[i][j]=s.nextInt();
        //     }
        // }
        // int count=0,j=0;
        // for(int i=0;i<n;i++){
        //        if( a[i][j]!=a[i][j+1]){
        //             count+=1;
        //        }
        // }
        // System.out.println(count);
        System.out.println("enter the no of rooms:");
        int n=s.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int m=s.nextInt();
            int p=s.nextInt();
            if((p-m)>=2){
                count+=1;
            }
        }
        System.out.println(count);
    }
}