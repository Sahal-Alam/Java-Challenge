import java.util.Scanner;

class PalindromeNumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("\nWelcome to Palindrome Number.\n");
         System.out.print("Input a number: ");
         int number = input.nextInt();
         boolean isPalindrome = isPalindrome(number);
         if (isPalindrome){
             System.out.println("Your number is Palindrome");
         } else {
             System.out.println("Your number is not Palindrome");
         }
     }
     public static boolean isPalindrome(int number){
         return number == reverse(number);
     }

     public static int reverse(int number){
         int newNumber = 0;
         while (number > 0){
             int digit = number % 10;
             newNumber = newNumber * 10 +digit;
             number = number / 10;
         }
         return newNumber;
     }
}
