package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsAndColumns = Integer.parseInt(scanner.nextLine());
        int[][] intMatrix = new int[rowsAndColumns][rowsAndColumns];
        int sumOfMainDiagonal = mainDiagonalFinder(fillTheMatrix(scanner, intMatrix));
        int sumOfSecondaryDiagonal = secondaryDiagonalFinder(intMatrix);
        System.out.println(Math.abs(sumOfMainDiagonal - sumOfSecondaryDiagonal));


    }


    public static int mainDiagonalFinder(int[][] intMatrix) {
        int sum = 0;

        for (int rows = 0; rows < intMatrix.length; rows++) {

            sum += intMatrix[rows][rows];
        }
        return sum;

    }


    public static int secondaryDiagonalFinder(int[][] intMatrix) {
        int sum = 0;


        for (int rows = 0; rows < intMatrix.length; rows++) {

            sum += intMatrix[rows][(intMatrix.length - 1) - rows];

        }

        return sum;
    }

    public static int[][] fillTheMatrix(Scanner scanner, int[][] intMatrix) {

        for (int rows = 0; rows < intMatrix.length; rows++) {

            int[] tempArray = Arrays.stream(scanner.nextLine()
                            .split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            intMatrix[rows] = tempArray;

        }
        return intMatrix;
    }
}
