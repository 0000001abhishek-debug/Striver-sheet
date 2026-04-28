//1. Build array from permutation
// class Pratice3 {
//   public int[] buildArray(int[] nums) {

//     int[] ans = new int[nums.length];

//     for (int i = 0; i < nums.length; i++) {
//       ans[i] = nums[nums[i]];
//     }
//     return ans;
//   }

//   public static void main(String[] args) {
//     int[] nums = { 0, 2, 1, 5, 3, 4 };
//     Pratice3 obj = new Pratice3();
//     int[] result = obj.buildArray(nums);
//     System.out.println("Result:");

//     for (int num : result) {
//       System.out.println("" + num);
//     }
//   }
// }

//2. Minimum Cost to Move Chips to The Same Position
// class Pratice3 {
//   public int minCostToMoveChips(int[] position) {
//     int evenCount = 0;
//     int oddCount = 0;

//     for (int pos : position) {
//       if (pos % 2 == 0) {
//         evenCount++;
//       } else {
//         oddCount++;
//       }
//     }
//     return Math.min(evenCount, oddCount);
//   }

//   public static void main(String[] args) {
//     int[] position = { 1, 2, 3 };
//     Pratice3 obj = new Pratice3();
//     int result = obj.minCostToMoveChips(position);
//     System.out.println("Minimum cost to move chips:" + result);

//   }
// }
//3.Minimum Cost to Move Chips to The Same Position
class Pratice3 {
  public int minCostToMoveChips(int[] position) {
    int evenCount = 0;
    int oddCount = 0;

    for (int pos : position) {
      if (pos % 2 == 0) {
        evenCount++;
      } else {
        oddCount++;
      }
    }
    return Math.min(evenCount, oddCount);
  }
  public static void main(String[] args) {
    int[] position = {1, 2, 3};
    Pratice3 obj = new Pratice3();
    int result = obj.minCostToMoveChips(position);
    System.out.println("Minimum cost to move chips:" + result);
  }
}