
/**
 * Write a description of class Statistics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import chn.util.*;
public class Statistics
{
    private static ArrayList<Integer> numberList;
    private static int incrementValue;
    private static double sum;
    private static double sumofDifferences;
    private static double requirementC;
    private static boolean keepRunning;
    private static String userAnswer;
    public static void run(){
        numberList = new ArrayList<Integer>();
        ConsoleIO newConsole= new ConsoleIO();
        keepRunning = true;
        while(keepRunning){
            System.out.println("Add a number or press x to stop");
            userAnswer = newConsole.readLine();
            if(isInteger(userAnswer)){
                numberList.add(Integer.valueOf(userAnswer));
                System.out.println("Number added");
            }
            else if(userAnswer.equals("x")){
                keepRunning = false;
            }else{
                System.out.println("Please enter a valid answer");
            }
        }
        
        incrementValue = 0;
        for(int i = numberList.size();i > 0; i--){
            sum += numberList.get(incrementValue);
            incrementValue++;
        }
        getSumofDifferences();
        requirementC = sumofDifferences/(numberList.size()-1);
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + sum/numberList.size());
        System.out.println("Sum of differences = " + sumofDifferences);
        System.out.println("Requirement C: " + requirementC);
        System.out.println("Standard Deviation = " + Math.sqrt(requirementC)+"\n");
    }
    private static double getSumofDifferences(){
        incrementValue = 0;
        for(int i = numberList.size();i>0;i--){
            sumofDifferences += squareNumber((numberList.get(incrementValue)) - (numberList.get(0)));
            incrementValue++;
        }
        return sumofDifferences;
    }
    private static int squareNumber(int number){
        int x = number*number;
        return x;
    }
    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; 
        } catch(NullPointerException e) {
            return false;
        }
        // only here if it didn't return false
        return true;
    }
}
