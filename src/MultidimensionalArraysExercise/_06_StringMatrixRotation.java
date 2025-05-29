package MultidimensionalArraysExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> inputQue = new ArrayDeque<>();
        int biggestString = 0;
        String command = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            int current = input.length();
            if (current > biggestString) {
                biggestString = current;
            }

            inputQue.offer(input);
            input = scanner.nextLine();
        }

        String[][] matrix = new String[inputQue.size()][biggestString];

        fillTheQueInTheMatrix(inputQue, matrix, biggestString);
        idk(command, matrix, biggestString);
    }

    public static void fillTheQueInTheMatrix(ArrayDeque<String> que, String[][] matrix, int size) {
        int count = 0;
        while (!que.isEmpty()) {
            String current = que.poll();
            while (current.length() < size) {
                current += " ";
            }
            matrix[count] = current.split("");
            count++;
        }
    }

    public static void idk(String command, String[][] matrix, int size) {

        String test = command.substring(7, command.length() - 1);
        int degrees = Integer.parseInt(test);
        int normalization = degrees % 360;

        switch (normalization) {
            case 0:
                printOut(matrix);
                break;
            case 90:
                String[][] newMatrix = degree90(matrix);
                printOut(newMatrix);
                break;
            case 180:
                printOut(degree180(matrix, size));
                break;
            case 270:
                String[][] newMatrix3 = degree270(matrix);
                printOut(newMatrix3);
                break;
        }
    }

    private static String[][] degree90(String[][] matrix) {

        String[][] newMatrix = new String[matrix[0].length][matrix.length];


        for (int row = 0; row < matrix.length; row++) {

            for (int columns = 0; columns < matrix[row].length; columns++) {

                newMatrix[columns][(matrix.length - 1) - row] = matrix[row][columns];

            }
        }
        return newMatrix;
    }

    private static String[][] degree180(String[][] matrix, int size) {

        String[][] newMatrix = new String[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {

            for (int columns = 0; columns < matrix[row].length; columns++) {

                newMatrix[(matrix.length - 1) - row][(matrix[row].length) - 1 - columns] = matrix[row][columns];


            }
        }
        return newMatrix;
    }

    private static String[][] degree270(String[][] matrix) {

        String[][] newMatrix = new String[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {

            for (int columns = 0; columns < matrix[row].length; columns++) {

                newMatrix[(matrix[row].length - 1) - columns][row] = matrix[row][columns];
            }
        }
        return newMatrix;
    }

    private static void printOut(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]);

            }
            System.out.println();

        }


    }

}

