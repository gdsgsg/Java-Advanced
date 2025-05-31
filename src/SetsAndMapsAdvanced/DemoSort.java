package setsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class DemoSort {
    public static void main(String[] args) {

        //СОРТИРАНЕ НА КОЛЕКЦИИ
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(3);
        numbers.add(12);
        numbers.add(24);
        //numbers = {45, 3, 12, 24}

        //1. ascending order / нарастващ ред
        numbers = numbers.stream()
                  .sorted((n1, n2) -> n1.compareTo(n2))
                  .collect(Collectors.toList());
        //numbers = {3, 12, 24, 45}

        //2. descending order / намаляващ ред
        numbers = numbers.stream()
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
        //numbers = {45, 24, 12, 3}

        //compareTo -> сравнява две стойности и получаваме като резултат цяло число
        //0 -> двете стойности са равни
        //-1 -> първото число е по-малко от второто
        //1 -> първото число е по-голямо от второто

        //sorted -> получава резултата от сравнението и на базата на него разменя елементите
        //sorted (0) -> не разменя местата на числата
        //sorted (1) -> разменя местата на числата
        //sorted (-1) -> не разменя местата числата

        //СОРТИРАНЕ НА MAP
        //ученик -> оценка
        Map<String, Double> studentsMap = new LinkedHashMap<>();
        studentsMap.put("Ivan", 4.50);
        studentsMap.put("Aleks", 3.40);
        studentsMap.put("Peter", 5.60);
        studentsMap.put("Georgi", 5.30);

        //1. sort by keys in ascending order
        studentsMap = studentsMap.entrySet().stream().sorted(comparingByKey())
                      .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        //Aleks -> 3.40
        //Georgi -> 5.30
        //Ivan -> 4.50
        //Peter -> 5.60

        //2. sort by keys in descending order
        studentsMap = studentsMap.entrySet().stream().sorted(Collections.reverseOrder(comparingByKey()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        //Peter -> 5.60
        //Ivan -> 4.50
        //Georgi -> 5.30
        //Aleks -> 3.40

        //3. sort by value in ascending order
        studentsMap = studentsMap.entrySet().stream().sorted(comparingByValue())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        //Aleks -> 3.40
        //Ivan -> 4.50
        //Georgi -> 5.30
        //Peter -> 5.60

        //4. sort by value in descending order
        Map<String, Double> sortedStudentsMap = studentsMap.entrySet().stream().sorted(Collections.reverseOrder(comparingByValue()))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        //Peter -> 5.60
        //Georgi -> 5.30
        //Ivan -> 4.50
        //Aleks -> 3.40


    }
}
