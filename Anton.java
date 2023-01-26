import java.util.*;
public class Anton{
    public static void main(String args[]){
          Scanner s=new Scanner(System.in);
          System.out.println("enter the string:");
          String ss=s.nextLine();
          String sp=ss.replace("{","").replace("}","").replaceFirst(",","").replaceAll("\\s","");
          System.out.println(sp);
          int k=0;
          for(char i='a';i<='z';i++){
                 if(sp.contains(String.valueOf(i))){
                    k+=1;
                 }
          }
          System.out.println(k);
    }
}