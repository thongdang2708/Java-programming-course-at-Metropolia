import java.util.Scanner;
import java.util.*;

public class ExceptionInAddition {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int firstNumber = 0, secondNumber = 0, result;
        boolean inputCorrect = true;

        // Your code here

        try {
            System.out.print("Type in the first number: ");
            int numberFirst = reader.nextInt();
            firstNumber = numberFirst;
            System.out.print("Type in the second number: ");
            int numberSecond = reader.nextInt();
            secondNumber = numberSecond;
        } catch (InputMismatchException e) {
            inputCorrect = false;
        }

        if (inputCorrect == true) {
            result = firstNumber + secondNumber;
            System.out.println("Result: " + result);
        } else {
            System.out.println("You did not type in an integer!");
        }
    }
}