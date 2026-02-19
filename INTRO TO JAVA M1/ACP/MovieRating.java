import java.util.Scanner;

public class MovieRating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie rating (1 to 5): ");
        int rating = sc.nextInt();

        switch (rating) {
            case 5:
                System.out.println("Excellent Movie ");
                break;

            case 4:
                System.out.println("Very Good Movie  ");
                break;

            case 3:
                System.out.println("Good Movie ");
                break;

            case 2:
                System.out.println("Average Movie ");
                break;

            case 1:
                System.out.println("Poor Movie ");
                break;

            default:
                System.out.println("Invalid Rating! Please enter between 1 and 5.");
        }

        sc.close();
    }
}
