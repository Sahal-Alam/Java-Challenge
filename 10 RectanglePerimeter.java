import java.util.Scanner;

class RectanglePerimeter {
    static void main(String[] args) {
        Scanner rectangle = new Scanner(System.in);
        System.out.print("Give me the first number: ");
        int firstArm = rectangle.nextInt();
        System.out.print("Give me the second number: ");
        int secondArm = rectangle.nextInt();
        System.out.print("Give me the third number: ");
        int thirdArm = rectangle.nextInt();
        System.out.print("Give me the fourth number: ");
        int fourthArm = rectangle.nextInt();

        int perimeter = firstArm + secondArm + thirdArm + fourthArm;

        System.out.println("\n The perimeter of the rectangle is: "+perimeter);
    }
}
