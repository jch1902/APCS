
/**
 * Write a description of class Question here.
 *
 * @author (Jasper Hoong)
 * @version (a version number or a date)
 */
public class Question
{
    private boolean trueorfalse;
    public boolean getAnswer(){
        if(answer == correctAnswer){
            trueorfalse = true;
        }else{
            trueorfalse = false;
        }
        return trueorfalse;
    }
    
    private String question;
    public void question(String question){
        this.question = question;
    }
    
    private String choiceA;
    public void choiceA(String choiceA){
        this.choiceA = choiceA;
    }
    public String answerA(){
        return choiceA;
    }
    
    private String choiceB;
    public void choiceB(String choiceB){
        this.choiceB = choiceB;
    }
    public String answerB(){
        return choiceB;
    }
    
    private String choiceC;
    public void choiceC(String choiceC){
        this.choiceC = choiceC;
    }
    public String answerC(){
        return choiceC;
    }
    
    private String choiceD;
    public void choiceD(String choiceD){
        this.choiceD = choiceD;
    }
    public String answerD(){
        return choiceD;
    }
    
    private String choiceE;
    public void choiceE(String choiceE){
        this.choiceE = choiceE;
    }
    public String answerE(){
        return choiceE;
    }
    
    private String correctAnswer;
    public void answerKey(String correctAnswer){
        this.correctAnswer = correctAnswer;
    }
    
    private String answer;
    public void answer(String answer){
        this.answer = answer;
    }

}
