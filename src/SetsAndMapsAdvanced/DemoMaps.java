package setsAndMaps;

import java.util.*;

public class DemoMaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //създаване на празен map
        //запис: key (int) -> value (String)
        //номер на ученика -> име
        Map<Integer, String> studentsMap = new HashMap<>();

        //размер на map -> броя на записите
        System.out.println(studentsMap.size());
        int countEntries = studentsMap.size();

        //проверка дали имаме празен map
        //isEmpty
        //true -> празен (броя записите == 0)
        //false -> не е празен (броя на записите > 0)
        System.out.println(studentsMap.isEmpty());
        boolean isEmptyMap = studentsMap.isEmpty();

        //добавяне на записи в map
        studentsMap.put(1, "Aleks");
        studentsMap.put(2, "Boris");
        studentsMap.put(3, "Georgi");
        //studentsMap.put(3, "Peter"); //презаписва запис
        studentsMap.putIfAbsent(4, "Denis");
        studentsMap.putIfAbsent(4, "Ivan");

        //премахване на записи в map
        studentsMap.remove(4, "Denis");
        studentsMap.remove(3);

        //проверка дали съществува даден ключ в map
        //containsKey
        //true -> ако има запис с дадения ключ
        //false -> ако няма запис с дадения ключ
        System.out.println(studentsMap.containsKey(4));

        //проверка дали съществува дадено value в map
        //containsValue
        //true -> ако има запис с даденото value
        //false -> ако няма запис с даденото value
        System.out.println(studentsMap.containsValue("Boris"));
        if (studentsMap.containsValue("Boris")) {
            System.out.println("Boris is here!");
        }

        //премахва всички записи от map -> нулиране / изпразване на map -> size == 0
        studentsMap.clear();

        //ВИДОВЕ MAP
        //1. HashMap -> редът на записите не е гарантиран
        Map<Integer, String> employeesMap = new HashMap<>();
        //2. LinkedHashMap -> записите се подреждат спрямо реда на добавяне
        Map<Integer, String> teachersMap = new LinkedHashMap<>();
        teachersMap.put(3, "Mrs. Ivanova");
        teachersMap.put(4, "Ms. Georgiev");
        teachersMap.put(1, "Mrs. Petkova");

        //3. TreeMap -> записите се подреждат в нарастващ ред спрямо ключа
        Map<Integer, String> laptopsMap = new TreeMap<>();
        laptopsMap.put(3, "Lenovo");
        laptopsMap.put(2, "HP");
        laptopsMap.put(1, "Mac");
        laptopsMap.put(8, "Dell");

        //достъпваме всички ключове в един map
        Set<Integer> keys = laptopsMap.keySet();

        //достъпваме всички values в един маp
        laptopsMap.values();

        //достъпваме всички записи / entries в един map
        laptopsMap.entrySet();

        //обхождане на map
        //начин 1: обхождане на всички записи
        for (Map.Entry<Integer, String> entry : laptopsMap.entrySet()) {
            //entry -> съдържа всеки един запис
            //entry.getKey() -> ключа на записа
            //entry.getValue() -> value на записа
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //начин 2: обхождане на всеки ключ
        for (int key : laptopsMap.keySet()) {
            System.out.println(key + " -> " + laptopsMap.get(key));
        }




    }
}
