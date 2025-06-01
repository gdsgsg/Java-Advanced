package SetsAndMapsAdvancedExercise;

import java.util.*;

public class _07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> playerCards = new LinkedHashMap<>(); // Нов Map за картите на всеки играч
        Map<String, Integer> map = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("JOKER")) {
            String key = input.split(": ")[0];
            input = input.split(": ")[1];
            playerCards.putIfAbsent(key, new LinkedHashSet<>()); // Създаваме сет, ако няма такъв
            playerCards.get(key).addAll(Arrays.stream(input.split(", ")).toList()); // Добавяме картите
            input = scanner.nextLine();
        }

        // Изчисляваме стойността за всеки играч
        for (String key : playerCards.keySet()) {
            Set<String> cards = playerCards.get(key);
            int value = calculateCurrentHand(cards);
            map.put(key, value);
        }

        // Извеждаме резултата
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static int calculateCurrentHand(Set<String> set) {
        int sum = 0;
        String power = "";
        String type = "";

        for (String string : set) {
            if (string.length() == 2) {
                power = string.split("")[0];
                type = string.split("")[1];
            } else {
                power = string.split("")[0] + string.split("")[1];
                type = string.split("")[2];
            }

            switch (type) {
                case "S":
                    switch (power) {
                        case "A": sum += 14 * 4; break;
                        case "K": sum += 13 * 4; break;
                        case "Q": sum += 12 * 4; break;
                        case "J": sum += 11 * 4; break;
                        default: sum += Integer.parseInt(power) * 4; break;
                    }
                    break;
                case "H":
                    switch (power) {
                        case "A": sum += 14 * 3; break;
                        case "K": sum += 13 * 3; break;
                        case "Q": sum += 12 * 3; break;
                        case "J": sum += 11 * 3; break;
                        default: sum += Integer.parseInt(power) * 3; break;
                    }
                    break;
                case "D":
                    switch (power) {
                        case "A": sum += 14 * 2; break;
                        case "K": sum += 13 * 2; break;
                        case "Q": sum += 12 * 2; break;
                        case "J": sum += 11 * 2; break;
                        default: sum += Integer.parseInt(power) * 2; break;
                    }
                    break;
                case "C":
                    switch (power) {
                        case "A": sum += 14; break;
                        case "K": sum += 13; break;
                        case "Q": sum += 12; break;
                        case "J": sum += 11; break;
                        default: sum += Integer.parseInt(power); break;
                    }
                    break;
            }
        }
        return sum;
    }
}