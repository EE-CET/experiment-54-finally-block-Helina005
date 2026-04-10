



import java.util.Scanner;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if there is integer input available
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            try {
                // Attempt to perform the division
                int result = a / b;
                System.out.println("Result: " + result);
                
            } catch (ArithmeticException e) {
                // Catch division by zero error
                // e.getMessage() automatically provides the "/ by zero" text in Java
                System.out.println("Error: " + e.getMessage());
                
            } finally {
                // This block will ALWAYS execute, whether an exception occurred or not
                System.out.println("Finally block executed");
            }
        }

        sc.close();
    }
}