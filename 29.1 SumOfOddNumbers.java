import java.util.Scanner;

class SumOfOddNumbers {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int number = input.nextInt();

         int i = 0;
         int sum = 0;

         while (i <= number){
             if (i % 2 != 0){
                 System.out.print(i+" + ");
                 sum = sum + i;
             }
             i++;
         }
         System.out.println("= "+sum);
     }
}
