// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   public NumberGuessingGame() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Random var2 = new Random();
      boolean var3 = true;

      int var4;
      String var10;
      for(var4 = 0; var3; var3 = var10.equals("yes")) {
         int var5 = var2.nextInt(100) + 1;
         int var6 = 0;
         byte var7 = 10;
         boolean var8 = false;
         System.out.println("\nWelcome to the Number Guessing Game!");
         System.out.println("Guess a number between 1 and 100. You have " + var7 + " attempts.");

         while(var6 < var7) {
            System.out.print("Enter your guess: ");
            int var9 = var1.nextInt();
            ++var6;
            if (var9 < var5) {
               System.out.println("Too low! Try again.");
            } else {
               if (var9 <= var5) {
                  System.out.println("Congratulations! You guessed the number in " + var6 + " attempts.");
                  var8 = true;
                  ++var4;
                  break;
               }

               System.out.println("Too high! Try again.");
            }
         }

         if (!var8) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + var5);
         }

         System.out.println("Rounds won: " + var4);
         System.out.print("Do you want to play again? (yes/no): ");
         var10 = var1.next().toLowerCase();
      }

      System.out.println("Thanks for playing! Your total rounds won: " + var4);
      var1.close();
   }
}
