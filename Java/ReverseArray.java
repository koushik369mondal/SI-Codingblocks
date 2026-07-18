public class ReverseArray {

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };

        reverse(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: 5 4 3 2 1
    }
}