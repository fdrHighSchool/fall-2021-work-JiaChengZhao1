import java.util.Scanner;

public class RandomNumber{
    public static void main(String[] args) {
      // System.out.println((int)(Math.random()6 + 1));

      // create an instance of the Scanner class
      Scanner s = new Scanner(System.in);

      // ask user how many groups
      System.out.println("Enter leve number 1.Easy   2.Medium  3.Hard");
      int numLV = s.nextInt();
      // System.out.println(numGroups);
       System.out.println("Enter your guess!");
      // determine random group number
      int randomChoice;
      int n=3;

   if (numLV==1){
       randomChoice = (int)(Math.random()*numLV*10 + 1);
       while(n!=0){
         int result= s.nextInt();
         if(result<randomChoice){
            System.out.println("too small");
            n--;
         }
         else if(result>randomChoice){
         System.out.println("too big");
         n--;
         }
         else{
         System.out.println("Your number " + randomChoice + " is correct, you win!");
         break;
         }
         System.out.println("you only have "+n+" chance now");
      }
   }
   else if (numLV==2){
       randomChoice = (int)(Math.random()*numLV*50 + 1);
       while(n!=0){
         int result= s.nextInt();
         if(result<randomChoice){
          System.out.println("too small");
          n--;
         }
         else if(result>randomChoice){
         System.out.println("too big");
         n--;
         }
         else{
         System.out.println("Your number " + randomChoice + " is correct, you win!");
         n--;
         break;
         }
         System.out.println("you only have "+n+" chance now ");
      }
   }
   else if (numLV==3){
       randomChoice = (int)(Math.random()*numLV*100 + 1);
       while(n!=0){
         int result= s.nextInt();
         if(result<randomChoice){
          System.out.println("too small");
          n--;
         }
         else if(result>randomChoice){
         System.out.println("too big");
         n--;
         }
         else{
         System.out.println("Your number " + randomChoice + " is correct, you win!");
         break;
         }
         System.out.println("you only have "+n+" chance now ");
      }
   }
      else{
      System.out.println("Invalid Number. Not a difficulty.");
      }
   }
}// end main method
