import java.util.Scanner;

class ArithmeticOperators {
    static void main(String[] args) {
        Scanner arithmetic = new Scanner(System.in);
        System.out.print("Give the 1st number: ");
        int first = arithmetic.nextInt();
        System.out.print("Give the 2nd number: ");
        int second = arithmetic.nextInt();

        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        double div = first / second;
        double mod = first % second;
        System.out.println("The summation is: "+add);
        System.out.println("The subtraction is: "+sub);
        System.out.println("The multiplication is : "+mul);
        System.out.println("The division is: "+div);
        System.out.println("The modulus is: "+mod);
    }
}
