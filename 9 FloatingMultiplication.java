import java.util.Scanner;

class FloatingMultiplication {
     static void main(String[] args) {
         Scanner Double = new Scanner(System.in);
         System.out.print("Give the first number: ");
         Double first = Double.nextDouble();
         System.out.print("Give the second number: ");
         Double second = Double.nextDouble();

         Double mul = first * second;
         System.out.println("The multiplication is: "+mul);
     }
}
