import java.lang.*;
class avg{
   public static void main(String args[]){
      int a[]={1,2,3,4,5};
      float sum=0,z=0;
      for(int i=0;i<a.length;i++){
         sum+=a[i];
         System.out.print(a[i] +" " );
      }
      System.out.println("");
      System.out.println("the sum is:"+sum);
      z=sum/a.length;
      System.out.println("the avg is:"+z);
   }
}  