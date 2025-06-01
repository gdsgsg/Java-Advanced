package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class _02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        String input = scanner.nextLine();
        int firstSetSize = Integer.parseInt(input.split(" ")[0]);
        int secondSetSize = Integer.parseInt(input.split(" ")[1]);

        for (int i = 0; i < firstSetSize; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i < secondSetSize; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }


        compareSetEntries(firstSet, secondSet);


    }

    private static void compareSetEntries(Set<Integer> set1, Set<Integer> set2) {
        for (Integer integer : set1) {
            if (set2.contains(integer)) {
                System.out.print(integer + " ");
            }
        }
    }
}
