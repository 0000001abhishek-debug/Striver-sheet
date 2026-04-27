package Pratice;
//1. check a number is odd or even 
//  import java.util.Scanner;
// class Practice {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a Number");
//     int num = sc.nextInt();

//     if (num % 2 == 0) {
//       System.out.println("Even");
//     } else {
//       System.out.println("Odd");
//     } }}

//2. Greeting message
// import java.util.Scanner;

// public class Practice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your name: ");

//         String name = sc.nextLine();

//         System.out.println("Hello " + name + " Welcome!");
//   }}

//3. Palidrome
// import java.util.Scanner;

// class Pratice {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     // sc.nextLine(); // consume newline
//     System.out.println("\n\nEnter a String:");
//     String str = sc.nextLine();

//     String rev = "";

//     for (int i = str.length() - 1; i >= 0; i--) {
//       rev = rev + str.charAt(i);
//     }

//     if (str.equalsIgnoreCase(rev)) {
//       System.out.println("String is palindrome: ");
//     } else {
//       System.out.println("String is not Palindrome: ");
//     }}}

// class Pratice {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//1. to find a nuber be even or odd 
//        System.out.println("Even or ODD");
//        System.out.println("Enter a Number");
//
//        int num = sc.nextInt();
//
//        if (num % 2 == 0) {
//            System.out.println("Number is even");
//        } else {
//            System.out.println("Number is odd");
//        }
//    }
//}
//2. Greatting a msg
//System.out.println("GREETING MSG");
//sc.nextLine();
//System.out.println("Enter your name");
//String name = sc.nextLine();
//
//System.out.println("Hello " + name + " Welcome." );
//    }
//}
//3.Simlple interest
//System.out.println("Simple Interest");
//System.out.println("ENter principal: ");
//double p = sc.nextDouble();
//
//System.out.println("Enter Time: ");
//double t = sc.nextDouble();
//
//System.out.println("Enter Rate: ");
//double r = sc.nextDouble();
//
//double si = (p * t * r) / 100;
//System.out.println("Simple Interest = " + si);
//    }}
//4.Calculator usig conditions 
//System.out.println("Calculator");
//System.out.println("Enter first number: ");
//double a = sc.nextDouble();
//
//System.out.println("Enter second number: ");
//double b = sc.nextDouble();
//
//System.out.println("Enter operator (+, -, *, /): ");
//char op = sc.next().charAt(0);
//
//if (op == '+') {
//    System.out.println("Result = " + (a + b));
//} else if (op == '-') {
//    System.out.println("Result = " +(a - b));
//} else if (op == '*') {
//    System.out.println("Result = " + (a * b));
//} else if (op == '/') {
//    if (b != 0) {
//        System.out.println("Result = " +(a / b));
//    } else {
//        System.out.println("Division by zero is not allowed");
//    }    
//    } else {
//    System.out.println("Invalid Operator: ");
//}}}
//5. largest number
//System.out.println("Enter a first nimber: ");
//int a = sc.nextInt();
//
//System.out.println("Enter second number: ");
//int b = sc.nextInt();
//
//if (a > b) {
//    System.out.println("largest number is: " + a);
//} else {
//    System.out.println("largest number is: " + b);
//}
//    }}
//6. currency conversion (Rupees to usd)
//System.out.println("Enter amount in rupees: ");
//double rupees = sc.nextDouble();
//
//double usd = rupees / 83.0;
//System.out.println("Amount in usd: $" + usd);
//    }}
//7.fibonacci series up to n numbers
//System.out.println("Enter no of terms for fibonacci series: ");
//int n = sc.nextInt();
//
//int first = 0,
//        second = 1;
//System.out.println("fibonacci series:");
//
//for (int i = 1; i <= n; i++) {
//System.out.println(first + " ");
//int next = first + second;
//first = second;
//second = next;
//}
//    }}

//4. Armstong
// import java.util.Scanner;

// class Pratice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("\nEnter starting number:");
//         int start = sc.nextInt();

//         System.out.println("Enter ending number:");
//         int end = sc.nextInt();

//         System.out.println("Armstrong Numbers between " + start + " and " + end + ":");

//         for (int num = start; num <= end; num++) {
//             int temp = num;
//             int sum = 0;
//             int digits = String.valueOf(num).length();

//             while (temp > 0) {
//                 int digit = temp % 10;
//                 sum += Math.pow(digit, digits);
//                 temp = temp / 10;
//             }

//             if (sum == num) {
//                 System.out.print(num + " ");
//             }
//         }

//         sc.close();
//     }
// }
