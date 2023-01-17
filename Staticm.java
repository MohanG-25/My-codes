public class Staticm {
        public double x,y,r;
        public Staticm bigger(Staticm c){
            if (c.r> r) return c;
            else return this;
        }
        public static Staticm bigger ( Staticm a,  Staticm b){
            if (a.r > b.r) return a;
            else return b;
        }
    
    public static void main (String args[]){
        Staticm a=new Staticm(2.0);
        Staticm b=new Staticm(3.0);
        Staticm c=a.bigger(b);
        Staticm d=Staticm.bigger(a,b);
    }
}