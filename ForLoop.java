import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in an integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            for (int i = number; i >= 0; i--) {
                System.out.println(i);
            }
        } else if (number <= 0) {
            System.out.println("Input is not a positive integer.");
        }
    }
}
