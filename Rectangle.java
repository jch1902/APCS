
/**
 * Write a description of class Rectangle here.
 *
 * @author (Jasper Hoong)
 * @version (a version number or a date)
 */
import apcslib.*;
import java.awt.Rectangle.*;
public class Rectangle
{
    private static double myX;
    private static double myY; 
    private static double myWidth; 
    private static double myHeight;
    private static DrawingTool pen = new DrawingTool(new SketchPad(700, 700));

    public static void run(){
        Rectangle rectangle = new Rectangle(-150,-150,300,400);
        rectangle.draw();
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
    public Rectangle(double x, double y, double width, double length){
        this.myX = x;
        this.myY = y;
        this.myWidth = width;
        this.myHeight = length;
    }
    public void draw(){
        pen.up();
        pen.move(myX,myY);
        pen.down();
        pen.move(myX + myWidth,myY);
        pen.move(myX+myWidth,myY + myHeight);
        pen.move(myX,myY+myHeight);
        pen.move(myX,myY);
    }
    public static double getPerimeter(){
        return (2*myWidth)+(2*myHeight);
    }
    public static double getArea(){
        return myWidth*myHeight;
    }
    
}
