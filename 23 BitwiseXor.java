import java.util.Scanner;

class BitwiseXor {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input first number: ");
         int num1 = input.nextInt();
         System.out.print("Input second number: ");
         int num2 = input.nextInt();

         System.out.println("The result of Bitwise Xor is: "+(num1^num2));
     }
}
