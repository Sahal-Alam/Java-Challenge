import java.util.Scanner;

class ArmstrongNumber {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("\nWelcome to Armstrong Number\n");
         System.out.print("Input a number: ");
         int number = input.nextInt();
         boolean isArmstrong = isArmstrong(number);
         if (isArmstrong){
             System.out.println("Your number is Armstrong.");
         }else{
             System.out.println("Your number is not armstrong");
         }
     }

     public static boolean isArmstrong(int number){
         int noOfDigits = numberOfDigits(number);
         int numberCopy = number;
         int finalNumber = 0;
         while (number > 0){
             int lastDigit = number % 10;
             number = number / 10;
             finalNumber = finalNumber + pow(lastDigit , noOfDigits);
         }
         return finalNumber == numberCopy;
     }

    public static int pow(int num1 , int num2){
         int result = 1;
         int i = 0;
         while (i < num2){
             result = result *num1;
             i++;
         }
         return result;
    }


    public static int numberOfDigits(int number){
         int digits = 0;
         while (number > 0){
             digits++;
             number = number / 10;
         }
         return digits;
    }
}
