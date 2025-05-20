package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	"1 X" - Push the element X into the stack
        //•	"2" - Delete the element present at the top of the stack.
        //•	"3" - Print the maximum element in the stack.

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            String command = input.split(" ")[0];

            switch (command) {

                case "1":
                    String element = input.split(" ")[1];
                    stack.push(element);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    int biggestInt = Integer.MIN_VALUE;
                    for (String s : stack) {
                        int current = Integer.parseInt(s);
                        if (current > biggestInt) {
                            biggestInt = current;
                        }


                    }
                    System.out.println(biggestInt);
                    break;
            }


        }

    }
}
