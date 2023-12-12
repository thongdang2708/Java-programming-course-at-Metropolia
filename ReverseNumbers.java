import java.util.Scanner;
import java.util.Arrays;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many floating point numbers do you want to type: ");
        int numbers = scanner.nextInt();

        double[] arrayNumber = new double[numbers];

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print("Type in " + (i + 1) + ". number: ");
            double getNumber = scanner.nextDouble();
            arrayNumber[i] = getNumber;
        }

        System.out.println("Given numbers in reverse order: ");
        for (int i = arrayNumber.length - 1; i >= 0; i--) {
            System.out.println(arrayNumber[i]);
        }
    }
}
