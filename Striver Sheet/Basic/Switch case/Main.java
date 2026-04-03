// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//         int day;
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a Number(1-7)");
//         day = sc.nextInt();

//         switch(day){
//             case 1:
//                 System.out.println("Monday");
//                 break;

//             case 2:
//                 System.out.println("Tuesday");
//                 break;

//                 case 3:
//                 System.out.println("Wednesday");
//                 break;

//                  case 4:
//                 System.out.println("Thursday");
//                 break;

//                  case 5:
//                 System.out.println("Friday");
//                 break;

//                  case 6:
//                 System.out.println("Saturday");
//                 break;
                
//                  case 7:
//                 System.out.println("Sunday");
//                 break;

//                  default:
//                     System.out.println("Invalid");
//         }
//         sc.close();

//     }
// }

// public class Main {
//     public static void main(String[] args)  {
//         final int x = 10;
//         final int y = 5;

//         switch (x + y) {
//             case 15:
//                 System.out.println("The sum is 15");
//                 break;
//                 case 20:
//                     System.out.println("The sum is 20");
//                     break;
//                     default:
//                         System.out.println("The sum is neither 15 nor 20");
//         }

//     }
// }


// public class Main {
//     public static void main(String[] args) {
//         // Define a character variable representing a grade
//         char grade = 'B';

//         // Evaluate grade using a switch statement
//         switch (grade) {
//             case 'A': // If grade is 'A'
//                 System.out.println("Excellent!");
//                 break; // Exit switch after this case
//             case 'B': // If grade is 'B'
//                 System.out.println("Good!");
//                 break; // Exit switch after this case
//             default: // If no case matches
//                 System.out.println("Not specified.");
//         }
//     }
// }

public class Main{
public static void main(String[] args) {

    char grade = 'B';

    switch(grade) {
        case 'A':
            System.out.println("Excellent!");
            break;
            case 'B':
                System.out.println("Good!");
                break;
                default:
                    System.out.println("Not Specified");
    }
}
}
