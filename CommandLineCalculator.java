import java.util.Scanner;
import java.util.Arrays;

class CommandLineCalculator {
    public static void main(String[] args) {
        int characters = args.length;

        System.out.println(characters);
        System.out.println(Arrays.toString(args));
        if (characters < 3)
            System.out.println("You did not type in a calculation!");
        else if (characters % 2 == 0)
            System.out.println("Invalid number of command line parameters.");
        else {
            Calculator counter = new Calculator();
            counter.count(args);
        }
    }
}

class Calculator {

    void count(String[] args) {

        int counter = Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {
            if (i % 2 != 0 && args[i].equals("+")) {
                counter += Integer.parseInt(args[i + 1]);
            } else if (i % 2 != 0 && args[i].equals("-")) {
                counter -= Integer.parseInt(args[i + 1]);
            }
        }

        String text = "";
        for (int i = 0; i < args.length; i++) {
            text += args[i] + " ";
        }
        System.out.println("Result of the calculation " + text + "is " + counter);
    }
}
