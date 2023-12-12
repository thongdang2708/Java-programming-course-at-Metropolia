import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Program calculates the average of inputted grades.");
        System.out.println("Finish with a negative integer.");
        System.out.println("");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.FRENCH);
        List<Double> numbers = new ArrayList<>();
        while (true) {

            System.out.print("Input a grade (4-10): ");
            double number = scanner.nextDouble();

            if ((number >= 0 && number < 4) || number > 10) {
                System.out.println("Invalid grade!");
                System.out.println(numbers);
            } else if (number >= 4 && number <= 10) {
                numbers.add(number);
                System.out.println(numbers);
            }

            if (number < 0) {
                System.out.println(numbers);
                if (numbers.size() == 0) {
                    System.out.println("You did not input any grades.");
                } else {

                    double numerator = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        numerator += numbers.get(i);
                    }

                    double average = (double) numerator / numbers.size();

                    System.out.println("");
                    System.out.println(numbers.size() + " grades inputted.");
                    System.out.println("Average of the grades: " + average);
                }

                break;

            }

        }
    }
}
