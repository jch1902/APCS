
/**
 * Write a description of class PalindromeTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
import java.util.ArrayList;
public class PalindromeTest
{
    private static ConsoleIO newConsole = new ConsoleIO();
    private static boolean continueRun;
    public static void run(){
        System.out.println("\nWelcome to Palindrome!\nPress 1 for normal method, 2 for recursion, 3 for For loops");
        int x = newConsole.readInt();
        switch (x){
            case 1:
                continueRun = true;
                while(continueRun){
                    System.out.println("Enter a string(q to exit)");
                    String pWord = newConsole.readLine();
                    
                    //Normal method
                    Palindrom newWord = new Palindrom();
                    newWord.setWord(pWord);
                    continueRun = newWord.checkStop();
                    if(!continueRun){
                        break;
                    }
                    if(newWord.getResult()){
                        System.out.println("Your string is a palindrome\n");
                    }else{
                        System.out.println("Your string is not a palindrome\n");
                    }
                }
            break;
            case 2:
                PalindromeRecursion newRecursionWord = new PalindromeRecursion();
                newRecursionWord.getWord();
            break;
            case 3:
                PalindromeFor newForWord = new PalindromeFor();
                newForWord.getWord();
            break;
        }
        
        
        
    }
}
