import java.util.*;

public class FracCalc {

    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Please input your fraction in x/y operation x/y format.");
      String problem = s.nextLine();

      produceAnswer(problem);

    }//end main method

    public static String produceAnswer(String input){
      int slashPos = input.indexOf("/");
      int SpacePos = input.indexOf(" ");

      String f1 = input.substring(0,SpacePos); //the whole equation
      String f2 = input.substring(SpacePos+3); //fraction 1

        int Whole1 = Integer.parseInt((getWhole(f1)));
        int Num1 = Integer.parseInt((getNum(f1)));
        int Denom1 = Integer.parseInt((getDenom(f1)));
        int Whole2 = Integer.parseInt((getWhole(f2)));
        int Num2 = Integer.parseInt((getNum(f2)));
        int Denom2 = Integer.parseInt((getDenom(f2)));

        System.out.println(Denom1);
        System.out.println(Denom2);

        if(input.contains("+")){
          Add(Num1, Num2, Denom1, Denom2, Whole1, Whole2);
        }
        else if(input.contains("-")){
          Minus(Num1, Num2, Denom1, Denom2, Whole1, Whole2);
        }
        else if(input.contains("*")){
          Multiply(Num1, Num2, Denom1, Denom2, Whole1, Whole2);
        }
        else{
          Divide(Num1, Num2, Denom1, Denom2, Whole1, Whole2);
        }
        return "";
    }//end produceAnswer method

    public static void Add(int Num1 , int Num2 , int Denom1 , int Denom2, int Whole1, int Whole2){
        System.out.println(((((Whole1 * Denom1) + Num1) * Denom2) + (((Whole2*Denom2) + Num2) * Denom1)) + "/" + (Denom1 * Denom2));
      }
    public static void Minus(int Num1 , int Num2 , int Denom1 , int Denom2, int Whole1, int Whole2){
        System.out.println(((Num1 * Denom2) - (Num2 * Denom1)) + "/" + (Denom1 * Denom2));
      }
    public static void Multiply(int Num1 , int Num2 , int Denom1 , int Denom2, int Whole1, int Whole2){
        System.out.println((Num1 * Num2) + "/" + (Denom1 * Denom2));
      }
    public static void Divide(int Num1 , int Num2 , int Denom1 , int Denom2, int Whole1, int Whole2){
        System.out.println((Num1 * Denom2) + "/" + (Num2 * Denom1));
      }


    public static String getWhole(String str){
      if(str.contains("_")){
        return str.substring(0,str.indexOf ('_'));
      }else if(str.contains("/")){
        return "0";
      }else return str;

    }
    public static String getNum(String str) {

        if(str.contains("_")){
          return str.substring(str.indexOf('_') + 1, str.indexOf('/'));
        }
        else if(str.contains("/")){
          return str.substring(0,str.indexOf('/'));
        }
        else return str;
      }
    public static String getDenom(String str){
      if(str.contains("/")){
        return str.substring(str.indexOf("/")+1);
      }else{
        return "1";
        }
      }
  }//end FracCalc

    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */
