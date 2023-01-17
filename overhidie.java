import java.lang.*;
class A{
    int x,y;
    A(int m ,int n){
        x=m;
        y=n;
        System.out.println(x+y);
    }
}
class B extends A{
    int z;
    B(int o){
       z=o;
       System.out.println(z);
    }
}
public class overhidie{
    public static void main(String args[]){
        A p=new A(1,2);
        B q=new B(4);
    }
}

//SUPER

// class Animal{
//      Animal(){
//         System.out.println("hello");
//     }
// }
// class Dog extends Animal{
//     Dog(){
//     super();
//     System.out.println("geetha");
//    }
// }
// public class overhidie{
//     public static void main(String args[]){
//         Dog d=new Dog();
//     }
// }