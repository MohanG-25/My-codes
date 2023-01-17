package myPackage1;
public class Demo{
   String Name;
   double bal;
   public Demo(String a,double b){
      Name=a;
      bal=b;
   }
   public void show(){
     if(bal<0){
        System.out.println("Invalid");
     }
     else{
        System.out.println("Name"+this.Name+"bal"+this.bal);
     }
   }

}
