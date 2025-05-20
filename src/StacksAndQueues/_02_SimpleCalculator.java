package StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class _02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toCollection(ArrayDeque::new));


        while (stack.size() >= 3) {

            int firstNum = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());


            if (operator.equals("+")) {


                int sum = firstNum + secondNum;
                stack.push(String.valueOf(sum));
            } else {
                int sum = firstNum - secondNum;
                stack.push(String.valueOf(sum));
            }


        }
        System.out.println(stack.peek());

    }
}
