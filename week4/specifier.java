// class A{
//      int a=10;
//     public double b=1.2;
//     protected String c="GEETHa";
// }
// public class specifier{
//     public static void main(String args[]){
//         A obj=new A();
//        System.out.println(obj.a);
//         System.out.println(obj.b);
//         System.out.println(obj.c);
//     }
// }

// class A{
//     int a=10;
//     private int b=10;
//     protected int c=10;
//     public int d=10;
//     private int getb(){
//         return b;
//     }
//     private void setb(int z){
//         this.b=z;
//     }
//     protected int getc(){
//         return c;
//     }
//     protected void setc(int y){
//         this.c=y;
//     }
//     public int getd(){
//         return d;
//     }
//     public void setd(int x){
//         this.d=x;
//     }
// }
// class specifier extends A{
//     public static void main(String args[]){
//         A obj=new A();
//         System.out.println(obj.a);
//         // System.out.println(obj.b);
//         System.out.println(obj.c); 
//         System.out.println(obj.d);
//         // obj.setb(20);
//         //  System.out.println(obj.b);
//          obj.setc(20);
//          System.out.println(obj.getc());
//           obj.setd(20);
//          System.out.println(obj.getd()); 
//     }
// }

class A{
    public void msg1(){
        System.out.println("public specifier!");
    }
    private void msg2(){
        System.out.println("private specifier!");
    }
    protected void msg3(){
        System.out.println("protected specifier!");
    }
}

class specifier extends A{
    void msg(){
        System.out.println("welcome!");
    }
    public void msg1(){
        System.out.println("public overiding");
    }
    public void msg2(){
        System.out.println("private overiding");
    }
    protected void msg3(){
        System.out.println("protected overiding");
    }
    public static void main(String args[]){
        specifier obj=new specifier();
        obj.msg();
        obj.msg1();
         obj.msg2();
          obj.msg3();
    } 
}