package MultidimensionalArraysExercise;

import java.util.*;


public class _05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split(" ")[0]);
        int columns = Integer.parseInt(input.split(" ")[1]);

        String[][] matrix = new String[rows][columns];
        fillTheMatrix(scanner, matrix);


        List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).toList();
        while (!inputList.getFirst().equals("END")) {


            switch (inputList.getFirst()) {

                case "swap":
                    //swap row1 col1 row2c col2
                    if (inputList.size() == 5) {
                        try {
                            int row1 = Integer.parseInt(inputList.get(1));
                            int cow1 = Integer.parseInt(inputList.get(2));
                            int row2 = Integer.parseInt(inputList.get(3));
                            int cow2 = Integer.parseInt(inputList.get(4));

                            if (row1 <= matrix.length -1 &&
                                    row2 <= matrix.length -1 &&
                                    cow1 <= matrix[0].length -1  &&
                                    cow2 <= matrix[0].length -1 &&
                                    row1 >= 0 && row2 >= 0 && cow1 >= 0 && cow2 >= 0) {

                                String first = matrix[row1][cow1];
                                String second = matrix[row2][cow2];
                                matrix[row1][cow1] = second;
                                matrix[row2][cow2] = first;
                                printOut(matrix);
                            } else {
                                System.out.println("Invalid input!");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input!");

                        }

                    }

                    break;
                default:
                    System.out.println("Invalid input!");

            }


            inputList = Arrays.stream(scanner.nextLine().split(" ")).toList();
        }

    }

    public static String[][] fillTheMatrix(Scanner scanner, String[][] intMatrix) {

        for (int rows = 0; rows < intMatrix.length; rows++) {

            String[] tempArray = scanner.nextLine().split(" ");
            intMatrix[rows] = tempArray;
        }
        return intMatrix;

    }

    private static void printOut(String[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }


    }
}
