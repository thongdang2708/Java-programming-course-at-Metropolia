import java.util.Scanner;

public class AskName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Type in your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Type in your age: ");

        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You are " + lastName + " " + firstName + " and your age is " + age + " years");
        scanner.close();
    }
}
