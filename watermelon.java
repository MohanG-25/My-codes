import java.lang.*;
import java.util.*;
class watermelon{
    public static void main(String args[]){
        for(int i=1;i<=100;i++){
            if(i%2==0 && i>2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
import java.util.*;
class Watermelon{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int d=Integer.parseInt(s);
        if(1<=d<=100){
            if(d%2==0 && d>2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}