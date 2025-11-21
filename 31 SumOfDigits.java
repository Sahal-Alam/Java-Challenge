import java.util.Scanner;

class SumOfDigits {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum Of Digits\n");
        System.out.print("Input a number: ");
        int number = input.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("The sum of the digits of "+number+" is: "+sum);
    }
    public static int sumOfDigits(int number){
        int sum = 0;
        while (number > 0){
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
