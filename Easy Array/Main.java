class Solution {
    public int secondLargest(int[] arr) 
    {
        int n = arr.length;
        int largest = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];

            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }
}

public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 10, 3};

        System.out.println("Second Largest: " + Solution.secondLargest(arr));
    }
}