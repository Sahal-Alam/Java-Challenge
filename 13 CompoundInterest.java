import java.util.Scanner;

class CompoundInterest {
     static void main(String[] args) {
         Scanner compound = new Scanner(System.in);

         System.out.println("\nWelcome to Compound Interest Calculation!\n");
         System.out.print("Give the amount of principle in Taka: ");
         int principle = compound.nextInt();
         System.out.print("Give the time you want to borrow in year: ");
         float time = compound.nextFloat();
         System.out.print("Give the interest rate in percentage: ");
         double interestRate = compound.nextDouble();

         double compoundInterest = principle* Math.pow((1+interestRate/100),time);

         System.out.println("The Compound Interest is: "+compoundInterest+" Taka");
     }
}
