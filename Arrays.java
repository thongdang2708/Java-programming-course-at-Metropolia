public class Arrays {
    public static void main(String[] args) {
        // Write here the missing variable definitions and initializations
        int[] numberArray = new int[] { 4, 7, 8, 2, 8, 3, 7, 1 };
        System.out.print("Numbers in array: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }

        String[] nameArray = new String[] { "May", "Peggy", "Tina", "Sue" };
        System.out.print("\n\nNames in array: ");
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print(nameArray[i] + " ");
        }

        int[][] matrix = new int[][] { { 2 }, { 4, 6 }, { 8, 10, 12 }, { 14, 16 }, { 18 } };
        System.out.println("\n\nMatrix elements: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("\t");
        }
    }
}
