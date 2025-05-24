package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowColumn = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[rowColumn][rowColumn];
        List<String> reverse = new ArrayList<>();

        populateMatrix(scanner, matrix);
        //1 2 3
        //1 2 3
        //1 2 3

        for (int i = 0; i < rowColumn; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int i = 0; i < rowColumn; i++) {

            reverse.add((matrix[i][(rowColumn - 1) - i] + " "));


        }

        for (int i = reverse.size() - 1; i >= 0; i--) {

            System.out.print(reverse.get(i));

        }


    }

    private static int[][] populateMatrix(Scanner scanner, int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            int[] tempArray = Arrays.stream(scanner.nextLine().
                            split(" ")).
                    mapToInt(Integer::parseInt).
                    toArray();

            matrix[i] = tempArray;

        }
        return matrix;
    }

}
