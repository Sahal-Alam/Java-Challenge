import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Swapping!!\n");
        System.out.print("Enter the value of A: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of B: ");
        int b = scanner.nextInt();

        int c = a;
         a = b;
         b = c;

        System.out.println("\nThe swap has been done!\n");
        System.out.println("Value of A is: "+a);
        System.out.println("Value of B is: "+b);
    }
}
