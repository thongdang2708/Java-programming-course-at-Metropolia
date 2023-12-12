import java.util.Scanner;

public class CharacterStrings {
    public static void main(String args[]) {
        String characterString;
        Scanner reader = new Scanner(System.in);

        Printer printerObject = new Printer();

        System.out.print("Type in a character string: ");
        characterString = reader.nextLine();

        characterString = printerObject.bigSmall(characterString);
        printerObject.reverseSpace(characterString);
    }
}

class Printer {

    String bigSmall(String characterString) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Do you want upper case or lower case? (upper/lower): ");

        String option = reader.nextLine();

        if (option.equals("upper")) {
            characterString = characterString.toUpperCase();
        } else {
            characterString = characterString.toLowerCase();
        }

        return characterString;
    }

    void reverseSpace(String characterString) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How would you like the string to be printed? (reverse/separated): ");

        String option = reader.nextLine();

        String result = "";
        if (option.equals("reverse")) {
            for (int i = characterString.length() - 1; i >= 0; i--) {
                result += characterString.charAt(i);
            }
        } else {
            for (int i = 0; i < characterString.length(); i++) {
                result += characterString.charAt(i) + " ";
            }
        }

        System.out.println("");
        System.out.println("Here is your character string: " + result);

    }
}