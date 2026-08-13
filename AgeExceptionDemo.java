

import java.util.Scanner;

public class AgeExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String input = sc.nextLine();

            int age = Integer.parseInt(input);

            int result = 100 / (age - age);

            System.out.println("Result = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid numeric age.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic Exception (Division by Zero).");
        }

        sc.close();
    }
}