import java.util.Arrays;
import java.util.Scanner;

class DeletingFromArray {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome to Deleting an element from an Array.\n");

        System.out.print("Input the size of the Array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element no " + (i + 1) + " : ");
            array[i] = Input.nextInt();
            i++;
        }

        System.out.print("Enter a number that occurred: ");
        int number = Input.nextInt();
        int found = 0 , i1 = 0;
        while (i1 < array.length){
            if (array[i1] == number){
                found++;
            }
            i1++;
        }
        System.out.println("The number "+number+" found "+found+" times in the array.");

        int newSize = array.length - found;
        System.out.println("The new array size is: "+newSize);
        int[] newArray = new int[newSize];

        int j = 0 , k = 0;
        while (j < array.length){
            if (array[j] != number){
                newArray[k] = array[j];
                k++;
            }
            j++;
        }
        System.out.print("The new Array is: "+ Arrays.toString(newArray));
    }
}
