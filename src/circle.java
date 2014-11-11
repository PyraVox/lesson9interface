import TurtleGraphics.Pen;

public class circle implements shape {
    private double xPos, yPos;
    private double radius;
    
    public circle(){
        xPos = 0;
        yPos = 0;
        radius = 1;
    }
    public circle(double xLoc, double yLoc, double r){
        xPos = xLoc;
        yPos = yLoc;
        radius = r;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    

}
