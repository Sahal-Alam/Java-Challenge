import java.util.Scanner;

class DetermineOddEven2 {
     static void main(String[] args) {
         Scanner input =  new Scanner(System.in);
         System.out.print("Input a number: ");
         int number = input.nextInt();

         if (!(number%2==0)){
             System.out.println(number+" is an odd number");
         }else {
             System.out.println(number+" is an even number");
         }
     }
}
