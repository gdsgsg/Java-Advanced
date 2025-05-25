package MultidimensionalArraysExercise;

import java.util.Scanner;

public class _01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(", ");
        int rowsAndColumns = Integer.parseInt(inputArray[0]);
        String patternType = inputArray[1];
        switch (patternType) {
            case "A":
                int[][] matrix = patternA(rowsAndColumns);
                printPattern(matrix);
                break;
            case "B":
                int[][] matrix2 = patternB(rowsAndColumns);
                printPattern(matrix2);
                break;
        }
    }

    private static int[][] patternA(int rowsAndColumns) {

        int[][] matrix = new int[rowsAndColumns][rowsAndColumns];
        int count = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                count++;
                matrix[j][i] = count;
            }
        }

        return matrix;
    }

    public static int[][] patternB(int rowsAndColumns) {
        int[][] matrix = new int[rowsAndColumns][rowsAndColumns];
        int count = 1;

        for (int columns = 0; columns < matrix[0].length; columns++) {


            if (columns % 2 == 0) {
                for (int rows = 0; rows < matrix.length; rows++) {
                    matrix[rows][columns] = count;
                    count++;
                }

            } else {
                for (int rows = matrix[columns].length - 1; rows >= 0; rows--) {
                    matrix[rows][columns] = count;
                    count++;
                }
            }
        }

        return matrix;
    }

    private static void printPattern(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }


    }
}
