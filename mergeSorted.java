import java.util.*;
public class mergeSorted{
    public void merge(int a[],int m,int b[],int n){
            int count=0;
            for(int c=0;c<m;c++){
              for(int d=0;d<n;d++){
                 if(a[c]<=b[d]){
                    continue;  
                 } 
              }
               a[count]=a[c];
                 count+=1;
            }
            for(int d=0;d<n;d++){
                a[count]=b[d];
                count+=1;
            }
             Arrays.sort(a);
             for(Integer oo:a){System.out.println(oo);}
    }
    public static void main(String args[]){
       Scanner s=new Scanner(System.in);
       mergeSorted r=new mergeSorted();
       int count1=0,count2=0;
       System.out.println("enter m:");
       int m=s.nextInt();
       int[] a=new int[6];
       System.out.println("enter n:");
       int n=s.nextInt();
       int[] b=new int[n];
       System.out.println("enter elements for a:");
       for(int i=0;i<6;i++){
         a[i]=s.nextInt();
         if(a[i]!=0){
            count1+=1;
         }
       }
       System.out.println("enter elements for b:");
       for(int j=0;j<n;j++){
         b[j]=s.nextInt();
         if(b[j]!=0){
            count2+=1;
         }
       }
       r.merge(a,count1,b,count2);
       for(Integer mm:a){
         System.out.println(mm);
       }
    }
}