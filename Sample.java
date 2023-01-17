public class Sample{
    public static void main(String args[]){
        int a[]={5,10,15,20};
        int sum=30;
       // int j;
        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++){
                if(sum==(a[i]+a[j])){
                    System.out.println("yes");
                    return;
                }
            }
        }   
        System.out.println("no");
    }
}