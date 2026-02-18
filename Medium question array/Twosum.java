class Solution {

    // Check if pair exists (returns YES or NO)
    public String twoSumExists(int[] arr, int target) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    return "YES";
                }
            }
        }

        return "NO";
    }

    // Return indices of the pair
    public int[] twoSumIndices(int[] arr, int target) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}

public class twosum {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        // Variant 1
        System.out.println("Pair Exists: " + sol.twoSumExists(arr, target));

        // Variant 2
        int[] res = sol.twoSumIndices(arr, target);
        System.out.println("Indices: [" + res[0] + ", " + res[1] + "]");
    }
}
