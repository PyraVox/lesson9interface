import TurtleGraphics.*;
import java.awt.Color;
import TerminalIO.*;

public interface shape {
    
    public double area();
    public void draw (Pen p);
    public double getXPos();
    public double getYPos();
    public void move (double xLoc, double yLoc);
    public void stretchBy (double factor);
    public String toString();
    }
    
public class circle implements shape{
    
    
}
public class rect implements shape{
    
}
