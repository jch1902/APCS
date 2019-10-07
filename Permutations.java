
/**
 * Write a description of class Permutations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;
public class Permutations
{
    private static ArrayList nextPermutation = new ArrayList();
    private static Random newRandom = new Random();
    private static int boundary;
    private static boolean keepRunning;
    public static void run(){
        int increment;
        int listNumber = 1;
        
        for(int y = 10; y > 0; y--){
            System.out.print("\nList " + listNumber + ": ");
            increment = 0;
            boundary = 10;       
            keepRunning = true;
            while(keepRunning){
                for(int x = 0; x < 10; x++){
                    nextPermutation.add(newRandom.nextInt(10));
                    increment++;
                }
                boundary--;
                System.out.print(nextPermutation.get(boundary) + " ");
                
                if(boundary == 0){
                    keepRunning = false;
                }
                nextPermutation.clear();
            }
            listNumber++;
        }
    }
}
