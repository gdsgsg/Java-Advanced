import java.util.Arrays;
import java.util.Scanner;

public class _05_MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().
                        split(", ")).
                mapToInt(Integer::parseInt).
                toArray();


        int[][] matrix = new int[array[0]][array[1]];
        int[][] squareMatrix = new int[2][2];
        populateMatrix(scanner, matrix);
        int sum = 0;
        for (int i = 0; i < matrix.length - 1; i++) {

            for (int j = 0; j < matrix[0].length - 1; j++) {

                //i                -
                //7, 1, 3, 3, 2, 1 -
                //1, 3, 9, 8, 5, 6 -
                //4, 6, 7, 9, 1, 0 -
                int central = matrix[i][j];
                int toTheRight = matrix[i][j + 1];
                int diagonalDown = matrix[i + 1][j + 1];
                int downFromCentral = matrix[i + 1][j];
                int tempSum = central + toTheRight + diagonalDown + downFromCentral;

                if (tempSum > sum) {
                    sum = tempSum;
                    squareMatrix[0][0] = central;
                    squareMatrix[0][1] = toTheRight;
                    squareMatrix[1][1] = diagonalDown;
                    squareMatrix[1][0] = downFromCentral;
                }


            }

        }

        System.out.println(squareMatrix[0][0] + " " + squareMatrix[0][1]);
        System.out.println(squareMatrix[1][0] + " " + squareMatrix[1][1]);
        System.out.println(sum);

    }

    private static int[][] populateMatrix(Scanner scanner, int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            int[] tempArray = Arrays.stream(scanner.nextLine().
                            split(", ")).
                    mapToInt(Integer::parseInt).
                    toArray();

            matrix[i] = tempArray;

        }
        return matrix;
    }
}
