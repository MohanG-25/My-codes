import java.lang.*;
import java.util.*;
import java.io.*;
// class Circle{
//     double r;
//     double circumfrance(double r){
//         return 2*3.14*r;
//     }
//     double area(double r){
//         return 3.14*r*r;
//     }
// }
// public class examples{
//     public static void main (String args[]){
//         Circle a=new Circle();
        
        
//         System.out.println("the circumfrance is:" + a.circumfrance(3.2));
//         System.out.println("the area is:" + a.area(3.2));
//     }
// }

//COMMAND LINE INPUT
// public class examples{
//     public static void main(String args[]){
//         for (int i=0;i<args.length;i++){
//         System.out.println(args[i]);
//         }
//         System.exit(0);
//     }
// }


//SCANNER
// public class examples{
//     public static void main(String args[]){
//         Scanner a = new Scanner(System.in);
//         int num1,num2;
//         System.out.println("enter the first no");
//         num1= a.nextInt();
//          System.out.println("enter the second no");
//         num2=a.nextInt();
//         System.out.println("the sum is:" + (num1+num2));
//     }
// }

//ARRAY WITH SCANNER
// public class examples{
//     public static void main(String args[]){
//         ArrayList <Integer> l=new ArrayList<Integer>();
//         Scanner s=new Scanner(System.in);
//         int sum=0;
//         float avg=0;
//         while(s.hasNextInt()){
//             l.add(s.nextInt());
//         }
//         for(int i=0;i<l.size();i++){
//             sum=sum+l.get(i);
//         }
//         avg=sum/(l.size());
//         System.out.println("the avg is:" + avg);
//     }
// }


// public class examples{
//     public static void main (String args[]){
//         Scanner s =new Scanner(System.in);
//         System.out.println("enter the no of array size:");
//         int b= s.nextInt();
//         int arr[]=new int[100];
//         System.out.println("enter the array elements:");
//         for(int i=0;i<b;i++){
//             arr[i]=s.nextInt();
//         }
//         for(int j=0;j<b;j++){
//             System.out.println(arr[j]);
//         }
//     }
// }

//DataInputStream    
// public class examples{
//     public static void main(String args[]) {
//         Float amount=new Float(0);
//         Float rate=new Float(0);
//         int no_year=0;
//         try{
//             DataInputStream d =new DataInputStream(System.in);
//             String temp;
//             System.out.println("enter the amount");
//             System.out.flush();
//             temp=d.readLine();
//             amount=Float.valueOf(temp);
//             System.out.println("enter the rate");
//             System.out.flush();
//             temp=d.readLine();
//             rate=Float.valueOf(temp);
//             System.out.println("enter the no of years ");
//             System.out.flush();
//             temp=d.readLine();
//             no_year=Integer.parseInt(temp);
//             float interest=amount * rate * no_year;
//             System.out.println("the interest is :" + interest );
//         }
//         catch(Exception ex){

//         }
//     }
// }

// public class examples{
//     public static void main(String args[]){
//         int a=0012;
//         char b='8';
//         System.out.println((a));
//     }
// }
 