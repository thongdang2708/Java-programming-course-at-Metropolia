import java.util.Arrays;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int number1, number2, number3, high, low;

        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the first integer: ");
        number1 = reader.nextInt();

        System.out.print("Type in the second integer: ");
        number2 = reader.nextInt();

        System.out.print("Type in the third integer: ");
        number3 = reader.nextInt();

        high = high(number1, number2, number3);
        low = low(number1, number2, number3);

        System.out.print("Highest number was " + high);
        System.out.print(" and the lowest was " + low + "\n");
    }

    public static int high(int number1, int number2, int number3) {
        int[] arrayNumber = new int[3];

        arrayNumber[0] = number1;
        arrayNumber[1] = number2;
        arrayNumber[2] = number3;

        int maxNumber = arrayNumber[0];

        for (int i = 1; i < arrayNumber.length; i++) {
            if (arrayNumber[i] > maxNumber) {
                maxNumber = arrayNumber[i];
            }
        }

        return maxNumber;

    }

    public static int low(int number1, int number2, int number3) {
        int[] arrayNumber = new int[3];

        arrayNumber[0] = number1;
        arrayNumber[1] = number2;
        arrayNumber[2] = number3;

        int minNumber = arrayNumber[0];

        for (int i = 1; i < arrayNumber.length; i++) {
            if (arrayNumber[i] < minNumber) {
                minNumber = arrayNumber[i];
            }
        }

        return minNumber;

    }

}
