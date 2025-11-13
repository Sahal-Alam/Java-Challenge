import java.util.Scanner;

class CalculateGrade {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your mark: ");
         int mark = input.nextInt();

         if (mark>=90&&mark<=100){
             System.out.println("You got 'A' grade");
         } else if (mark>=75&&mark<90) {
             System.out.println("You got 'B' grade");
         } else if (mark>=60&&mark<75) {
             System.out.println("You got 'C' grade");
         } else if (mark>=30&&mark<60) {
             System.out.println("You got 'D' grade");
         }else {
             System.out.println("You got 'F' grade");
         }
     }
}
