import java.util.*;
import java.util.Arrays;

public class RevisionExercise {
    public static void main(String[] args) {

        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        int amountOfNumbers = askInfo(tempArray);

        int[] realArray = new int[amountOfNumbers];

        copyInfo(realArray, tempArray);
        System.out.println(Arrays.toString(realArray));
        setArray(realArray);
        System.out.println(Arrays.toString(realArray));

        // printArray(realArray);
    }

    public static void setArray(int[] realArray) {

        for (int i = realArray.length - 1; i >= 0; i--) {
            for (int f = 0; f < i; f++) {
                if (realArray[f] < realArray[f + 1]) {
                    swap(realArray, f, f + 1);
                }
            }
        }
    }

    public static void swap(int[] realArray, int i, int f) {
        int temp = realArray[i];
        realArray[i] = realArray[f];
        realArray[f] = temp;
    }

    public static void copyInfo(int[] realArray, int[] tempArray) {

        for (int i = 0; i < realArray.length; i++) {
            if (tempArray[i] != 0) {
                realArray[i] = tempArray[i];
            }
        }
    }

    public static int askInfo(int[] tempArray) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < tempArray.length; i++) {
            System.out.print((i + 1) + ". number: ");
            int eachNumber = scanner.nextInt();

            if (eachNumber == 0) {
                break;
            } else {
                tempArray[i] = eachNumber;
            }

        }

        int counter = 0;
        String numbers = "";

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] != 0) {
                counter++;
                numbers += tempArray[i] + " ";
            }
        }

        String[] splitText = numbers.split(" ");

        int[] getNumbers = new int[splitText.length];

        for (int i = 0; i < getNumbers.length; i++) {
            getNumbers[i] = Integer.parseInt(splitText[i]);
        }

        tempArray = new int[counter];

        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = getNumbers[i];
        }

        return tempArray.length;

    }
    // Your code here
}
// public static void printArray(int[] realArray ) {
// System.out.println("\Ordered array: ");
// for(int i = 0; i < realArray .length; i++) {
// System.out.println(realArray [i]);
// }
// }
