import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        String firstName, secondName;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the first name: ");
        firstName = reader.nextLine();

        System.out.print("Type in the second name: ");
        secondName = reader.nextLine();

        System.out.println("\n**********");
        greet();
        System.out.println("**********");

        greet(firstName);
        System.out.println("**********");

        greet(firstName, secondName);
        System.out.println("**********");
    }

    public static void greet() {
        System.out.println("Hi!");
    }

    public static void greet(String firstName) {
        System.out.println("Hi, " + firstName);
    }

    public static void greet(String firstName, String secondName) {
        System.out.println("Hi, " + firstName + " and" + secondName);
    }
    // the needed greeting methods
}
