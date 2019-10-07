
/**
 * Write a description of class Compact here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Compact
{
    private static ArrayList<Integer> numberList;
    private static int incrementValue;
    public static void run(){
        numberList = new ArrayList<Integer>();
        numberList.add(0);
        numberList.add(9);
        numberList.add(7);
        numberList.add(0);
        numberList.add(0);
        numberList.add(23);
        numberList.add(4);
        numberList.add(0);
        incrementValue = 0;

        for(int i = numberList.size();i > 0;i--){
            int x = numberList.get(incrementValue);
            if(x == 0 && incrementValue<numberList.size()){
                numberList.remove(incrementValue);
            }else if(incrementValue<numberList.size()){
                System.out.print(" " + numberList.get(incrementValue) + " ");
                incrementValue++;
            }
        }
        System.out.println("\n");
    }
}
