public class GCDOfArray {

    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // Find the minimum and maximum elements in the array
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Calculate and return the GCD of min and max
        return getGCD(min, max);
    }

    // Helper method using the Euclidean algorithm
    private int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        GCDOfArray solver = new GCDOfArray();

        int[] nums = { 2, 5, 6, 9, 10 };
        System.out.println("GCD: " + solver.findGCD(nums));
        // Output: 2 (min is 2, max is 10, GCD(2,10) = 2)
    }
}