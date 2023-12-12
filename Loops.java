import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in the height: ");
        int height = scanner.nextInt();
        System.out.print("Type in the width: ");
        int width = scanner.nextInt();

        for (int i = 0; i < height; i++) {

            for (int f = 0; f < width; f++) {
                System.out.print("X");
            }

            System.out.println("");
        }

    }
}
