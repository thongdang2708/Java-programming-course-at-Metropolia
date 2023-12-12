import java.util.Scanner;

public class ObjectFunctionality {
    public static void main(String args[]) {
        Printer thing = new Printer();
        thing.Print();
    }
}

class Printer {

    void Print() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in the first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Type in the second integer: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Sum of the numbers: " + Calculator.Sum(firstNumber, secondNumber));
    }
}
// Write the missing class here
// Class is written in the text box below.

class Calculator {
    static int Sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
}