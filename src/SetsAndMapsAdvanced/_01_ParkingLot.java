package SetsAndMapsAdvanced;

import java.util.*;

public class _01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> numberPlates = new LinkedHashSet<>();

        List<String> inputList = Arrays.stream(scanner.nextLine().split(", ")).toList();

        while (!(inputList.getFirst().equals("END"))) {
            switch (inputList.getFirst()) {

                case "IN":
                    numberPlates.add(inputList.getLast());
                    break;
                case "OUT":
                    numberPlates.remove(inputList.getLast());
                    break;
            }
            inputList = Arrays.stream(scanner.nextLine().split(", ")).toList();
        }

        if (numberPlates.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            numberPlates.forEach(entry -> System.out.println(entry));
        }

    }
}
