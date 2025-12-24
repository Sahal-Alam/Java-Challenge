class PalindromeArray {
    static void main(String[] args) {
        int[] array = ArrayUtility.array();
        boolean isPalin = isPalindrome(array);
        if (isPalin){
            System.out.println("The array is palindrome.");
        }else {
            System.out.println("The array is not palindrome.");
        }
    }
    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while (i < arr.length / 2){
            if (arr[i] != arr[arr.length - 1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
