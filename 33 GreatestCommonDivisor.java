import java.util.Scanner;

class GreatestCommonDivisor {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Greatest Common Divisor.\n");
        System.out.print("Input first number: ");
        int first = input.nextInt();
        System.out.print("Input second number: ");
        int second = input.nextInt();
        int gcd = GreatestCommonDivisor(first , second);
        System.out.println("The Greatest Common Divisor of "+first+" and "+second+" is: "+gcd);

    }

    public static int GreatestCommonDivisor(int first, int second){
        int gcd = 1;
        int i =2;
        int least = least(first , second);
        while (i <= least){
            if (first % i == 0 && second % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least (int first , int second){
        if (first < second){
            return first;
        } else {
            return second;
        }
    }
}
