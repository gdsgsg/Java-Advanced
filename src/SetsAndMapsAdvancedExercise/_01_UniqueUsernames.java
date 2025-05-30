package SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> uniqueNames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            uniqueNames.add(scanner.nextLine());
        }

        for (String uniqueName : uniqueNames) {

            System.out.println(uniqueName);
        }
    }
}
