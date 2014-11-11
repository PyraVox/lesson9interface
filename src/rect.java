import TurtleGraphics.Pen;

public class rect implements shape{
    private double xPos, yPos;
    private width, height;
    
        public rect(){
            xPos = 0;
            yPos = 0;
            width = 1, height = 1;
        }
        public rect (double xLoc, double yLoc, double h, double w){
            xPos = xLoc;
            yPos = yLoc;
            height = h, width = w;
        }
        public double area(){
            return height * width;
        }
    
}
