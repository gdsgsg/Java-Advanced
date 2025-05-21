package MultidimensionalArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = new int[0][0];
        int[][] secondMatrix = new int[0][0];
        for (int i = 0; i <= 1; i++) {

            //Get the matrix sizes
            if (i == 0) {
                List<Integer> rowsAndColumns = Arrays.stream(scanner.nextLine().
                                split(" ")).
                        map(Integer::parseInt).
                        collect(Collectors.toList());
                firstMatrix = new int[rowsAndColumns.getFirst()][rowsAndColumns.getLast()];
                populate(firstMatrix, scanner);

            } else {
                List<Integer> rowsAndColumns = Arrays.stream(scanner.nextLine().
                                split(" ")).
                        map(Integer::parseInt).
                        collect(Collectors.toList());
                secondMatrix = new int[rowsAndColumns.getFirst()][rowsAndColumns.getLast()];
                populate(secondMatrix, scanner);
            }
        }


        if (compareMatrix(firstMatrix, secondMatrix)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }


    }

    public static int[][] populate(int[][] firstMatrix, Scanner scanner) {


        //Split the input into an Array and populate the matrix.
        for (int i = 0; i < firstMatrix.length; i++) {

            int[] tempArray = Arrays.stream(scanner.nextLine().
                            split(" ")).
                    mapToInt(Integer::parseInt).toArray();

            firstMatrix[i] = tempArray;
        }
        return firstMatrix;
    }

    public static boolean compareMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        //compare the two matrix

        if (firstMatrix.length != secondMatrix.length) {
            return false;
        } else {
            for (int i = 0; i < firstMatrix.length; i++) {

                if (firstMatrix[i].length != secondMatrix[i].length) {
                    return false;
                } else {

                    for (int j = 0; j < firstMatrix[i].length; j++) {

                        if (firstMatrix[i][j] != secondMatrix[i][j]) {
                            return false;
                        }

                    }
                }

            }

        }
        return true;
    }


}