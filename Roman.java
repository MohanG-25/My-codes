import java.util.*;
class Roman{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string:");
        String ss=s.next();
        Map<Character,Integer>m=new HashMap<Character,Integer>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int n=ss.length();
        int sum=m.get(ss.charAt(n-1));
        for(int i=n-2;i>=0;i--){
            if( m.get(ss.charAt(i))>= m.get(ss.charAt(i+1))){
               sum+=m.get(ss.charAt(i));
            }
            else{
               sum-=m.get(ss.charAt(i));
            }
        }
        System.out.println(sum);
    }
}