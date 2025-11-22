import java.util.Scanner;

class LeastCommonMultiple {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Least Common Multiple.\n");
        System.out.print("Input first number: ");
        int first = input.nextInt();
        System.out.print("Input second number: ");
        int second = input.nextInt();
        int lcm = leastCommonMultiple(first , second);
        System.out.println("Least Common Multiple of "+first+" and "+second+" is: "+lcm);

    }

    public static int leastCommonMultiple(int first , int second){
        int i = 1;
        while ( i <= second){
            int factor = first * i;
            if (factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
