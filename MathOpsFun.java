
/**
 * MathOpFun is intended to teach computer math and operator principles, 
 *  plus..
 *      i)      Running MathOps fun will execute and evaluate math operators
 *      ii)     Coding MathOps fun assist in learning syntax of JAVA math operators
 *      iii)    MathOpsFun is dependent on class heirarchy and while working on this Class
 *              you will be learning JAVA OOP methodology
 *      iv)     MathOpsFun will be extended and built in class and with peers as a part of the
 *              MidTermTest project 
 *      v)      Each class member when they get a lab or handout, they will will look to bring
 *              applicable math operations into MathOpsFun
 *
 * @author John Mortensen
 * @version 1.0
 */

import java.util.Random; 
public class MathOpsFun
{
    
    
    /**
     * askQuestion is a method that conforms to MidTermTest requirements to ask a question
     *
     * @return    return code:  
     *                          0 - execution completion returned succesful
     *                          >0 - execution aborted with error (needs to be implemented)
     */
    public int askQuestion()
    {
        
        Counting tally = new Counting();

        // randomize logic to pick supplied amount of questions from method parameter, ie 10 
        Random randomInt = new Random();
        // randomizing logic here to pick arg1 <= 99, arg2 <=9 with Modulo != 0
        for(int i = 0; i < randomInt.nextInt(10); i++){
            int args1 = randomInt.nextInt(100);
            int args2 = randomInt.nextInt(10);
            int Modulo;
        
            tally.updateCounters( IntMathDivAndModulo(args1, '/', args2) );
            tally.updateCounters( IntMathDivAndModulo(args1, '%', args2) );
        
            // randomizing logic here to pick numbers <= 15
            // random logic should pick even-even, even-odd, odd-even, odd-odd
            tally.updateCounters( BinaryMath(args1, '&', args2) );  // bitwise AND
            tally.updateCounters( BinaryMath(args1, '|', args2) );  // bitwise OR
            tally.updateCounters( BinaryMath(args1, '+', args2) );  // binary addition
            tally.updateCounters( BinaryMath(args1, '-', args2) );  // binary substraction
                
            tally.printCounters();
        }
        
 
        return 0;
    }
  
    /**
     * IntMathDivAndModulo 
     *
     * @param  arg1      1st argument in math expression
     * @param  operator  operator in math expression (/ or % only)
     * @param  arg2      2st argument in math expression
     * @return    error code
     */
    public Boolean IntMathDivAndModulo(int arg1, char operator, int arg2)
    {        
        // prepare question from Question class
        Question question = new Question();
        
        // format question
        question.question(String.format("What is (int)" + arg1 + " " + "%s" + " (int)" + arg2, operator ));
        
        // format question choices
        question.choiceA(String.format("%f",(float)arg1/(float)arg2));
        question.choiceB(String.format("%x",arg1/arg2));
        question.choiceC(String.format("%f",(float)arg1*(float)arg2));
        question.choiceD(String.format("%x",arg1%arg2));
        question.choiceE("None of the above");
        
        // real time calc answer based off args AND operator
        int answerCalc;
        switch(operator)
        {
            case '/':
                answerCalc = arg1 / arg2;
                question.answerKey(question.answerB());
                break;
            case '%':
                answerCalc = arg1 % arg2;
                question.answerKey(question.answerD());
                break;
            default: // not supported
                return false;
        }
            
        // format question answer based off of operation calculation
        question.answer(String.format(
            "(int)"+arg1 +          // arg1
            " "+
            "%s"+                   // operator
            " " +        
            "(int)"+ arg2 +         // arg2
            " = " + 
            answerCalc              // answer
            ,operator));             // operator parameter % 
                                    // requires var (may be hidden feature :)
        
        // getAnswer return true if question is correct
        
        return question.getAnswer();

    }
    
    /**
     * BinaryMath 
     *
     * @param  arg1      1st argument in math expression (4 bits)
     * @param  operator  operator in math expression (&, |, +, or - only)
     * @param  arg2      2st argument in math expression (4 bits)
     * @return    error code
     */
    public Boolean BinaryMath(int arg1, char operator, int arg2)
    {
        // maximum binary number for testing is 15, we need to be reasonable
        int binaryLength = 4;       
        if (arg1 > 15 || arg2 > 15) return false;       // exit if number above 15
        
        // Turn math arguments (numbers) to binary strings
        String carg1 = zeroPadInt2BinaryString(arg1,binaryLength);
        String carg2 = zeroPadInt2BinaryString(arg2,binaryLength);
        
        // prepare question from Question class
        Question question = new Question();
    
        // format question
        question.question(String.format("Calculate binary result of: " + carg1 + " " + "%s" + " " + carg2, operator ));
        
        // format question choices
        question.choiceA(zeroPadInt2BinaryString(arg1 & arg2,binaryLength));
        question.choiceB(zeroPadInt2BinaryString(arg1 | arg2,binaryLength));
        question.choiceC(zeroPadInt2BinaryString(arg1 + arg2,binaryLength));
        question.choiceD(zeroPadInt2BinaryString(arg1 - arg2,binaryLength));
        question.choiceE("Null");
        
        // real time calc answer based off args AND operator
        int answerCalc;
        switch(operator)
        {
            case '&':
                answerCalc = arg1 & arg2;
                question.answerKey(question.answerA());
                break;
            case '|':
                answerCalc = arg1 | arg2;
                question.answerKey(question.answerB());
                break;
             case '+':
                answerCalc = arg1 + arg2;
                if (answerCalc > 15) binaryLength++;
                question.answerKey(question.answerC());
                break; 
             case '-':
                answerCalc = arg1 - arg2;
                question.answerKey(question.answerD());
                break;
            default:
                return false;
        }
        
        // format question answer based off of operation calculation
        String answerString = zeroPadInt2BinaryString(answerCalc,binaryLength);
        question.answer(String.format(
            carg1 +         // arg1
            " " +
            "%s" +          // operator
            " " +
            carg2 +         // arg2
            " = " + 
            answerString    // answer
            ,operator));     // operator parameter, % requires it (may be hidden feature :)
        
        // getAnswer return true if question is correct
        return question.getAnswer();
        
    }
    
    /**
     * zeroPadInt2BinaryString 
     *
     * @param  arg1             number to convert to binary
     * @param  binaryLength     number of bits for number (ie 4 bits)
     * @return    the binary String with leading 0s
     */
    String zeroPadInt2BinaryString(int arg, int binaryLength)
    {
        return Integer.toBinaryString( (1 << binaryLength) | arg ).substring(1);
    }

   
}
