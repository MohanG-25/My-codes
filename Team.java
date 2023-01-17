import java.util.Scanner;
public class Team{
    public static void main(String args[]){
          int count=0;
          int result=0;
          Scanner s=new Scanner(System.in);
          System.out.println("enter the no of lines:");
          int n=s.nextInt();
          int [][]arr=new int[n][3];
          for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                 arr[i][j]=s.nextInt();
            }
          }
        //   for(int i=0;i<n;i++){
        //     for(int j=0;j<3;j++){
        //          System.out.println(arr[i][j]);
        //     }
        //     System.out.println("\t");
        //   }
          for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<3;j++){
                 if(arr[i][j]==1){
                    count+=1;
                 }
            }
            if(count>=2){
                    result+=1;
            
            }
          }

          System.out.println(result);
    }
}