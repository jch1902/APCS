
/**
 * Write a description of class RectangleArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*; // for ConsoleIO
import apcslib.*; // for formatting
import java.awt.geom.*; // for Point2D.Double
import java.util.ArrayList; // for ArrayList
public class RectangleArrayList{
    public RectangleArrayList(){
         ArrayList myRectangle = new ArrayList();
         input(myRectangle);
         output(myRectangle);
         input5thPoint(myRectangle);
         double area = calculateArea(myRectangle);
         System.out.println("The area of the rectangle is "
         + Format.right(area,5,2));
         double triArea = calculateTriangleArea(myRectangle);
         System.out.println("The area of the triangle is " + Format.right(triArea,5,2));
    }
    public void input(ArrayList myRect){
         System.out.println("We need four vertices for our rectangle.");
         System.out.println("Please provide them in consecutive order.");
         ConsoleIO console = new ConsoleIO();
         for (char ch = 'A'; ch <= 'D'; ch++){
             System.out.print("Give me the x coordinate for point " + ch + ": ");
             double x = console.readDouble();
             System.out.print("Give me the y coordinate for point " + ch + ": ");
             double y = console.readDouble();
             Point2D.Double myPoint = new Point2D.Double(x,y);
             myRect.add(myPoint);
         }
    } 
     public void output(ArrayList myRect){
        for (char ch = 'A'; ch <= 'D'; ch++){
             Point2D.Double pt = (Point2D.Double)myRect.get(ch - 65);
             System.out.println("Point " + ch + " is (" + pt.getX() + ","
             + pt.getY() + ")");
        }
    }
    public void input5thPoint(ArrayList myTri){
        ConsoleIO console = new ConsoleIO();
        System.out.print("Give me the x coordinate for point E: ");
        double x = console.readDouble();
        System.out.print("Give me the y coordinate for point E: ");
        double y = console.readDouble();
        Point2D.Double myPoint = new Point2D.Double(x,y);
        myTri.add(myPoint);
    }

    public double calculateArea(ArrayList myRect){
        Point2D.Double ptA = (Point2D.Double)myRect.get(0);
        Point2D.Double ptB = (Point2D.Double)myRect.get(1);
        Point2D.Double ptC = (Point2D.Double)myRect.get(2);// not needed
        Point2D.Double ptD = (Point2D.Double)myRect.get(3);
        double base = ptA.distance(ptB);
        double height = ptA.distance(ptD);
        return base * height;
    }
    public double calculateTriangleArea(ArrayList myTri){
        Point2D.Double ptA = (Point2D.Double)myTri.get(0);
        Point2D.Double ptD = (Point2D.Double)myTri.get(3);
        Point2D.Double ptE = (Point2D.Double)myTri.get(4);
        double base = ptA.distance(ptD);
        double height = ptA.distance(ptE);
        return (base*height)/2;
    }


    public static void run(){
        RectangleArrayList app = new RectangleArrayList();
    }
} 

