package MultidimensionalArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split(" ")[0]);
        int columns = Integer.parseInt(input.split(" ")[1]);
        int[][] matrix = new int[rows][columns];
        int[][] squareMatrix = new int[3][3];
        fillTheMatrix(scanner, matrix);
        printOut(biggestSquare(matrix, squareMatrix));


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


    public static int[][] biggestSquare(int[][] matrix, int[][] squareMatrix) {
        int maxSum = Integer.MIN_VALUE;

        for (int rows = 0; rows < matrix.length - 2; rows++) {
            for (int columns = 0; columns < matrix[rows].length - 2; columns++) {

                int current = matrix[rows][columns];
                int sameRowOne = matrix[rows][columns + 1];
                int sameRowTwo = matrix[rows][columns + 2];

                int oneBellow = matrix[rows + 1][columns];
                int oneBellowOneRight = matrix[rows + 1][columns + 1];
                int oneBellowTwoRight = matrix[rows + 1][columns + 2];

                int twoBellow = matrix[rows + 2][columns];
                int twoBellowOneRight = matrix[rows + 2][columns + 1];
                int twoBellowTwoRight = matrix[rows + 2][columns + 2];


                int sum = current + sameRowOne + sameRowTwo + oneBellow + oneBellowOneRight + oneBellowTwoRight +
                        twoBellow + twoBellowOneRight + twoBellowTwoRight;


                if (sum > maxSum) {
                    maxSum = sum;

                    squareMatrix[0][0] = current;
                    squareMatrix[0][1] = sameRowOne;
                    squareMatrix[0][2] = sameRowTwo;
                    //
                    squareMatrix[1][0] = oneBellow;
                    squareMatrix[1][1] = oneBellowOneRight;
                    squareMatrix[1][2] = oneBellowTwoRight;
                    //
                    squareMatrix[2][0] = twoBellow;
                    squareMatrix[2][1] = twoBellowOneRight;
                    squareMatrix[2][2] = twoBellowTwoRight;
                }
            }
        }
        System.out.println("Sum = " + maxSum); // Отпечатваме максималната сума
        return squareMatrix;
    }



private static void printOut(int[][] matrix) {

    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {

            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();

    }


}
}
