import java.io.*;
// public class File1{
//     public static void main(String args[])throws IOException{
//         FileInputStream f=new FileInputStream(args[0]);
//         int i=0;
//         while((i=f.read())!=-1){
//             System.out.print((char)i);
//         }
//         f.close();
//         System.out.println("written");
//     } 
// }
public class File1{
    public static void getPaths(File f)throws IOException{
        System.out.println("name:"+f.getPath());
        System.out.println("password:"+f.getName());
    }
    public static void main(String args[])throws IOException{
        if(args.length>0){
            for(int i=0;i<args.length;i++){
               File  f=new File(args[i]);
                getPaths(f);
            }
        }
    }
}
