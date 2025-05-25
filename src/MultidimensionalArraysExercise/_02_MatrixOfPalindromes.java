package MultidimensionalArraysExercise;

import java.util.Scanner;

public class _02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[][] matrix = new String[Integer.parseInt(input.
                split(" ")[0])][Integer.parseInt(input.
                split(" ")[1])];

        // a = 97
        // z = 122
        //•	Rows define the first and the last letter: row 0 -> ‘a’, row 1 -> ‘b’, row 2 -> ‘c’, …
        //•	Columns + rows define the middle letter:
        //o	column 0, row 0 -> ‘a’, column 1, row 0 -> ‘b’, column 2, row 0 -> ‘c’, …
        //o	column 0, row 1 -> ‘b’, column 1, row 1 -> ‘c’, column 2, row 1 -> ‘d’, …
        char secondChar = 98;
        for (int rows = 0; rows < matrix[0].length; rows++) {
            char firstAndThird = 97;


            for (int columns = 0; columns < matrix.length; columns++) {

                if (columns == 0 && rows == 0) {
                    secondChar -= 1;
                }

                matrix[columns][rows] = String.valueOf(firstAndThird) + String.valueOf(secondChar) + String.valueOf(firstAndThird);

                firstAndThird++;
                secondChar++;
            }


            int ascii = 98 + rows;
            secondChar = (char) ascii;

        }

        printPattern(matrix);
    }

    private static void printPattern(String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }


    }

}
