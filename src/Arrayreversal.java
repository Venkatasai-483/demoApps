import java.utils.Arrays;
public class Arrayreversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        System.out.println("Original Array: "+Arrays.toString(numbers));
        reverse(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }
}