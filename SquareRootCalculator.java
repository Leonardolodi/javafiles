import java.util.Scanner;

public class SquareRootCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its square root: ");
        double userInput = scanner.nextDouble();

        if (userInput < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
        } else {
            double squareRoot = Math.sqrt(userInput);
            System.out.println("The square root of " + userInput + " is: " + squareRoot);
        }
    }
}
