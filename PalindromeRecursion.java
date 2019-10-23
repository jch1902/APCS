
/**
 * Write a description of class PalindromeRecursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
public class PalindromeRecursion
{
    private static boolean keepRunning;
    private static String newWord;
    private static ConsoleIO newConsole = new ConsoleIO();
    private static String characterOnly;
    public void getWord(){
        System.out.println("Enter a string(q to exit)");
        String newWord = newConsole.readLine();
        removeNonCharacters(newWord);
        keepRunning = checkKeepRunning(newWord);
        if(keepRunning){
            String invertedWord = invertWord(characterOnly);
            if(invertedWord.equalsIgnoreCase(characterOnly) && characterOnly.length() > 1){
                System.out.println("Your string is a palindrome\n");
            }else{
                System.out.println("Your string is not a palindrome\n");
            }
            getWord();
        }
    }
    public String invertWord(String word){
        String invertWord= "";
        for(int i = word.length(); i > 0; i--){
            invertWord+=Character.toString(word.charAt(i-1));
        }
        return invertWord;
    }
    public boolean checkKeepRunning(String string){
        boolean x;
        if(string.equalsIgnoreCase("q")){
            x = false;
        }else{
            x = true;
        }
        return x;
    }
    public void removeNonCharacters(String word){
        characterOnly = "";
        for(int i = word.length(); i > 0; i--){
            int x = i-1;
            if(Character.isLetter(word.charAt(x))||Character.isDigit(word.charAt(i-1))){
                characterOnly += Character.toString(word.charAt(x));
            }
        }
    }
}
