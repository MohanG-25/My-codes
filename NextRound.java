import java.util.*;

public class NextRound{
    public static void main(String args[]){
      Scanner s=new Scanner(System.in);
      System.out.println("enter the total number of participants:");
      int n=s.nextInt();
      System.out.println("enter the goal:");
      int k=s.nextInt();
      int a[]=new int[n+1];
      int count=0;
      int res=0;
      int minScore=0;
      System.out.println("enter the array elements:");
      for(int i=1;i<=n;i++){
            a[i]=s.nextInt();
            if(i==k){
                minScore=a[i];
            }
      }
      for(int i=1;i<=n;i++){
        if(a[i]>=minScore && a[i]>0){
            count+=1;
        }
      }
    //   for(int i=0;i<n-1;i++){
    //        if(a[i]>=k && a[i+1]!=k ){
    //          count+=1;
    //        }
    //        if(a[i]==a[i+1] && a[i+1]!=k){
    //          if(a[i]>k && a[i+1]>k){
    //             res+=1;
    //          }

    //        }
    //         if(a[i]==k){
    //             count+=1;
    //         }
         
    //   }
    //  if(a[0]!=k && a[0]!=0){
    //     count=(count-res)+1;
    //  }
    //  if(n==k){
    //     System.out.println(n);
    //  }
    // if(n!=k){
    //     System.out.println(count);
    // }
    System.out.println(count);
    }
}