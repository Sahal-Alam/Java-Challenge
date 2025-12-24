import java.util.Arrays;
import java.util.Scanner;

class ArrayReverse {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome to array reverse.\n");

        System.out.print("Input the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element no "+(i + 1)+" : ");
            array[i] = Input.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(reverseArray(array)));
    }
    public static int[] reverseArray(int[] array){
        int i = 0 , j = array.length - 1;
        while (i < j){
            int c = array[i];
            array[i] = array[j];
            array[j] = c;
            i++;
            j--;
        }
        return array;
    }
}
