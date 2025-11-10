import java.util.Scanner;

class DetermineOddEven {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("\nWelcome to Odd Even number determination Program!\n");

         System.out.print("Please input your number: ");
         int number = input.nextInt();

         if (number % 2 == 0){
             System.out.println("Your entered number is Even!");
         }else {
             System.out.println("Your entered number is Odd!");
         }
         System.out.println("Thank you");
     }
}
