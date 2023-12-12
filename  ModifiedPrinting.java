import java.util.Scanner;

public class ModifiedPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Hi " + " \" " + firstName + " \" ");

    }
}
