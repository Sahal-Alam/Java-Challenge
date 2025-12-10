import java.util.Scanner;

class MaximumMinimumElement {
    static void main(String[] args) {
        System.out.println("Welcome to find maximum and minimum element in an Array.\n");

        Scanner Input = new Scanner(System.in);
        System.out.print("Input the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element no "+(i+1)+" : ");
            array[i] = Input.nextInt();
            i++;
        }
        int maximum = maximum(array);
        System.out.println("The maximum element of the array is: "+maximum);
        int minimum = minimum(array);
        System.out.println("The minimum element of the array is: "+minimum);
    }
    public static int maximum(int[] array){
        int max = 0;
        int i = 0;
        while (i < array.length){
            if (array[i] > max){
                max = array[i];
            }
            i++;
        }
        return max;
    }
    public static int minimum(int[] array){
        int min = array[0];
        int i = 0;
        while (i < array.length){
            if (array[i] < min){
                min = array[i];
            }
            i++;
        }
        return min;
    }
}
