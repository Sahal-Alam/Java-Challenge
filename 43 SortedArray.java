import java.util.Scanner;

class SortedArray {
    static void main(String[] args) {
        System.out.println("Welcome to the sorted Array.\n");

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = Input.nextInt();

        int[] array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Enter element no "+(i + 1)+" : ");
            array[i] = Input.nextInt();
            i++;
        }
        boolean isInc = isIncreasing(array);
        boolean isDec = isDecreasing(array);
        if (isInc || isDec){
            System.out.println("The array is sorted");
        }else {
            System.out.println("The array is not sorted");
        }
    }
    public static boolean isIncreasing(int[] array){
        int i = 1;
        while (i < array.length){
            if (array[i] < array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean isDecreasing(int[] array){
        int i = 1;
        while (i < array.length){
            if (array[i] > array[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
