import java.util.*;
class Prefix{
    public static void main(String args[]){
        //  String[] str={"ammu","amma","ammi"};
        // ArrayList <Character> a=new ArrayList<Character>();
        // String ss="";
        // for(String s:str){
        //     for(int i=0;i<s.length();i++){
        //         a.add((s.charAt(i)));
        //     }
        // }
        
        // System.out.println(a);
        // for(int i=0;i<a.size()-1;i++){
        //     for(int j=i+1;j<a.size();j++){
        //             if(a.get(i)==a.get(j)){
        //                 ss=ss+a.get(i);
        //             }
        //     }
        // }
        // char []chr=ss.toCharArray();
        // System.out.println(chr);
        // HashSet<Character> hs=new HashSet<Character>();
        // for(Character c:chr){
        //      hs.add(c);
        // }
        // // Character strif= Character.join("",hs);
        // System.out.println(hs);
        // // System.out.println(strif);
        String s[]={"amma","ammi","ammu"};
        if(s.length==0){
            System.out.println("");
        }
        String prefix=s[0];
        for(int i=1;i<s.length;i++){
          while(s[i].indexOf(prefix)!=0){
             prefix=prefix.substring(0,prefix.length()-1);
             if(prefix.length()==0){
                System.out.println("");
             }
          }
        }
        System.out.println(prefix);
       
    }
}