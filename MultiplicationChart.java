import java.util.Scanner;

public class MultiplicationChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = scanner.nextInt();

        count(number);

    }

    public static void count(int number) {
        System.out.println("Multiplication chart of the number " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }
}
