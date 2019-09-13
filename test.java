
/**
 * Write a description of class test here.
 *
 * @author (Jasper Hoong)
 * @version (a version number or a date)
 */
import chn.util.*;
import java.util.ArrayList.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class test
{
    private static ArrayList<questionClass> questionList;
    private static String userAnswer;
    private static int questionNumber;
    public static void run(){
        questionList = new ArrayList<>();
        ConsoleIO newConsole = new ConsoleIO();

        questionClass question1 = new questionClass();
        question1.setQuestion("Question 1 (T/F)");
        question1.setAnswer("T");
        questionList.add(question1);
        
        questionClass question2 = new questionClass();
        question2.setQuestion("Question 4 (T/F)");
        question2.setAnswer("F");
        questionList.add(question2);
        
        questionClass question3 = new questionClass();
        question3.setQuestion("Question 3 (T/F)");
        question3.setAnswer("T");
        questionList.add(question3);
        
        questionNumber = 0;
        int questionLabel = 1;
        for(int i = 0; i < 3; i++){
            System.out.println( questionLabel + ")" + questionList.get(questionNumber).getQuestion());
            userAnswer = newConsole.readLine();
            if(userAnswer.equals(questionList.get(questionNumber).getAnswer())){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Wrong!");
            }
            questionNumber++;
            questionLabel++;
        }
    }
}
class questionClass{
    private String question;
    public void setQuestion(String question){
        this.question = question;
    }
    public String getQuestion(){
        return question;
    }
    
    private String correctAnswer;
    public void setAnswer(String correctAnswer){
        this.correctAnswer = correctAnswer;
    }
    public String getAnswer(){
        return correctAnswer;
    }
}
