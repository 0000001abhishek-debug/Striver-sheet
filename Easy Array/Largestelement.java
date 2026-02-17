// class Solution {
//     public static int findLargestbrute(int[] arr) {

//         int n = arr.length;
//         int largest = arr[0];

//         for (int i = 0; i < n; i++) {

//             boolean isLargest = true;

//             for (int j = 0; j < n; j++) {
//                 if (arr[j] > arr[i]) {
//                     isLargest = false;
//                     break;
//                 } }
//             if (isLargest) {
//                 largest = arr[i];
//                 break;
//             } }
//         return largest;
//     }}
// public class Main {
//     public static void main(String[] args) {

//         int[] arr1 = {2, 5, 1, 3, 0};
//         int[] arr2 = {8, 10, 5, 7, 9};

//         System.out.println("Largest in arr1: " + Solution.findLargestbrute(arr1));
//         System.out.println("Largest in arr2: " + Solution.findLargestbrute(arr2));
//     }
// }
class Solution{
    public static int findLargestbetter(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i< arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
public class Largestelement{
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 3};
        System.out.println("largest element: " + Solution.findLargestbetter(arr));
    }
}

