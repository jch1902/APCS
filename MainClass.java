
/**
 * Write a description of class MainClass here.
 *
 * @author (Jasper Hoong)
 * @version (a version number or a date)
 */
import chn.util.*;
public class MainClass
{
    private static String answer;
    private static int classNumber;
    private static String className;
    private static boolean runClass = true;
    private static boolean askAgain = true;
    private static ConsoleIO newConsole = new ConsoleIO();
    public static void main(String[]args){
        
        while(runClass == true){
            printMenu();
            switch(classNumber){
                case 1:
                    DrawHouse.run();
                    afterRan();
                break;
                
                case 2:
                    CountdownSong.run();
                    afterRan();
                break;
                
                case 3:
                    sphero.run();
                    afterRan();
                break;
                
                case 4:
                    Rectangle.run();
                    afterRan();
                break;
                
                case 5:
                    AccountsTest.run();
                    afterRan();
                break;
                
                case 6:
                    Start.run();
                    afterRan();
                break;
                
                case 7:
                    test.run();
                    afterRan();
                break;
                
                case 8:
                    VehicleCustomizerTest.run();
                    afterRan();
                break;
                
                case 9:
                    TestingMain.run();
                    afterRan();
                break;
                
                case 10:
                    Permutations.run();
                    afterRan();
                break;
                case 11:
                    RectangleArrayList.run();
                    afterRan();
                break;
                case 12:
                    Statistics.run();
                    afterRan();
                break;
                case 13:
                    Compact.run();
                    afterRan();
                break;
                case 14:
                    Shorthand.run();
                    afterRan();
                break;
                case 15:
                    PigLatinator.run();
                    afterRan();
                break;
                case 16:
                    PalindromeTest.run();
                    afterRan();
                break;
                default:
                    System.out.println("Please type in a valid number");
                break;
            }
        }  
    }
    public static void afterRan(){
        while(askAgain){
            System.out.print("Would you like to run another program?(Y/N)");
            answer = newConsole.readLine();
            if(answer.equalsIgnoreCase("N")){
                runClass = false;
                askAgain = false;
            }else if(answer.equalsIgnoreCase("Y")){
                runClass = true;
                askAgain = false;
            }else{
                System.out.println("Please enter a valid answer");
            }
            System.out.println();
        }
        askAgain = true;
    }
    public static void printMenu(){
        System.out.println("\nClasses: \n\n1)DrawHouse\n2)Countdown Song\n3)sphero\n4)Rectangle\n5)AccountTest");
        System.out.println("6)Start\n7)test\n8)VehicleCustomizerTest\n9)Testing Main\n10)Permutations\n11)RectangleArrayList\n12)Statistics\n13)Compact");
        System.out.print("14)Shorthand\n15)PigLatinator\n16)Palindrome\n");
        System.out.println("Which class would you like to run?(type in the corresponding number)");
        classNumber = newConsole.readInt();
    }
}
