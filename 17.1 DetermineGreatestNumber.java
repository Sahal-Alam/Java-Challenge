import java.util.Scanner;

class DetermineGreatestNumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("\nWelcome to Greatest Number Determination Program\n");

         System.out.print("Please enter your first number: ");
         int firstNumber = input.nextInt();
         System.out.print("Please enter your second number: ");
         int secondNumber = input.nextInt();
         System.out.print("Please enter your third number: ");
         int thirdNumber = input.nextInt();

         if (firstNumber > secondNumber && firstNumber > thirdNumber) {
             System.out.println("First number is greatest.");
         } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
             System.out.println("Second number is greatest.");
         } else if (thirdNumber > firstNumber && thirdNumber > firstNumber) {
             System.out.println("Third number is greatest");
         }else {
             System.out.println("All the numbers are same!");
         }
     }
}
