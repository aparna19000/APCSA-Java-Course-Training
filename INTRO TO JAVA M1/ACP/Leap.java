import java.util.Scanner;

public class Leap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year condition using ternary operator
        String result = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
                        ? "It is a Leap Year." 
                        : "It is not a Leap Year.";

        System.out.println(result);

        //// Leap year logic using if-else
        // if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        //    System.out.println("It is a Leap Year.");
       // } else {
        //    System.out.println("It is not a Leap Year.");
       // }
        sc.close();
    }
}
