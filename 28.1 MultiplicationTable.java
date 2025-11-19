import java.util.Scanner;

class MultiplicationTable {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int number = input.nextInt();

         int i = 1;
         int multiplication = 0;
         while (i <= 10){
             multiplication = number * i;
             System.out.println(number+" * "+i+" = "+multiplication);
             i++;
         }
     }
}
