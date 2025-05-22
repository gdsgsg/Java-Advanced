package MultidimensionalArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int rows = inputList.getFirst();
        int columns = inputList.getLast();

        int[][] matrix = new int[rows][columns];

        checkPosition(populateMatrix(matrix, scanner), scanner);

    }

    private static int[][] populateMatrix(int[][] matrix, Scanner scanner) {

        for (int i = 0; i < matrix.length; i++) {

            int[] tempArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = tempArray;

        }

        return matrix;

    }

    private static void checkPosition(int[][] matrix, Scanner scanner) {
        boolean isItThere = false;
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (number == matrix[i][j]) {
                    System.out.println(i + " " + j);
                    isItThere = true;
                }

            }

        }
        if (!isItThere) {
            System.out.println("not found");
        }

    }

}
