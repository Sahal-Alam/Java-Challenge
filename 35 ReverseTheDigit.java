import java.util.Scanner;

class ReverseTheDigit {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("\nWelcome to Digit Reversing\n");
         System.out.print("Input a number: ");
         int number = input.nextInt();
         int reverse = reverse(number);
         System.out.println("The reverse of the number is: "+reverse);

     }
      public static int reverse(int number){
         int newNum = 0;
         while ( number > 0 ){
             int digit = number % 10;
             newNum = newNum * 10 + digit;
             number = number / 10;
         }
         return newNum;
      }
}
