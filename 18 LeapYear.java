import java.util.Scanner;

class LeapYear {
     static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter a year: ");
         int year = input.nextInt();

         if ((year%4==0||!(year%100==0))&&year%400==0){
             System.out.println(year+" is leap year");
         }else {
             System.out.println(year+" is not leap year");
         }
     }
}
