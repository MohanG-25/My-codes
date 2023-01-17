import java.util.Scanner;
class Token{
    public static void main(String srgs[]){
         
         Scanner s=new Scanner(System.in);
         String ss=s.nextLine();
         String []words=ss.split("[, ']");
         System.out.println(words.length);
         for(int i=0;i<words.length;i++){
              System.out.println(words[i]);
         }
         s.close();
            
    }
}