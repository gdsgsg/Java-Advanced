package SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _07_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sortList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1)).collect(Collectors.toList());

        if (sortList.size() < 3) {
            sortList.forEach(entry -> System.out.print(entry + " "));
        } else {
            for (int i = 0; i < 3; i++) {

                System.out.print(sortList.get(i) + " ");

            }
        }

    }
}
