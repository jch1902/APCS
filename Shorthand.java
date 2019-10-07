
/**
 * Write a description of class Shorthand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
import java.util.regex.*;
public class Shorthand
{
    private static ConsoleIO newConsole = new ConsoleIO();
    private static String userInput;
    private static boolean keepRunning;
    private static String[] splitString;
    public static void run(){

        keepRunning = true;
        
        while(keepRunning){
            System.out.println("Welcome to the Shorthand Message Generator!");
            System.out.print("\nEnter a message(Press x to leave): ");
            userInput = newConsole.readLine();
            splitString = userInput.split("\\s+");
            if(userInput.equalsIgnoreCase("x")){
                keepRunning = false;
            }else{
                for(String string:splitString) {
                    System.out.print(string.replaceAll("and","&").replaceAll("for","4")
                        .replaceAll("you","U").replaceAll("to","2")
                        .replaceAll("a","").replaceAll("e","")
                        .replaceAll("i","").replaceAll("o","")
                        .replaceAll("u",""));
                    System.out.print(" ");
                }
                System.out.println("\n");
            }
        }
    }
}
