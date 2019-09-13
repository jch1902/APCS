
/**
 * Write a description of class MainClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
public class MainClass
{
    private static String className;
    private static boolean runClass;
    public static void main(String[]args){
        ConsoleIO newConsole = new ConsoleIO();
        DrawHouse newHouse = new DrawHouse();
        
        runClass = true;
        while(runClass){
            System.out.println("Which class would you like to run");
            className = newConsole.readLine();
            switch(className){
                case "DrawHouse":
                return ;
            }
        }  
    }
}
