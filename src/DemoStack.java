import java.util.ArrayDeque;
import java.util.Scanner;

public class DemoStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //създаване на празен стек
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        //размер на стек = брой на елементите в стек
        int size = stack.size(); // 0
        System.out.println(stack.size()); //0

        //проверка дали е празен стека
        //isEmpty -> връща булева стойност
        //true -> ако стекът е празен / размер = 0
        //false -> ако стекът не е празен / размер != 0
        boolean isEmptyStack = stack.isEmpty(); //true
        System.out.println(stack.isEmpty()); //true

        //проверка дали стекът съдържа определен елемент
        //contains -> връща булева стойност
        //true -> ако елементът в скобите се съдържа в стека
        //false -> ако елементът в скобите не се съдържа в стека
        boolean isContained = stack.contains(6); //false
        System.out.println(stack.contains(3)); //false

        //добавяне на елементи в стек -> push
        stack.push(34);
        stack.push(23);
        stack.push(42);
        stack.push(8);
        stack.push(76);
        stack.push(98);

        //премахване на елемент в стек -> последно добавения -> pop
        stack.pop(); //премахваме последно добавения елемент / най-отгоре в стека
        int lastNumber = stack.pop(); //връща и премахва последно добавения елемент

        //достъпваме на елемент в стек -> последно добавения -> peek
        int currentLastNumber = stack.peek();

        //демо на общи функционалности
        System.out.println(stack.size()); //4
        System.out.println(stack.isEmpty()); //false
        System.out.println(stack.contains(100)); //false
        System.out.println(stack.contains(23)); //true


    }
}


