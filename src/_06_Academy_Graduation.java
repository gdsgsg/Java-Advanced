import java.util.*;

public class _06_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            List<Double> gradeList = Arrays.stream(scanner.nextLine()
                    .split(" "))
                    .map(Double::parseDouble)
                    .toList();

            Double average = getAverageGrade(gradeList);

            map.put(name, average);

        }


        for (Map.Entry<String, Double> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " is graduated with " + entry.getValue());
        }

    }


    private static double getAverageGrade(List<Double> gradeList) {
        double sum = 0.0;
        for (int i = 0; i < gradeList.size(); i++) {
            sum += gradeList.get(i);
        }

        return sum / gradeList.size();
    }

}
