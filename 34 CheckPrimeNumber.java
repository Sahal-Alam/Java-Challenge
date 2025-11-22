import java.util.Scanner;

class CheckPrimeNumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("\nWelcome to check Prime Number\n");
         System.out.print("Input a number: ");
         int number = input.nextInt();
         boolean prime = isprime(number);
         if (isprime(number)){
             System.out.println("Your number is prime");
         }else {
             System.out.println("Your number is not prime");
         }

     }
     public static boolean isprime(int number){
         int i = 2;
         while (i < number){
             if (number % i == 0){
                 return false;
             }
             i++;
         }
         return true;
     }
}
