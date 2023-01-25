import java.util.*;
public class General{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of soldiers:");
        int n=s.nextInt();
        System.out.println("enter the soldiers heights:");
        int maxValue=0,minValue=1000,miniIndex=0,maxIndex=0;
        for(int j=0;j<n;j++){
            int m=s.nextInt();
            if(m>maxValue){
                maxValue=m;
                maxIndex=j;
            }
            if(m<=minValue){
                minValue=m;
                miniIndex=j;
            }
        }
        if(maxIndex>miniIndex){
            System.out.println((maxIndex-1)+(n-miniIndex)-1);
        }
        else{
            System.out.println((maxIndex-1)+(n-miniIndex));
        }
    }
}