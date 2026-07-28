import java.utils.Arrays;
public class Arrayreversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60,22,44,13,57};
        System.out.println("Original Array: "+Arrays.toString(numbers));
        reverse(numbers);
        System.out.println("Reversed Array"+Arrays.toString(numbers));
    }

    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        //if we do know the length of array we go for "for loop" or else go for "while loop"
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }
}