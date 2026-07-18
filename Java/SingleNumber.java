public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        SingleNumber solver = new SingleNumber();
        int[] nums = { 4, 1, 2, 1, 2 };

        System.out.println("Single Number: " + solver.singleNumber(nums)); // Output: 4
    }
}