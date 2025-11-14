import java.util.Scanner;

class BitwiseOr {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("\nWelcome to the Bitwise Or calculator!\n");

         System.out.print("Input the first number: ");
         int num1 = input.nextInt();
         System.out.print("Input the second number: ");
         int num2 = input.nextInt();

         int result = num1 | num2;

         System.out.println("The result of the Bitwise Or is: "+result);
     }
}
