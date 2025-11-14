import java.util.Scanner;

class RightShiftOperator {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int num = input.nextInt();
         System.out.print("How many place you want to shift: ");
         int place = input.nextInt();

         System.out.println("The result of the right shift is: "+(num>>place));
     }
}
