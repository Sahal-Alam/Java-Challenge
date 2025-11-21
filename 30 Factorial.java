import java.util.Scanner;

class Factorial {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Factorial\n");
         System.out.print("Input a number: ");
         int number = input.nextInt();
         long fact = factorial(number);
         System.out.println("Factorial of "+number+" is: "+fact);
     }
     public static long factorial(int number){
         if (number < 2){
             return 1;
         }
         long fact = 1;
         int i = 2;
         while (i <= number){
             fact = fact * i;
             i++;
         }
         return fact;
     }
}
