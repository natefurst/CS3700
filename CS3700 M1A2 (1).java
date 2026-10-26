import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input two numbers
        System.out.print("Enter the first number: ");
        double x = input.nextDouble();

        System.out.print("Enter the second number: ");
        double y = input.nextDouble();

        // do the math
        double sum = x + y;
        double difference = x - y;
        double product = x * y;
        double quotient = x / y;

        // print the results
        System.out.println();
        System.out.println("Results:");
        System.out.println("Addition: " + x + " + " + y + " = " + sum);
        System.out.println("Subtraction: " + x + " - " + y + " = " + difference);
        System.out.println("Multiplication: " + x + " * " + y + " = " + product);
        System.out.println("Division: " + x + " / " + y + " = " + quotient);
    }
}
