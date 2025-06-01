package SetsAndMapsAdvancedExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> map = new TreeMap<>();

        String input = scanner.nextLine();


        for (int i = 0; i < input.length(); i++) {

            map.putIfAbsent(input.charAt(i), 0);
            Character key = input.charAt(i);
            int value = map.get(key);
            map.put(key, value + 1);

        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");

        }
    }
}
