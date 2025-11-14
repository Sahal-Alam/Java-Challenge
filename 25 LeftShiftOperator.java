import java.util.Scanner;

class LeftShiftOperator {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int num = input.nextInt();

         System.out.println("The left shift of the number is: "+(num<<1));
     }
}
