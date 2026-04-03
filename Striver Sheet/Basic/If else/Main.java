// check age greater than 18 yep or not 
// import java.util.Scanner;
// class Basic{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("enter ther age");
//     int age = sc.nextInt();

//     if (age >= 18) {
//       System.out.println("you are audilt");
//     }
//     else {
//       System.out.println("you  are not an aduilt");
//     }
//     sc.close();
//     }
//   }




import java.util.Scanner;
class Basic {
  public static void main(String[] args) {
    int marks = 80;
    

    if (marks < 25) {
        System.out.println("Grade F");
    } else if (marks >= 25 && marks <= 44) {
        System.out.println("Grade D");
    }
    else if (marks >= 45 && marks <= 60) {
        System.out.println("Grade C");
    }
    else if (marks >= 61 && marks <= 70) {
        System.out.println("Grade B");
    }
    else if (marks >= 71 && marks <= 80) {
        System.out.println("Grade A");
    }
    else {
        System.out.println("Invalid Marks");
    }
    }
  
  }


