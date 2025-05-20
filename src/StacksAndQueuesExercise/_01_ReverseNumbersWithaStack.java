package StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_ReverseNumbersWithaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();


        while (scanner.hasNextLine()) {

            List<String> inputList = Arrays.stream(scanner.nextLine().split(" ")).toList();

            for (String s : inputList) {
                stack.push(s);

            }
            for (String s : stack) {
                System.out.print(stack.pop() + " ");

            }
            System.out.println();
        }
    }
}
