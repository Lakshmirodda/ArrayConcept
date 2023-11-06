import java.util.Scanner;

public class Apalin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        if (isPalindrome(array)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
    public static boolean isPalindrome(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}