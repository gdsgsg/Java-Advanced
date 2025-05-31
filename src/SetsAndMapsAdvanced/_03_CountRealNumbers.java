package SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class _03_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numbercountMap = new LinkedHashMap<>();

        List<Double> inputData = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        for (int i = 0; i < inputData.size(); i++) {


            numbercountMap.putIfAbsent(inputData.get(i), 0);
            numbercountMap.put(inputData.get(i), numbercountMap.get(inputData.get(i)) + 1);
        }


        for (Map.Entry<Double, Integer> entry : numbercountMap.entrySet()) {


            System.out.printf("%.1f -> %d%n",entry.getKey(), entry.getValue());

        }


    }
}
