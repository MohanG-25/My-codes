import java.util.*;
public class removeDuplicates{
    public int remove(int nums[]){
      int m=nums.length;
    //   int[] temp=new int[m];
      int j=0;
      int count=0;
      for(int i=0;i<m-1;i++){
        if(nums[i]!=nums[i+1]){
            nums[j]=nums[i];
            count+=1;
            j+=1;
        }
      }
      nums[j]=nums[m-1];
    //   for(int i=0;i<m-1;i++){
    //     nums[i]=temp[i];
    //   }
      return count+=1;
    }
    public static void main(String args[]){
        removeDuplicates r=new removeDuplicates();
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of array elements:");
        int p=s.nextInt();
        int nums[]=new int[p];
        for(int i=0;i<p;i++){
            nums[i]=s.nextInt();
        }
        System.out.println("enter the no of array elements for expected array:");
        int q=s.nextInt();
         int expected[]=new int[q];
        for(int i=0;i<q;i++){
            expected[i]=s.nextInt();
        }
        int k=r.remove(nums);
        if(k==expected.length){
           for(int i=0;i<k;i++){
               if(nums[i]==expected[i]){
                 continue;
               }
               else{
                System.out.println("mismatch...!");
               }
           }
        }
        System.out.println(k);
        for( ;k<nums.length;k++){
           nums[k]=0;
        }
        
    }
}