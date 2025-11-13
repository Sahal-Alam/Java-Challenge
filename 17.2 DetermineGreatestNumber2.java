import java.util.Scanner;

class DetermineGreatestNumber2 {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Input first number: ");
         int num1 = input.nextInt();
         System.out.print("Input second number: ");
         int num2 = input.nextInt();
         System.out.print("Input third number: ");
         int num3 = input.nextInt();

         if (num1>=num2 && num1>=num3){
             System.out.println(num1+" is the greatest");
         } else if (num2>=num3) {
             System.out.println(num2+" is the greatest");
         }else {
             System.out.println(num3+" is the greatest.");
         }
     }
}
