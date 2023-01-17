import java.io.*;
public class Copy{
  public static void main(String args[])throws IOException{
        FileInputStream a=new FileInputStream("input.txt");   
        FileOutputStream b=new FileOutputStream("output.txt");
        try{
            int ch=0;
            while((ch=a.read())!=-1){
                b.write(ch);
            }
             a.close();
             b.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
  }
}
