
/**
 * Write a description of class Palindrom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Palindrom
{
    private static String newWord;
    private static String invertedWord;
    private static boolean matches;
    public void setWord(String word){
        this.newWord = word.toLowerCase().replaceAll("[^\\w\\t\\n\\x0B\\f\\r]","");
        invertString();
        compareStrings();
    }
    public boolean checkStop(){
        boolean keepRun;
        if(newWord.equals("q")){
            keepRun = false;
        }else{
            keepRun = true;
        }
        return keepRun;
    }
    public void invertString(){
        invertedWord = "";
        for(int i = newWord.length(); i > 0; i--){
            invertedWord += Character.toString(newWord.charAt(i-1));
        }
    }
    public void compareStrings(){
        String firstString = newWord;
        String secondString = invertedWord;
        if(firstString.equalsIgnoreCase(secondString) && newWord.length() > 1){
            matches = true;
        }else{
            matches = false;
        }
    }
    public boolean getResult(){
        return matches;
    }
    
}
