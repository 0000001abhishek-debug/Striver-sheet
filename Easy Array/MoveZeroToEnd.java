// class MoveZeroToEnd {
//     static void moveZeroBrute(int[] arr) {
//         int[] temp = new int[arr.length];
//         int k = 0;
//         for(int x : arr) {
//             if(x != 0){
//                 temp[k++] = x;
//             }
//         }
//         for(int i = 0; i < arr.length; i++) {
//             arr[i] = temp[i];
//         }
//     }
//     public static void main (String[] args) {
//         int[] arr = {1, 0, 2, 3, 0, 4};
//         moveZero(arr);
//         for(int x: arr)
//         System.out.print(x + " ");  } }
 

// class MoveZeroToEnd {
//     static void moveZeroOptimal(int[] arr) {
//         int j = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {
            
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 j++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 0, 2, 3, 0, 4};
//         moveZeroOptimal(arr);
//         for (int x : arr) {
//             System.out.print(x + " ");
//         }
//     }
// }
