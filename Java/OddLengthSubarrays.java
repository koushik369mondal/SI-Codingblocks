// leetcode - 1588

public class OddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int totalSum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int startChoices = i + 1;
            int endChoices = n - i;
            int totalSubarrays = startChoices * endChoices;
            int oddSubarrays = (totalSubarrays + 1) / 2;

            totalSum += oddSubarrays * arr[i];
        }

        return totalSum;
    }

    public static void main(String[] args) {
        OddLengthSubarrays solver = new OddLengthSubarrays();
        int[] arr = { 1, 4, 2, 5, 3 };
        System.out.println("Sum: " + solver.sumOddLengthSubarrays(arr)); // Output: 58
    }
}
