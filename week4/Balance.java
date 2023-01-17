import myPackage1.Demo;
public class Balance{
    public static void main(String args[]){
        Demo c[]=new Demo[3];
        c[0]=new Demo("moha",12.4);
        c[1]=new Demo("ah",124.5);
        c[2]=new Demo("adw",55.6);
        for (int i=0;i<3;i++){
            c[i].show();
        }
    }
}