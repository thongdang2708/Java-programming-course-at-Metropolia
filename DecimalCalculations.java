import java.util.Scanner;

public class DecimalCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Type the second number: ");
        double secondNumber = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Result of the multiplication: " + (firstNumber * secondNumber));
        System.out.println("Result of the division: " + (firstNumber / secondNumber));
    }
}
