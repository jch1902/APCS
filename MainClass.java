
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
    private static ConsoleIO newConsole = new ConsoleIO();
    public static void main(String[]args){
        
        
        while(runClass == true){
            System.out.println("\nClasses: \n\n1)DrawHouse\n2)Countdown Song\n3)sphero\n4)Rectangle\n5)AccountTest");
            System.out.println("6)Start\n7)test\n8)VehicleCustomizerTest\n9)Testing Main\n");
            System.out.println("Which class would you like to run?(type in the corresponding number)");
            classNumber = newConsole.readInt();
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
                default:
                    System.out.println("Please type in a valid number");
                break;
            }
        }  
    }
    public static void afterRan(){
        System.out.print("Would you like to run another program?(Y/N)");
        answer = newConsole.readLine();
        if(answer.equals("N")){
           runClass = false;
        }else{
           runClass = true;
        }
        System.out.println();
    }
}
