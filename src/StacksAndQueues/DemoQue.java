package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DemoQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //създаваме празна опашка
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        //размер на опашка = брой на елементите в опашката
        System.out.println(queue.size()); //0

        //проверка дали опашката е празна
        //isEmpty
        //true -> размер = 0
        //false -> размер != 0
        System.out.println(queue.isEmpty()); //true

        //проверка дали опашката съдържа даден елемент
        System.out.println(queue.contains(12)); //false

        //добавяне на елемент в опашка -> add / offer
        queue.offer(45);
        queue.offer(12);
        queue.offer(34);
        queue.offer(58);
        queue.offer(9);
        queue.offer(23);

        //премахване на елемент от опашка -> remove / poll
        queue.poll(); //премахваме първия елемент от опашката
        int removedElement = queue.poll(); //връщаме и премахваме първия елемент от опашката

        //достъпваме първия елемент на опашката
        System.out.println(queue.peek());
        int firstElement = queue.peek();

        //демо на общи функционалности
        System.out.println(queue.size()); //4
        System.out.println(queue.isEmpty()); //false
        System.out.println(queue.contains(100)); //false
        System.out.println(queue.contains(23)); //true

    }
}

