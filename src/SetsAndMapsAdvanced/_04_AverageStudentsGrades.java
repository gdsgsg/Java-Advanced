package SetsAndMapsAdvanced;

import java.util.*;

public class _04_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map = new TreeMap<>();


        for (int i = 0; i < n; i++) {

            List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).toList();
            double grade = Double.parseDouble(inputList.get(1));
            map.putIfAbsent(inputList.get(0), new ArrayList<Double>());
            map.get(inputList.get(0)).add(grade);
        }

        sortGrades(map);
    }

    public static void sortGrades(Map<String, List<Double>> map) {


        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {

            String key = entry.getKey();
            List<Double> current = entry.getValue();
            double average = getAverage(current);

            System.out.print(key + " -> ");
            current.forEach(grade -> System.out.printf("%.2f ", grade));
            System.out.printf("(avg: %.2f)", average);
            System.out.println();


        }


    }

    private static double getAverage(List<Double> current) {
        double sum = 0.0;

        for (int i = 0; i < current.size() ; i++) {
                        sum += current.get(i);
        }

        return sum / current.size();
    }
}
