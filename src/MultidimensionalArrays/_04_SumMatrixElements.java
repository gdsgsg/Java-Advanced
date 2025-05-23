package MultidimensionalArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class _04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[array[0]][array[1]];

        for (int i = 0; i < matrix.length; i++) {

            int[] inputArray = Arrays.stream(scanner.nextLine().
                            split(", ")).
                    mapToInt(Integer::parseInt).
                    toArray();
            matrix[i] = inputArray;
        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(matrixContentAdder(matrix));
    }


    private static int matrixContentAdder(int[][] matrix) {
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                count += matrix[i][j];

            }
        }
        return count;
    }
}
