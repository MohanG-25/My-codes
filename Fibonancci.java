public class Fibonancci{
    public static void main(String args[]){
        int fib0=0;
        int fib1=1;
        int x=Integer.parseInt(args[0]);
        while(x>0){
            if(x==0){
                System.out.println(0);
                break;
            }
            else{
                int fib=fib0+fib1;
                System.out.println(fib);
                fib0=fib1;
                fib1=fib;
                x--;
            }
        }
    }
}

//DOUBT the above program

// public class Fibonancci{
//     int x;
//     int fibo(int x){
//         if(x==0){
//             return 0;
//         } 
//         else if(x==1) {
//             return 1;
//         }
//         else {
//             return (fibo(x-1)+fibo(x-2));
//         }
//     }
//     public  static void main(String args[]){
//         Fibonancci f=new Fibonancci();
//         f.x=Integer.parseInt(args[0]);
//         for(int i=0;i<f.x;i++){
//             System.out.println(f.fibo(i));
//         }
//     }
// }