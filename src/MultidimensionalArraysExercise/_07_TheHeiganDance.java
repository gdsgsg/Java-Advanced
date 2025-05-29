package MultidimensionalArraysExercise;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _07_TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] fieldMatrix = new int[15][15];

        //start at [8][8]
        int heroHealthPoints = 18500;
        int bossHealthPoints = 3000000;
        double damageToBoss = Double.parseDouble(scanner.nextLine());
        String heroPosition = "88";
        int countCloud = 0;

        int damage = 0;
        while (heroHealthPoints > 0 || bossHealthPoints > 0) {


            if (countCloud == 1) {
                heroHealthPoints -= 3500;
                countCloud = 0;
            }

            bossHealthPoints -= (int) damageToBoss;

            List<String> inputForSpell = Arrays.stream(scanner.nextLine().split(" ")).toList();


            switch (inputForSpell.getFirst()) {
                case "Cloud":
                    damage = 3500;
                    countCloud++;
                    filed(fieldMatrix, Integer.parseInt(inputForSpell.
                            get(1)), Integer.parseInt(inputForSpell
                            .get(2)), heroPosition, bossHealthPoints, damage);
                    break;
                case "Eruption":
                    damage = 6000;
                    filed(fieldMatrix, Integer.parseInt(inputForSpell.
                            get(1)), Integer.parseInt(inputForSpell
                            .get(2)), heroPosition, bossHealthPoints, damage);
                    break;
            }

        }

    }

    public static void filed(int[][] matrix, int row, int column, String heroPosition, int heroHealth, int damage) {

        matrix[row][column] = 1; //center
        matrix[row][column - 1] = 1; //leftOfCenter
        matrix[row][column + 1] = 1; //rightOfCenter

        matrix[row - 1][column] = 1; //upRowOfCenter
        matrix[row - 1][column - 1] = 1; //upLeftOfCenter
        matrix[row - 1][column + 1] = 1; //upRightOfCenter

        matrix[row + 1][column] = 1; //downRowOfCenter
        matrix[row + 1][column - 1] = 1; //upLeftOfCenter
        matrix[row + 1][column + 1] = 1; //upRightOfCenter


        int heroRow = Integer.parseInt(heroPosition.split("")[0]);
        int heroColumn = Integer.parseInt(heroPosition.split("")[1]);
    }
}

