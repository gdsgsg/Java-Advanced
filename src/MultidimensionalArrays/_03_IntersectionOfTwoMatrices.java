package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class _03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        String[][] firstInputMatrix = populateMatrices(scanner, rows, columns);
        String[][] secondInputMatrix = populateMatrices(scanner, rows, columns);
        String[][] outputMatrix = matrixSymbolCheck(firstInputMatrix, secondInputMatrix);


        for (int i = 0; i < outputMatrix.length; i++) {

            for (int j = 0; j < outputMatrix[i].length; j++) {

                System.out.print(outputMatrix[i][j] + " ");

            }
            System.out.println();

        }


    }


    private static String[][] populateMatrices(Scanner scanner, int rows, int columns) {
        String[][] matrix = new String[rows][columns];

        for (int i = 0; i < matrix.length; i++) {

            String[] inputArray = scanner.nextLine().split(" ");
            matrix[i] = inputArray;

        }
        return matrix;
    }


    private static String[][] matrixSymbolCheck(String[][] firstMatrix, String[][] secondMatrix) {
        String[][] outputMatrix = new String[firstMatrix.length][firstMatrix[0].length];
        for (int i = 0; i < firstMatrix.length; i++) {

            for (int j = 0; j < firstMatrix[i].length; j++) {

                if (firstMatrix[i][j].equals(secondMatrix[i][j])) {
                    outputMatrix[i][j] = firstMatrix[i][j];
                } else {
                    outputMatrix[i][j] = "*";
                }

            }


        }

        return outputMatrix;
    }
}
