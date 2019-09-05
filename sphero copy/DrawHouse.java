
/**
 * Write a description of class DrawHouse here.
 *
 * @author (Jasper Hoong)
 * @version (a version number or a date)
 */
import apcslib.*;
public class DrawHouse
{
    public static void main (String[]args){
        SketchPad paper = new SketchPad(1000,1000);
        DrawingTool pen = new DrawingTool(paper);
        
        pen.up();
        pen.move(-400,-250);
        pen.down();
        pen.move(400,-250);
        pen.move(400,250);
        pen.move(-400,250);
        pen.move(-400,-250);
        
        pen.up();
    }
}
