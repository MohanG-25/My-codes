// public class Recursive{
//     public static void main (String args[]){
//        int fact=1;
//        int n=Integer.parseInt(args[0]);
//        if(n==0 || n==1){
//          System.out.println(fact);
//        }
//        fact=0;
//        for(int i=1;i<=n;i++){
//            fact=fact+i;
//        }
//        System.out.println(fact);
//     }
// }

// public class Recursive{
//     int n;
//     int factorial(int n){
//        if(n==0){
//          return 1;
//        }
//        else{
//          return (n*factorial(n-1));
//        }
//     }
//     public static void main (String args[]){
//         Recursive x=new Recursive();
//         x.n=Integer.parseInt(args[0]);
//         System.out.println("The factorial of:"+x.n+""+"is"+x.factorial(x.n));
//     }
// }

