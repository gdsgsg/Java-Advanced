import java.util.Arrays;
import java.util.Scanner;
public class _05_MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().
                split(", ")).
                mapToInt(Integer::parseInt).
                toArray();



        int [][] matrix = new int[array[0]][array[1]];
        populateMatrix(scanner,matrix);
        int [][] squareMatrix = new int [2][2];
        int [][] squareMatrix2 = new int [2][2];

        for (int i = 0; i <= matrix.length ; i++) {
            for (int j = 0; j <= matrix[0].length ; j++) {
                squareMatrix[0][j] = matrix[i][j];

            }

        }


            //i
            //7, 1, 3, 3, 2, 1
            //1, 3, 9, 8, 5, 6
            //4, 6, 7, 9, 1, 0



    }

    private static int[][] populateMatrix (Scanner scanner, int[][]matrix){

        for (int i = 0; i < matrix.length ; i++) {

            int [] tempArray = Arrays.stream(scanner.nextLine().
                    split(", ")).
                    mapToInt(Integer::parseInt).
                    toArray();

            matrix[i] = tempArray;

        }
        return matrix;
    }
}
