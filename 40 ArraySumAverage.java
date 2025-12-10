class ArraySumAverage {
    static void main(String[] args) {
        System.out.println("Welcome to Array sum average. \n");
        int[] newArray = ArrayUtility.array();
        long sum = sum(newArray);
        System.out.println("The sum of the newArray is: "+sum);
        double average = average(newArray);
        System.out.println("The average of the newArray is: "+average);
    }

    public static long sum(int[] array){
        long sum = 0;

        int i = 0;
        while (i < array.length){
            sum = sum + array[i];
            i++;
        }
        return sum;
    }
    public static double average(int[] array){
        long sum = sum(array);
        return (double)sum / array.length;
    }
}
