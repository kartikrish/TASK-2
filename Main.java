import java.util.Scanner;

public class Main {

    // Static variable (same for whole program)
    static String programName = "Calculator";

    // Instance variable (belongs to object)
    int count = 0;

    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // ----- Primitive Data Types -----

        byte b = 10;          // 1 byte
        short s = 100;        // 2 bytes
        int num1;             // 4 bytes
        int num2;             // 4 bytes
        long l = 10000L;      // 8 bytes
        float f = 5.5f;       // 4 bytes
        double result = 0.0;  // 8 bytes
        char operator;        // 2 bytes
        boolean valid = true; // true or false

        System.out.println(programName);

        // ----- Taking Input -----
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        // ----- Calculator Logic -----
        if (operator == '+') {
            result = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        }
        else if (operator == '*') {
            result = num1 * num2;
        }
        else if (operator == '/') {

            // Checking division by zero
            if (num2 == 0) {
                System.out.println("Cannot divide by zero");
                valid = false;
            } else {
                result = (double) num1 / num2; // type casting
            }
        }
        else {
            System.out.println("Invalid operator");
            valid = false;
        }

        // ----- Output -----
        if (valid) {
            System.out.printf("Result is: %.2f%n", result);
        }

        // ----- Type Casting Section-----
        int finalResult = (int) result;   // double to int
        double newValue = num1;           // int to double

        System.out.println("Result after casting to int: " + finalResult);
        System.out.println("Number converted to double: " + newValue);

        sc.close();
    }
}
