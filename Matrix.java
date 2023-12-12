import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int rows, columns;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the number of rows: ");
        rows = reader.nextInt();
        System.out.print("Type in the number of columns: ");
        columns = reader.nextInt();

        int matrix[][];

        matrix = askInfo(rows, columns);

        printMatrix(matrix);
        countSum(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("");
        System.out.println("Matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int f = 0; f < matrix[i].length; f++) {
                System.out.print(matrix[i][f] + "\t");
            }
            System.out.println("");
        }
    }

    public static void countSum(int[][] matrix) {

        int totalNumber = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int f = 0; f < matrix[i].length; f++) {
                totalNumber += matrix[i][f];
            }
        }

        System.out.println("");
        System.out.print("Sum of the elements of the matrix: ");
        System.out.println(totalNumber);
    }

    public static int[][] askInfo(int rows, int columns) {

        int[][] matrix = new int[rows][columns];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            int rowCounter = i + 1;

            for (int f = 0; f < matrix[i].length; f++) {
                System.out.print("Type in the element " + (f + 1) + " of the row " + (rowCounter) + ": ");
                int numberAdded = scanner.nextInt();
                matrix[i][f] = numberAdded;
            }
        }

        return matrix;
    }

}