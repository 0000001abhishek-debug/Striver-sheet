// import java.util.*;
// class UnionOfArrays{
//     static ArrayList<Integer> unionBrute(int[] a, int[] b) {
//     ArrayList<Integer> list = new ArrayList<>();
//     for(int x : a) {
//         if (!list.contains(x)) {
//             list.add(x);
//         }
//     }
//     return list;}
// public static void main(String[] args) {
//         int[] arr1 = {1, 2, 3, 4};
//         int[] arr2 = {3, 4, 5, 6};
//         ArrayList<Integer> unionList = unionBrute(arr1, arr2);
//         System.out.println("Union of arrays: " + unionList);
//     }}

// import java.util.*;
// class UnionOfArrays{
//     static ArrayList<Integer> unionBetter(int[] a, int[] b) {
//     HashSet<Integer> set = new HashSet<>();

//     for (int x : a) {
//         set.add(x);
//     }
//     for(int x : b) {
//         set.add(x);
//     }
//     return new ArrayList<>(set);
// }

// public static void main(String[] args) {
//         int[] arr1 = {1, 2, 3, 4};
//         int[] arr2 = {3, 4, 5, 6};
//         ArrayList<Integer> unionList = unionBetter(arr1, arr2);
//         System.out.println("Union of arrays: " + unionList);

// }
// }

import java.util.*;
class UnionOfArrays {
    static ArrayList<Integer> unionOptimal(int[] a, int[] b) {
    ArrayList<Integer> result = new ArrayList<.();

    int i = 0, j = 0;

    while (i < a.length && j < b.length) {
        if ([i] <= b[j]) {
            if (result.size() == 0 || result.get(result.size() - 1) != a[i]) {
                result.add(a[i]);
            }
        }
    }
}

}

