import java.util.Scanner;
import java.util.zip.CheckedInputStream;
import java.util.*;

public class ExceptionInArray {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int elementNumber = 0;
        boolean inputCorrect = true;
        int[] array = { 4, 5, 8, 9, 1, 32, 5, 8, 32, 7, 9, 5 };

        System.out.print("Which element to print? ");

        try {

            int number = reader.nextInt();
            elementNumber = number;
        } catch (InputMismatchException e) {
            inputCorrect = false;
        }

        if (inputCorrect == true) {
            boolean checkExists = true;
            if (elementNumber <= 0 || elementNumber > array.length) {
                checkExists = false;
            } else {
                System.out.println(array[elementNumber-1]);
            }

            if (checkExists == false) {
                System.out.println("Invalid Index!");
            }

        } else {
            System.out.println("You did not type in an integer!");
        }

    }
}
