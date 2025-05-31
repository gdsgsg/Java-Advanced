package setsAndMaps;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //SET - структура от данни, в която съхраняваме еднотипни уникални елементи
        //създаване на празен Set
        Set<Integer> numbers = new HashSet<>(); //редът на елементите не е гарантиран
        Set<String> names = new LinkedHashSet<>(); //елементите се подреждат спрямо реда на добавяне
        Set<Double> grades = new TreeSet<>(); //елементите се подреждат инкрементално

        //размер на set -> броя на елементите
        int countNames = names.size();
        System.out.println(numbers.size()); // 0

        //проверка дали Set е празен
        //празен = 0 елемента

        //isEmpty
        //true -> не е празен, размер > 0
        //false -> празен, размер == 0
        System.out.println(grades.isEmpty());
        boolean isEmptySet = grades.isEmpty();
        if (names.isEmpty()) {
            System.out.println("Set is empty");
        }

        //добавяне на елементи -> add
        //1. HashSet -> редът на елементите не е гарантиран
        numbers.add(5);
        numbers.add(9);
        numbers.add(7);

        //2. LinkedHashSet -> елементите се подреждат спрямо реда на добавяне
        names.add("Aleks");
        names.add("Georgi");
        names.add("Boris");
        names.add("Peter");

        //3. TreeSet -> елементите се подреждат инкрементално / нарастващ ред
        grades.add(7.6);
        grades.add(2.3);
        grades.add(5.4);
        grades.add(4.5);

        //премахваме елементи -> remove
        //numbers = {5, 9, 7}
        numbers.remove(9);

        //names = {"Aleks", "Georgi", "Boris", "Peter"}
        names.remove("Georgi");

        //grades = {2.3, 4.5, 5.4, 7.6}
        grades.remove(5.4);
        //remove not existing element -> nothing happens
        grades.remove(5.3);

        //премахване на всички елементи -> clear
        numbers.clear(); //премахнали сме всички елементи -> размер = 0
        System.out.println(numbers.size()); //0

        //проверка дали съдържа определен елемент
        //contains
        //true -> ако в сета се съдържа дадения елемент
        //false -> ако в сета не се съдържа дадения елемент
        System.out.println(numbers.contains(5));
        boolean isContains = numbers.contains(7);

        //обхождане на сет
        //grades = {2.3, 4.5, 7.6}
        for (double grade : grades) {
            System.out.println(grade);
        }
    }
}
