import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int num : arr) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> uniqueCounts = new HashSet<>();
        for (int count : frequencies.values()) {
            if (!uniqueCounts.add(count)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        UniqueOccurrences solver = new UniqueOccurrences();
        int[] arr = {1, 2, 2, 1, 1, 3};

        System.out.println("Are frequencies unique? " + solver.uniqueOccurrences(arr)); // Output: true
    }
}