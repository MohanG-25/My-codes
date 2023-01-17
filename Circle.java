import java.lang.*;
 class Circle{
    public double x,y,z;
    static int count=0;
    public  Circle(){
            x=1.2;
            y=2.3;
            z=3.4; 
            count++; 
    }
     public  Circle(double c){
        x=34.5;
        y=5.6;
        this.z=c;
         count++;
    }
    public Circle(double a,double b,double c){
        this.x=a;
        this.y=b;
        this.z=c;
         count++; 
     }
     public double circumfrance(){
        return (2*3.14*z);
     }
     public double area(){
        return (3.14*z*z);
     }
    public static void main (String args[]){
       Circle c1=new Circle();
       System.out.println(c1.count);
       Circle c2=new Circle(4.5);
       System.out.println(c2.count);
       Circle c3=new Circle(1.1,1.2,1.3);
        System.out.println(c3.count);
        System.out.println(c1.count);

    }
}
