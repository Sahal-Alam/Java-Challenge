import java.util.Scanner;

class MultiplicationTable2 {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to Multiplication World\n");
         System.out.print("Input a number: ");
         int number = input.nextInt();
         printMultiplicationTable(number);
     }
     public static void printMultiplicationTable(int number){
         int i = 1;
         while (i <= 10){
             System.out.println(number+ " * "+i+" = "+(number*i));
             i++;
         }
     }
}
