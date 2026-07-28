import java.utils.Arrays;
public class ArrayDuplicates {
    public static void main(String[] args){
        int[] sortedArray = {1, 1, 2, 2, 3, 4, 4, 5, 5, 5,11,11,34,54,66,66};

        System.out.println("Original array: "+Arrays.toString(sortedArray));
        int uniqueCount = removeDuplicates(sortedArray);
        System.out.print("Array after removing duplicates: [");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(sortedArray[i]);
            if (i < uniqueCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Number of unique elements: " + uniqueCount);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}