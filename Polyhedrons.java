import java.util.*;
public class Polyhedrons{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of polygons:");
        int n=s.nextInt();
        int total=0;
        for(int i=0;i<n;i++){
            String ss=s.next();
            if(ss.equals("Tetrahedron")){
                 total+=4;
            }
            if(ss.equals("Cube")){
                 total+=6;
            }
            if(ss.equals("Octahedron")){
                 total+=8;
            }
            if(ss.equals("Dodecahedron")){
                 total+=12;
            }
             if(ss.equals("Icosahedron")){
                 total+=20;
            }
        }
        System.out.println(total);
    }
}