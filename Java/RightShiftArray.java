public class RightShiftArray {

    public static void rightShift(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        rightShift(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: 5 1 2 3 4
    }
}