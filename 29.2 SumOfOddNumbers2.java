import java.util.Scanner;

class SumOfOddNumbers2 {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Sum Of Odd Numbers\n");
         System.out.print("Input a number: ");
         int number = input.nextInt();
         int sum = sumOfOdd(number);
         System.out.println("Sum of odd till "+number+" = "+sum);
     }
     public static int sumOfOdd(int number){
         int i = 1;
         int sum = 0;
         while (i <= number){
             sum = sum + i;
             i = i+2;
         }
         return sum;
     }
}
