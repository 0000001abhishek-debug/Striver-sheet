class Solution {

    public static int[] twoSum(int[] arr, int target) {

        int n = arr.length;

        // Check all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        // If no solution found
        return new int[] {-1, -1};
    }
}

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = Solution.twoSum(arr, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
