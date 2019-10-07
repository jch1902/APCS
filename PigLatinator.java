
/**
 * Write a description of class PigLatinator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
import java.util.regex.*;
public class PigLatinator
{
    private static String[] splitString;
    private static String userInput;
    private static ConsoleIO newConsole = new ConsoleIO();
    private static char firstChar;
    private static char lastChar;
    public static void run(){
        
        System.out.println("Enter a word");
        userInput = newConsole.readLine();
        splitString = userInput.split("\\s");
        if(!userInput.contains("a")&&!userInput.contains("o")&&!userInput.contains("i")&&!userInput.contains("e")&&!userInput.contains("u")){
            System.out.println(userInput + "ay");//works
        }else if(userInput.startsWith("a")||userInput.startsWith("e")
        ||userInput.startsWith("i")||userInput.startsWith("o")
        ||userInput.startsWith("u")){
            System.out.println(userInput + "yay");//works
        }else if((userInput.contains("a")||userInput.contains("o")
        ||userInput.contains("i")||userInput.contains("e")||
        userInput.contains("u"))&&(!userInput.startsWith("a")
        &&!userInput.startsWith("e")&&!userInput.startsWith("i")
        &&!userInput.startsWith("o")&&!userInput.startsWith("u"))){
            firstChar = userInput.charAt(0);
            lastChar = userInput.charAt((userInput.length()-1));
            System.out.println(userInput + "aya");
        }
    }
}
