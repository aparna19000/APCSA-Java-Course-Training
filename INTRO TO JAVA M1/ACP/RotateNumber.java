import java.util.Scanner;

public class RotateNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;   // Get last digit
        int remaining = num / 10;   // Remove last digit

        // Count digits of remaining number
        int count = 0;
        int temp = remaining;

        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        int rotated = lastDigit * (int)Math.pow(10, count) + remaining;

        System.out.println("Rotated Number: " + rotated);

        sc.close();
    }
}
