import java.lang.*;
 class myT extends Thread{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(i);
        }
        System.out.println();
    }
}
public class Thread1{
    public static void main(String args[]){
        myT a=new myT();
       // Thread b=new Thread(a);
        a.start();
    }
}