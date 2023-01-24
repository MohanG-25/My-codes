import java.util.*;
public class findLength{
    int length(String ss){
         int res=0;
         String[] oo=ss.split(" ");
         if(oo.length>1){
             for(int i=0;i<oo.length;i++){
                   if(i==oo.length-1){
                     res=oo[i].length();
                     break;
                   }
             }
         }
         else{
            for(int i=0;i<oo.length;i++){
                res=oo[i].length();
            }
         }
        return res; 
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        findLength r=new findLength();
        String ss=s.nextLine();
        int k=r.length(ss);
        System.out.println(k);
    }
}