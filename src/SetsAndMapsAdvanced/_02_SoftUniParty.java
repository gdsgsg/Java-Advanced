package SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> regularGuests = new TreeSet<>();
        Set<String> vipGuests = new TreeSet<>();
        //ASCII 48 >= 57 RANGE
        String input = scanner.nextLine();
        while (!(input.equals("PARTY"))) {

            char vipCheck = input.charAt(0);
            if (vipCheck >= 47 && vipCheck <= 57) {
                vipGuests.add(input);
            } else {
                regularGuests.add(input);

            }

            input = scanner.nextLine();

        }


        String whoIsHere = scanner.nextLine();
        while (!(whoIsHere.equals("END"))) {

            char vipCheck = whoIsHere.charAt(0);
            if (vipCheck >= 47 && vipCheck <= 57) {
                vipGuests.remove(whoIsHere);
            } else {
                regularGuests.remove(whoIsHere);
            }
            whoIsHere = scanner.nextLine();
        }

        System.out.println(vipGuests.size() + regularGuests.size());
        vipGuests.forEach(entry -> System.out.println(entry));
        regularGuests.forEach(entry -> System.out.println(entry));
    }
}
