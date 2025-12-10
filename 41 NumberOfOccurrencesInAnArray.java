import java.util.Scanner;

class NumberOfOccurrencesInAnArray {
    static void main(String[] args) {
        System.out.println("Welcome to Array Occurrence.\n");
        int[] arrayOccur = ArrayUtility.array();

        Scanner Input = new Scanner(System.in);
        System.out.print("Input a number you want to search: ");
        int number1 = Input.nextInt();

        int number = search( arrayOccur , number1);
        System.out.println("The number "+number1+" has been found "+number+" times in the array.");
    }
    public static int search(int[] array, int number2){
        int found = 0;
        int i = 0;
        while (i < array.length){
            if (number2 == array[i]){
                found++;
            }
            i++;
        }
        return found;
    }
}
