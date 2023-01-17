import java.lang.*;
class threeDarray{
   public static void main(String args[]){
      int a[][][]=new int[3][4][5];
      int i,j,k;
      System.out.println("the 3Darray is:");
      for(i=0;i<3;i++)
        for(j=0;j<4;j++)
          for(k=0;k<5;k++)
            a[i][j][k]=i*j*k;
      for(i=0;i<3;i++){
        for(j=0;j<4;j++){
            for(k=0;k<5;k++){
          System.out.print(a[i][j][k] + " ");
          System.out.println();
            }
                    System.out.println();
        }
      }
    
   }
}