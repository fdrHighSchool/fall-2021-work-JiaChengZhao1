import java.util.*;

public class FracCalc {

    /**
     * Prompts user for input, passes that input to produceAnswer, then outputs the result.
     * @param args - unused
     */
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Please input your fraction in x/y operation x/y format.");
      String problem = s.nextLine();

      produceAnswer(problem);

        // TODO: Read the input from the user and call produceAnswer with an equation
        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
        // Checkpoint 2: Accept user input multiple times.
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    public static String produceAnswer(String input){
      int slashPos = input.indexOf("/");
      int SpacePos = input.indexOf(" ");

      String f1 = input.substring(0,SpacePos); //the whole equation
      String f2 = input.substring(SpacePos+3); //fraction 1

      System.out.println(getNum(f1));
      System.out.println(getNum(f2));
     //  String n1 = input.substring(0,slashPos);  // numerator 1
     //  String d1 = input.substring(slashPos+1,SpacePos); // denominator 1
     //  String n2 = input.substring(SpacePos+3,7); // numerator 2
     //  String d2 = input.substring(SpacePos+5,9); // denominator 2


        // TODO: Implement this function to produce the solution to the input
        // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.
        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".

        return "";
    }//end produceAnswer method

    public static int getNum(String frac) {
        int slashPos = frac.indexOf("/");

      if = ("_"){
        int MixedPos = frac.indexOf("_");
        String WholeNum = frac.substring(0,MixedPos);
        String FracNum = frac.substring(MixedPos);
        int WholeNum1=Integer.parseInt(WholeNum);
        int FracNum1=Integer.parseInt(FracNum);
        int DenominOfFrac = frac.substring(SlashPos);
      }


      return Integer.parseInt(frac.substring(0, slashPos));
    }
    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */

}//end class
