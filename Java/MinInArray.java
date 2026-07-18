public class MinInArray {

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 9, 1, 7, 5 };

        System.out.println("Minimum element: " + findMin(nums)); // Output: 1
    }
}