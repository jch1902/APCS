
/**
 * Write a description of class PigLatinator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
import java.util.regex.*;
import java.util.ArrayList;
public class PigLatinator
{
    private static String[] splitString;
    private static String userInput;
    private static ConsoleIO newConsole = new ConsoleIO();
    private static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    private static boolean translate;
    private static ArrayList wordArray;
    public static void run(){
        wordArray = new ArrayList();
        translate = true;
        System.out.println("I can translate English phrases and sentences into Pig Latin");
        while(translate){
            wordArray.clear();
            System.out.println("Please type an english phrase or sentence");
            userInput = newConsole.readLine();
            splitString = userInput.split("\\s");
            checkString();
            for(int i = 0;i < wordArray.size();i++){
                System.out.print(wordArray.get(i) + " ");
            }
            System.out.println("\n");
            checkRunAgain();
        }
    }
    public static void checkString(){
        for(String string:splitString){
            if(!string.contains("a")&&!string.contains("o")&&!string.contains("i")&&!string.contains("e")&&!string.contains("u")){
                wordArray.add(string + "ay");//works
            }else if(string.startsWith("a")||string.startsWith("e")
            ||string.startsWith("i")||string.startsWith("o")
            ||string.startsWith("u")){
                wordArray.add(string + "yay");//works
            }else if((string.contains("a")||string.contains("o")
            ||string.contains("i")||string.contains("e")||
            string.contains("u"))&&(!string.startsWith("a")
            &&!string.startsWith("e")&&!string.startsWith("i")
            &&!string.startsWith("o")&&!string.startsWith("u"))){
                boolean endExists = true;
                String start = "";
                String end = "";
                String upper = "";
                for(int i = 0; i < string.length();i++){
                    if(string.substring(i,i+1).equals("a")||string.substring(i,i+1).equals("u")
                    ||string.substring(i,i+1).equals("o")||string.substring(i,i+1).equals("i")
                    ||string.substring(i,i+1).equals("e")){
                        start = string.substring(0,i+1);
                        if(string.length() > 2){
                            upper = Character.toString(string.charAt(i+1));
                            end = string.substring(i+2, string.length());
                        }else{
                            endExists = false;
                        }
                        break;//end if first vowel found
                    }
                }
                if(endExists){
                    wordArray.add(upper.toUpperCase() + end + start + "ay");
                }else{
                    wordArray.add(Character.toString(start.charAt(0)).toUpperCase() + start.substring(1,start.length()) + "ay");
                }
            }
        }
    }
    public static void checkRunAgain(){
        boolean correctResponse = true;
        while(correctResponse){
            System.out.println("Would you like to translate again?(y/n)");
            userInput = newConsole.readLine();
            if(userInput.equals("y")){
                translate = true;
                correctResponse = false;
            }else if(userInput.equals("n")){
                translate = false;
                correctResponse = false;
            }else{
                System.out.println("Please enter a valid response");
                correctResponse = true;
            }
        }
    }
}
