import java.util.Scanner;

class BitwiseOddEven {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input a number: ");
         int num = input.nextInt();

         if ((num & 1) == 1){
             System.out.println(num+" is an Odd number.");
         }else {
             System.out.println(num+" is an Even number.");
         }
     }
}
