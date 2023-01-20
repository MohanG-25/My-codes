import java.util.*;
public class findGender{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String ss=s.next();
        HashSet<Character> hs=new HashSet<Character>();
        for(int i=0;i<ss.length();i++){
            hs.add(ss.charAt(i));
        }
        if(hs.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}