//  class point1{
//     void display(){
//       System.out.println("GEETHA");
//     }
// }
//  class point2 extends point1{
//     void display(){
//         System.out.println("GEETHAMOHAN");
//     }
// }
// public class inheritance{
//     public static void main(String args[]){
//        point1 p=new point1();
//        point2 q=new point2();
//        p.display();
//        q.display();
//     }

class point1{
    int x,y;
    void display(){
        System.out.println(x+y);
    }
}
class point2 extends point1{
    int z;
    void display(){
        System.out.println(x+y+z);
    }
}
public class inheritance{
    public static void main(String args[]){
        point1 p=new point1();
        point2 q=new point2();
        p.x=10;
        p.y=20;
        p.display();
        q.x=30;
        q.y=40;
        q.z=50;
        q.display();
    }
}