import java.util.Scanner;

class BitwiseNot {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("\nWelcome to the Bitwise Not calculator!\n");
         System.out.print("Input a number: ");
         int num = input.nextInt();

         System.out.println("The result of Bitwise Not is: "+~num);
     }
}
