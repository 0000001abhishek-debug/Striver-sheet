//1. check maximum and minimum of three numbers
// import java.util.Scanner;
// class Pratice2 {
//   static void maxMin(int a, int b, int c) {
//     int max = Math.max(a, Math.max(b, c));
//     int min = Math.min(a, Math.min(b, c));
//     System.out.println("Maximum = " + max);
//     System.out.println("Minimum = " + min);
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a first number:");
//     int a = sc.nextInt();
//     System.out.println("Enter a second number:");
//     int b = sc.nextInt();
//     System.out.println("Enter a third number:");
//     int c = sc.nextInt();
//     maxMin(a, b, c);}}

//2. check a number is even or odd
// import java.util.Scanner;
// class Pratice2 {
//   static void evenOdd(int num) {
//     if (num % 2 == 0) {
//       System.out.println("Even: " + num);
//     } else {
//       System.out.println("Odd: " + num);
//     }
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number:");
//     int num = sc.nextInt();
//     evenOdd(num);}}

//3. check a person be eligible for vote or not
// import java.util.Scanner;
// class Pratice2 {
//   static void checkVote(int age) {
//     if (age >= 18) {
//       System.out.println("You are eligible for vote:");
//     } else {
//       System.out.println("You are not eligible for vote:");
//     }   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your age:");
//     int age = sc.nextInt();
//     checkVote(age);}}

//4. Add two number
// import java.util.Scanner;
// class Pratice2 {
//   static void add(int a, int b) {
//     System.out.println("Add : " + (a + b));
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a first number:");
//     int a = sc.nextInt();
//     System.out.println("Enter a second number:");
//     int b = sc.nextInt();
//     add(a, b); }}

//5. check a number is prime or not 
// import java.util.Scanner;
// class Pratice2 {
//   static void prime(int num) {
//     boolean isPrime = true;
//     if(num <= 1) {
//       isPrime = false;
//     } else {
//       for (int i = 2; i <= num / 2; i++) {
//         if (num % i == 0) {
//           isPrime = false;
//           break;
//         }
//       }
//       if (isPrime) {
//         System.out.println("Prime: " + num);
//       } else {
//         System.out.println("Not prime: " + num);
//       }
//     }
//     }
//     public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter a number:");
//       int num = sc.nextInt();
//       prime(num);
//     }
//   }

//6. grade calculator 
// import java.util.Scanner;
// class Pratice1 {
//   static void grade(int marks) {
//     if (marks >= 91 && marks <= 100) {
//       System.out.println("Grade: AA");
//     } else if (marks >= 81) {
//       System.out.println("Grade: AB");
//     } else if (marks >= 71) {
//       System.out.println("Grade: BB");
//     } else if (marks >= 61) {
//       System.out.println("Grade: BC");
//     } else if (marks >= 51) {
//       System.out.println("Grade: CD");
//     } else if (marks >= 41) {
//       System.out.println("Grade: DD");
//     } else {
//       System.out.println("Grade: Fail");
//     }
//   }
//   public static void main(String[] args) {
//     // Scanner sc = new Scanner(System.in);
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your marks:");
//     int marks = sc.nextInt();
//     grade(marks);
//   }
// }

//7. Write a function to find if a number is a palindrome or not. Take number as parameter.
// import java.util.Scanner;
// class Pratice2 {
//   static void palindrome(int num) {
//     int original = num;
//     int reverse = 0;

//     while (num > 0) {
//       int digit = num % 10;
//       reverse = reverse * 10 + digit;
//       num = num / 10;
//     }

//     if (original == reverse) {
//       System.out.println("Palindrome: " + original);
//     } else {
//       System.out.println("Not Palindrome:" + original);
//     }
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number:");
//     int num = sc.nextInt();
//     palindrome(num);}}

//8. Factorial of a number 
// import java.util.Scanner;
// class Pratice2 {
//   static int factorial(int num) {
//     int fact = 1;
//     for (int i = 1; i <= num; i++) {
//       fact = fact * i;
//     }
//     return fact;
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number:");
//     int num = sc.nextInt();
//     int result = factorial(num);
//     System.out.println("Factorial:" + result);}}

//9. Pythagorean triplet
// import java.util.Scanner;
// class Pratice2 {
//   static void pythagoreanTriplet(int a, int b, int c) {
//     if ((a * a + b * b == c * c) ||
//         (a * a + c * c == b * b) ||
//         (b * b + c * c == a * a))
//       System.out.println("Pythagorean triplet: ");
//     else {
//       System.out.println("Not a Pythagorean triplet:");
//     }
//   }
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a first number:");
//     int a = sc.nextInt();
//     System.out.println("Enter a second number:");
//     int b = sc.nextInt();
//     System.out.println("Enter a third number:");
//     int c = sc.nextInt();
//     pythagoreanTriplet(a, b, c);}}

//10. sum of first n natural number 
import java.util.Scanner;

class Pratice2 {
  static int sumofNatural(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = sc.nextInt();
    int result = sumofNatural(n);
    System.out.println("Sum of first" + n + "natural number: " + result);}}
 