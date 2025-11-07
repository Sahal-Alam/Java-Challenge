import java.util.Scanner;

class AreaOfTriangle {
    static void main(String[] args) {
        Scanner triangle = new Scanner(System.in);
        System.out.println("\nWelcome to calculate the Are of a Triangle!");

        System.out.print("\nGive the base of the triangle in cms: ");
        float base = triangle.nextFloat();
        System.out.print("Give the height of the triangle in cms: ");
        float height = triangle.nextFloat();

        double area = /*1.0/2.0**/(base*height)/2;

        System.out.println("The Area of the Triangle is: "+area+"cm2");
    }
}
