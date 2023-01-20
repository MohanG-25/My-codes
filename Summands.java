import java.util.*;
public class Summands{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String ss=s.next();
        ss=ss.replace("+","");
        char[] c=ss.toCharArray();
        Arrays.sort(c);
        if(c.length==1){
            if(c[0]=='1'){System.out.println("1");}
            if(c[0]=='2'){System.out.println("2");}
            if(c[0]=='3'){System.out.println("3");}
        }
        else{
            for(int i=0;i<c.length-1;i++){
                System.out.print(c[i]);
                if(c[i+1]!=' '){
                    System.out.print("+");
                }
                else{
                    break;
                }
            }
            System.out.print(c[c.length-1]);
        }
        
        
    } 
}