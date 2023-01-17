// class Anagrams{
//     public static void main(String args[]){
//              StringBuilder a=new StringBuilder("anagram");
//              String b="margana";
//              boolean m=false;
//             for(int y=0;y<a.length()-1;y++ ){
//                 for(int z=y+1;z<a.length();z++){
//                     if(a.charAt(y)==a.charAt(z)){
//                          a.deleteCharAt(z);
//                     }
//                 }
//             }
//             if(a.length()==b.length()){
//                 for(int i=0;i<a.length();i++){
//                     m=false;
//                     for(int j=0;j<b.length();j++){
//                         if(a.charAt(i)==Character.toUpperCase(b.charAt(j)) || a.charAt(i)==Character.toLowerCase(b.charAt(j))){
//                             m=true;
//                         }
//                     }
//                 }
//             }
//             System.out.println(m);
//     }
// }
import java.util.Arrays;
class Anagrams{
    public static void main(String args[]){
        String a="anagramm";
        String b="marganaa";
        a=a.toUpperCase();
        b=a.toUpperCase();
        char[] arrA=a.toCharArray();
        Arrays.sort(arrA);
        char[] arrB=b.toCharArray();
        Arrays.sort(arrB);
        String c=new String(arrA);
        String d=new String(arrB);
        System.out.println(c.equals(d));
    }
}