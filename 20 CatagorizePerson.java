import java.util.Scanner;

class CatagorizePerson {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your age: ");
         int age = input.nextInt();

         if (age<13){
             System.out.println("You are Child");
         } else if (age>=13&&age<20) {
             System.out.println("You are Teen");
         } else if (age>=20&&age<60) {
             System.out.println("You are Adult");
         }else {
             System.out.println("You are Senior");
         }
     }
}
