import java.util.Scanner;

class DeleteFromArray {
    static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome to Deleting an element from an Array.\n");

        int[] array = ArrayUtility.array();

        System.out.print("Enter a number you want to delete: ");
        int numToDelete = Input.nextInt();

        int[] newArray = deleteNumber(array , numToDelete);
        System.out.println("Here is your new array: ");
        ArrayUtility.displayArray(newArray);
    }
    public static int[] deleteNumber(int[] array , int numToDelete){
        int occurrences = NumberOfOccurrencesInAnArray.search(array , numToDelete);
        if (occurrences == 0){
            return array;
        }
        int newSize = array.length - occurrences;
        int[] newArray = new int[newSize];

        int i = 0 , j = 0 ;
        while (i < array.length){
            if (array[i] != numToDelete){
                newArray[j] = array[i];
                j++;
            }
            i++;
        }
        return newArray;
    }
}
