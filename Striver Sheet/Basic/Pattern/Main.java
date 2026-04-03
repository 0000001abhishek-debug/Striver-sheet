// public class Main {
//   public void pattern(int N) {
//     for(int i = 1; i <= N; i++) {
//       for(int j = 1; j <= N; j++) {
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
//   public static void main(String[] args) {
//     Main obj = new Main();
//     int N = 5;
//     obj.pattern(N);
//   }
// }

// public class Main {
//   public void pattern(int N) {
//     for(int i = 0; i < N; i++) {
//       for(int j = 0; j <= i; j++) {
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }

//     public static void main(String[] args) {
//       Main obj = new Main();
//       int N = 5;
//       obj.pattern(N);
//     }
  
// }

// public class Main {
//   public void pattern(int N) {
//     for(int i = 1; i < N; i++) {
//       for(int j = 1; j <= i; j++) {
//         System.out.print(j + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String[] args) {
//     Main obj = new Main();
//     int N = 5;
//     obj.pattern(N);
//   }
// }
 
// class Main {
//     public void pattern(int N) {
      
//         for (int i = 1; i <= N; i++) {
  
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i + " ");
//             }
//             System.out.println();
//         }
//     }
//  public static void main(String[] args) {
//         Main obj = new Main();
//         int N = 5;
//         obj.pattern(N);
//     }
// }

// public class Main { 
//   public void pattern(int N) {
//     for (int i = 0; i < N; i++) {
//       for (int j = N; j < i; j++) {
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }

// public static void main(String[] args) {
//   Main obj = new Main();
//   int N = 5;
//   obj.pattern(N);
// }
// }

class Main {
    
    public void pattern6(int N) {
      
        for (int i = 0; i < N; i++) {
          
            for (int j = N; j > i; j--) {
                System.out.print((N - j + 1) + " ");
            }
                        System.out.println();
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        int N = 5;
        main.pattern6(N);
    }
}
