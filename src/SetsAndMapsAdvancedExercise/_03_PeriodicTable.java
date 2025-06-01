package SetsAndMapsAdvancedExercise;

import java.util.*;

public class _03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elemtentsSet = new TreeSet<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            list = Arrays.stream(scanner.nextLine().split(" ")).toList();

            for (int j = 0; j < list.size(); j++) {
                elemtentsSet.add(list.get(j));

            }

        }

        for (String string : elemtentsSet) {
            System.out.printf(string + " ");
        }

    }
}
