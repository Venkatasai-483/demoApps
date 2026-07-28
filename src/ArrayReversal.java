public class ArrayReversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
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