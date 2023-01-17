// class A{
//     void run(){
//         System.out.println("heloo");
//     }
// }
// class B extends A{
//     void run(){
//         System.out.println("mohan");
//     }
// }
// public class Dynamic{
//     public static void main(String args[]){
//         A a=new A();
//         a.run();
//         B b=new B();
//         b.run();
//         A c=new B();
//         c.run();
//      }
// }

abstract class A{
    abstract void run();
}
class B extends A{
    void run(){
        System.out.println("heloo");
    }
}
public class Dynamic{
    public static void main(String args[]){
        B b=new B();
        b.run();
    }
}