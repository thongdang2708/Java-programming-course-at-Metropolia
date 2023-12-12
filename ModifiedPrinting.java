import java.util.Scanner;

public class ModifiedPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("\nHi " + "\"" + firstName + "\"");
        System.out.println("\tThe name of this exercise is 'Modifying printing'.");
        System.out.println("\tTabulator, line change and quotations have already been used in this exercise.");
        System.out.println("\tForward slash " + "(" + "\\" + ") " + "is also usable in printing.");
        System.out.println("\t*** End of exercise ***");

        // System.out.println("\nHi, " + "\"" + firstName + "\"");
       

    }
}
