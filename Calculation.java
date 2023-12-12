import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose from the following calculations:");
        System.out.println("1: subtraction");
        System.out.println("2: addition");
        System.out.println("3: multiplication");
        System.out.println("4: division");
        System.out.println("5: remainder");

        System.out.print("Make your choice: ");
        int number = scanner.nextInt();

        if (!(number == 1 || number == 2 || number == 3 || number == 4 || number == 5)) {
            System.out.println("Invalid choice.");
        } else {
            System.out.print("Type in the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.print("Type in the second number: ");
            int secondNumber = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;
                case 2:
                    System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;
                case 3:
                    System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;
                case 4:
                    System.out.println(
                            firstNumber + " / " + secondNumber + " = " + ((double) firstNumber / secondNumber));
                    break;
                case 5:
                    System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
                    break;
                default:
                    break;
            }
        }
    }
}
