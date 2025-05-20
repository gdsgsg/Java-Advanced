package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _01_1BrowserHistory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String input = scanner.nextLine();
        while (!input.equals("Home")) {

            if (!input.equals("back")) {

                stack.push(input);
                System.out.println(input);
            } else {
                if (!(stack.size() <= 1)) {
                    stack.pop();
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }

            }
            input = scanner.nextLine();
        }
    }
}
