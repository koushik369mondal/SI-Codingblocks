class VersionControl {
    private int badVersion = 4; // You can change this to test different cases

    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

public class BadVersion extends VersionControl {

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        BadVersion solver = new BadVersion();
        int totalVersions = 5;

        System.out.println("First Bad Version: " + solver.firstBadVersion(totalVersions)); // Output: 4
    }
}