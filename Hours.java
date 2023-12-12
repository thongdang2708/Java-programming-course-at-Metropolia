import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount of days: ");

        int numbers = scanner.nextInt();

        double[] arrayNumber = new double[numbers];

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print("Type in work hours of day " + (i + 1) + ": ");
            double getNumber = scanner.nextDouble();
            arrayNumber[i] = getNumber;
        }

        System.out.print("Total of work hours: ");
        double total = 0;

        for (int i = 0; i < arrayNumber.length; i++) {
            total += arrayNumber[i];
        }

        System.out.println(total);

        double average = (double) total / arrayNumber.length;

        System.out.print("average work day length: ");
        System.out.println(average);

        System.out.print("Inputted work hours: ");

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i] + " ");
        }
    }
}
