import TurtleGraphics.*;
import TerminalIO.*;
import java.awt.Color;

public class ShapeMaker {
    
    public static void main(String[] args) {
        Pen p = new StandardPen (new SketchPadWindow(400,400));
        shape s1;
        double r,x,y;
        double w,h;
        int choice;
        KeyboardReader k = new KeyboardReader();
        
        while(true)
        {
            choice=k.readInt("Enter 1 for rectangle, 2 for circle: ");
            if (choice ==1 || choice==2)break;
        }
        if (choice==1)
        {
            w =k.readDouble("Enter width of rect");
            h=k.readDouble("Enter height of rect");
            s1 = new rect(0,0,w,h);
        }
        else
        {
            r=k.readDouble("Enter radius of circle");
            s1=new circle(0,0,r);
        }
        while(true)
        {
            s1.draw(p);
            x=k.readDouble("new x: ");
            y=k.readDouble("new y: ");
            p.setColor(Color.white);
            s1.draw(p);
            s1.move(x,y);
            p.setColor(Color.blue);
            s1.draw(p);
        }
        
    }
    
}
