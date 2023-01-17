import java.lang.*;
import java.applet.*;
import java.awt.*;
public class  rectangle extends Applet{
   int x,y,w,h;
   public void init (){
     x=Integer.parseInt(getParameter("xvalue"));
     y=Integer.parseInt(getParameter("xvalue"));
     w=Integer.parseInt(getParameter("xvalue"));
     h=Integer.parseInt(getParameter("xvalue"));
   }
   public void paint(Graphics g){
      g.drawRect(x,y,w,h);
   }
}