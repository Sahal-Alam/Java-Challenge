import java.util.Scanner;

class FahrenheitToCelcius {
     static void main(String[] args) {
         Scanner temperature = new Scanner(System.in);
         System.out.println("\nWelcome to the Temperature Calculator!\n");

         System.out.print("The value of Fahrenheit: ");
         double fahrenheit = temperature.nextDouble();

         double celcius = (fahrenheit-32)* 5/9;
         System.out.println("Current Temperature of Celcius is: "+celcius+" degree");
     }
}
