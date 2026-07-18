public class LeftShiftArray {

    public static void leftShift(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        leftShift(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: 2 3 4 5 1
    }
}