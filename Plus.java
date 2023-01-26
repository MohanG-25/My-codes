import java.util.*;
public class Plus{
    int[] plusOne(int nums[]){
        for(int j=nums.length-1;j>=0;j--){
                if(nums[j]!=9){
                    nums[j]+=1;
                    break;
                }
                else{
                    nums[j]=0;
                }
        }
        if(nums[0]==0){
            int res[]=new int[nums.length+1];
            res[0]=1;
            return res;
        }
        return  nums;
    }
    public static void main(String args[]){
         Scanner s=new Scanner(System.in);
         Plus r=new Plus();
         System.out.println("enter the arr size:");
         int n=s.nextInt();
         int nums[]=new int[n];
         System.out.println("enter the arr elements:");
         for(int i=0;i<n;i++){nums[i]=s.nextInt();}
         int dummy[]=r.plusOne(nums);
         for(Integer oo:dummy){System.out.println(oo);}
       
    }
}