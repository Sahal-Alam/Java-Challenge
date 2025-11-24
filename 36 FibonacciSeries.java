import java.util.Scanner;

class FibonacciSeries {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("\nWelcome to Fibonacci series\n");
         System.out.print("Input a number: ");
         int number = input.nextInt();
         System.out.println("Here is the Fibonacci Series");
         printFibonacci(number);
     }

     public static void printFibonacci (int number){
         if (number < 0){
             return;
         }
         System.out.print("0 ");
         if (number == 0){
             return;
         }
         System.out.print("1 ");
         int first = 0 , second = 1;
         while (first + second <= number){
             int third = first + second;
             System.out.print(third+" ");
             first = second;
             second = third;
         }
     }
}
