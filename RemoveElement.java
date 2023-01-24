import java.util.*;
public class RemoveElement{
    int remove(int nums[],int val){
        int count=0;
        for(int j=0;j<nums.length;j++){
             if(nums[j]!=val){
                nums[count]=nums[j];
                count+=1;
             }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        RemoveElement r=new RemoveElement();
        System.out.println("enter the arr size:");
        int n=s.nextInt();
        int[] nums=new int[n];
        System.out.println("enter the arr elements:");
        for(int i=0;i<nums.length;i++){
            nums[i]=s.nextInt();
        }
        System.out.println("enter the arr size for expected arr:");
        int m=s.nextInt();
        int[] expected=new int[m];
        System.out.println("enter the arr elements for expected arr:");
        for(int i=0;i<expected.length;i++){
            expected[i]=s.nextInt();
        }
        System.out.println("enter the val to be removed:");
        int val=s.nextInt();
        int k=r.remove(nums,val);
        Arrays.sort(nums,0,k);
        for(int i=0;i<k;i++){
         if(nums[i]==expected[i]){
            continue;
         }
         else{
            break;
         }
        }
        System.out.println(k);
        for(int i=0;i<k;i++){System.out.println(nums[i]);}

    }
}