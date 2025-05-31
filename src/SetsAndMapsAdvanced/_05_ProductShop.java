package SetsAndMapsAdvanced;

import java.util.*;

public class _05_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputList = Arrays.stream(scanner.nextLine().split(", ")).toList();
        Map<String, Map<String, Double>> mapo = new TreeMap<>();
        //lidl, peach, 1.20
        while (!inputList.get(0).equals("Revision")) {

            String shop = inputList.get(0);
            String product = inputList.get(1);
            Double price = Double.parseDouble(inputList.get(2));


            if (!mapo.containsKey(shop)) {

                mapo.put(shop, new LinkedHashMap<>());
                mapo.get(shop).put(product, price);
            } else {
                mapo.get(shop).put(product, price);
            }


            inputList = Arrays.stream(scanner.nextLine().split(", ")).toList();
        }


        for (Map.Entry<String, Map<String, Double>> entry : mapo.entrySet()) {
            String shopName = entry.getKey();

            Map<String, Double> productsMap = entry.getValue();
            System.out.println(shopName + "->");
            productsMap.forEach((key, value) -> System.out.printf("Product: %s, Price: %.1f%n", key, value));


        }


    }

}