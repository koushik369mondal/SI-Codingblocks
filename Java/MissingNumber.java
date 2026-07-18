public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber solver = new MissingNumber();
        int[] nums = { 3, 0, 1 };

        System.out.println("Missing Number: " + solver.missingNumber(nums)); // Output: 2
    }
}