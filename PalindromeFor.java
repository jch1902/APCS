
/**
 * Write a description of class PalindromeFor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
public class PalindromeFor
{
    private static String finalWord;
    private static String newWord;
    private static ConsoleIO newConsole = new ConsoleIO();
    private static boolean keepRunning;
    private static String cleanedWord;
    public void getWord(){
        keepRunning = true;
        while(keepRunning){
            System.out.println("Enter a string(q to exit)");
            String newWord = newConsole.readLine();
            
            if(newWord.equalsIgnoreCase("q")){
                keepRunning = false;
                break;
            }else{
                cleanedWord = "";
                finalWord = invertWord(newWord);
                checkWords();
            }
    }
    }
    public String invertWord(String string){
        String inverted = "";
        for(int i = string.length(); i > 0; i--){
            if(Character.isLetter(string.charAt(i-1))||Character.isDigit(string.charAt(i-1))){
                inverted += Character.toString(string.charAt(i-1));
            }
        }
        for(int i = 0; i < string.length(); i++){
            if(Character.isLetter(string.charAt(i))||Character.isDigit(string.charAt(i))){
                cleanedWord += Character.toString(string.charAt(i));
            }
        }
        return inverted;
    }
    public void checkWords(){
        if(finalWord.equals(cleanedWord) && cleanedWord.length() > 1){
            System.out.println("Your string is a palindrome");
        }else{
            System.out.println("Your string is not a palindrome");
        }
    }
}
