import java.util.Scanner;

class LoopPatterns {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to the Pattern Print.\n");
        System.out.print("Input a number: ");
        int number = input.nextInt();
        printRightHalfPyramid(number);
        printReverseRightHalfPyramid(number);
        printLeftHalfPyramid(number);
    }

    public static void printLeftHalfPyramid(int maxRows){
        System.out.println("Left Half Pyramid");
        int rows = maxRows;
        while (rows > 0){
            //Space print
            int j = 1;
            while (j < rows){
                System.out.print("  ");
                j++;
            }

            //Star print
            int i = 0;
            while (i <= (maxRows-rows)){
                System.out.print("* ");
                i++;
            }

            System.out.println();
            rows--;
        }
    }


    public static void printReverseRightHalfPyramid(int maxRows){
        System.out.println("Reverse Right Half Pyramid");
        int rows = maxRows;
        while (rows > 0){
            int i = 0;
            while (i < rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }


    public static void printRightHalfPyramid(int maxRows){
        System.out.println("Right Half Pyramid");
        int rows = 0;
        while (rows < maxRows){
            System.out.print("*");
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
}
