package SetsAndMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String > map = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("search")) {

            String key = input.split("-")[0];
            String number = input.split("-")[1];
            map.put(key,number);

            input = scanner.nextLine();
        }

                String commands = scanner.nextLine();
        while (!commands.equals("stop")) {


            if (map.containsKey(commands)) {
                String number = map.get(commands);
                System.out.println(commands + " -> " + number);
            } else {
                System.out.printf("Contact %s does not exist.%n",commands);
            }




            commands = scanner.nextLine();
        }

    }
}
