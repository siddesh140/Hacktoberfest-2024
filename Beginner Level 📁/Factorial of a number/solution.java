import java.util.Scanner;

public class FactorialLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a non-negative integer: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorial = calculateFactorial(n);
                System.out.println("The factorial of " + n + " is " + factorial);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } finally {
            scanner.close(); // Ensure the scanner is closed to prevent resource leaks
        }
    }

    private static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
