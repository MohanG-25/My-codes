import java.util.Stack;
import java.util.Scanner;
class Valid{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String ss=s.next();
        // if(ss.equals("()") || ss.equals("[]")||ss.equals("{}")||ss.equals("(){}")||ss.equals("[]{}")||ss.equals("()[]")||ss.equals("()[]{}")){
        //     System.out.println("true");
        // }
        // else{
        //     System.out.println("false");
        // }
        Stack<Character> stack=new Stack<Character>();
        for(char c:ss.toCharArray()){
              if(c=='('){
                  stack.push(')');     
              }
              else if(c=='{'){
                 stack.push('}');
              }
              else if(c=='['){
                 stack.push(']');
              }
              else if(stack.isEmpty() || c!=stack.pop()){
                 System.out.println("false");
              }
            else{
                System.out.println("true");
            }
              
        }
    
                
              
    }
}