import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;
import java.lang.ArithmeticException;

public class ownException {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int testedNumber = 0;
        boolean inputCorrect = true;
        do {
            try {
                System.out.print("Type in the number for testing: ");
                testedNumber = reader.nextInt();
                inputCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("You did not type in an integer!");
                inputCorrect = false;
                reader.nextLine();
            }
        } while (!inputCorrect);

        try {
            testValue(testedNumber);
            System.out.println("Value was between 5 and 10.");
        } catch (SmallException e) {
            System.out.println("SmallException caught!");
            printErrorReport(e);
        } catch (BigException e) {
            System.out.println("BigException caught!");
            printErrorReport(e);
        }

    }

    public static void testValue(int number) throws SmallException, BigException {

        if (number < 5) {
            throw new SmallException("Value is lower than 5");
        } else if (number > 10) {
            throw new BigException("Value is higher than 10");
        } else {
            return;
        }
    }

    public static void printErrorReport(Exception e) {
        System.out.println(e.getMessage());
    }

}

class SmallException extends Exception {
    public SmallException(String message) {
        super(message);
    }
}

class BigException extends Exception {
    public BigException(String message) {
        super(message);
    }
}