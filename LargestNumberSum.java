import java.util.Scanner;

public class LargestNumberSum {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest of the three numbers
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        // Display the sum of the largest number
        System.out.println("The largest number is: " + largest);
        System.out.println("The sum of the largest number is: " + largest);

        scanner.close();
    }
}
