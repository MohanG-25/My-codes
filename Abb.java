import java.util.Scanner;
import java.util.ArrayList;
class Abb{
    public static void main(String args[]){
        // String[] ss={"hello","localization","internationalization","pneumonoultramicroscopicsilicovolcanoconiosis"};
        System.out.println("enter the no of words:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<String> aa=new ArrayList<String>();
        int count=0;
        String ss="";
        String word="";
        for(int i=0;i<n;i++){
             System.out.println("enter the word:");
             ss=s.next();
            if(ss.length()<10){
                aa.add(ss);
            }
            else{
               count=ss.length()-2;
               word=Character.toString(ss.charAt(0))+count+Character.toString(ss.charAt(ss.length()-1));
               aa.add(word);
            }
            
        }
        for(String bb:aa){
            System.out.println(bb);
        }
        
    }
}