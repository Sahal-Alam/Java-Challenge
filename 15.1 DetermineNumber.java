import java.util.Scanner;

class DetermineNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Number Determination Program\n");

        System.out.print("Please enter your number: ");
        int number = input.nextInt();

        if (number > 0){
            System.out.println("Your entered number is Positive!");
        } else if (number < 0) {
            System.out.println("Your entered number is negative!");
        }else {
            System.out.println("Your entered number is Zero!");
        }
        System.out.println("Thank you.");
    }
}
