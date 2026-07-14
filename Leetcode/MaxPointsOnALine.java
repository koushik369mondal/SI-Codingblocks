// leetcode - 149

import java.util.HashMap;
import java.util.Map;

public class MaxPointsOnALine {

    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2)
            return n; // 2 or fewer points will always form a line

        int maxPointsOnLine = 1;

        for (int i = 0; i < n; i++) {
            // Map to store slope frequency as a string: "dy/dx"
            Map<String, Integer> slopeMap = new HashMap<>();
            int currentMax = 0;

            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                // Reduce the fraction using GCD to get a unique representation of the slope
                int gcd = gcd(dx, dy);
                dx /= gcd;
                dy /= gcd;

                // Handle signs strictly so that (-1/-2) matches (1/2) and (-1/2) matches (1/-2)
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                } else if (dx == 0) {
                    // Vertical line slope representation
                    dy = 1;
                }

                String slope = dy + "/" + dx;
                slopeMap.put(slope, slopeMap.getOrDefault(slope, 0) + 1);
                currentMax = Math.max(currentMax, slopeMap.get(slope));
            }

            // +1 accounts for the anchor point 'i' itself
            maxPointsOnLine = Math.max(maxPointsOnLine, currentMax + 1);
        }

        return maxPointsOnLine;
    }

    // Helper method to find Greatest Common Divisor
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Main method to test the code
    public static void main(String[] args) {
        MaxPointsOnALine solver = new MaxPointsOnALine();

        // Example: Points [(1,1), (3,2), (5,3), (4,1), (2,3), (1,4)]
        int[][] points = { { 1, 1 }, { 3, 2 }, { 5, 3 }, { 4, 1 }, { 2, 3 }, { 1, 4 } };

        System.out.println("Maximum points on a line: " + solver.maxPoints(points));
        // Output should be 4 (Points: [1,4], [2,3], [3,2], [4,1] form a line)
    }
}