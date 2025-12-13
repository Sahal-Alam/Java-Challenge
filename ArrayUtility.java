import java.util.Scanner;

public class ArrayUtility {
    public static int[] array(){
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < size){
            System.out.print("Enter element no "+(i+1)+" :");
            array[i] = Input.nextInt();
            i++;
        }
        return array;
    }
    public static void displayArray(int[] array){
        int i = 0;
        while (i < array.length){
            System.out.print(array[i]+ " ");
            i++;
        }
    }
}
