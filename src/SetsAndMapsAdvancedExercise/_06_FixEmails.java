package SetsAndMapsAdvancedExercise;

import java.util.*;

public class _06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new LinkedHashMap<>();
        List<String> inputList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            inputList.add(input);
            input = scanner.nextLine();
        }


        for (int i = 0; i < inputList.size() - 1; i += 2) {
            String key = inputList.get(i);
            String value = inputList.get(i + 1);

            if (!(value.toLowerCase().endsWith(".us") ||
                    value.toLowerCase().endsWith(".uk") ||
                    value.toLowerCase().endsWith(".com"))) {
                map.put(key, value);
            }
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
