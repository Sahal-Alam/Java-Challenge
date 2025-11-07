import java.util.Scanner;

class SimpleInterest {
     static void main(String[] args) {
         Scanner interest = new Scanner(System.in);
         System.out.println("\nWelcome to the calculation of Simple Interest!\n");
         System.out.print("Give the amount of principal in taka: ");
         int taka = interest.nextInt();
         System.out.print("Give the time in year: ");
         float year = interest.nextFloat();
         System.out.print("Give the interest rate in percentage: ");
         double interestRate = interest.nextDouble();

         double rate = (taka*year*interestRate)/100;

         System.out.println("The Simple Interest is : "+rate+"taka");
     }
}
