public class RunningSum {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        RunningSum solver = new RunningSum();
        int[] nums = { 1, 2, 3, 4 };

        int[] result = solver.runningSum(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: 1 3 6 10
    }
}