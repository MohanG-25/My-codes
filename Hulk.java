import java.util.*;
public class Hulk{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of feelings:");
        int n=s.nextInt();
        String res="";
        if(n==1){res+="I hate it";}
        if(n!=1){
            for(int i=1;i<=n;i++){
                if(i!=n){
                    if(i%2!=0){
                        res+=" I hate that";
                    }
                    else{
                        res+=" I love that";
                    }
                }
                else{
                    if(i%2!=0){
                        res+=" I hate";
                        break;
                    }
                    else{
                        res+=" I love";
                        break;
                    }
                }
                
            }
            res+=" it";
        }
       System.out.println(res);
    }
}