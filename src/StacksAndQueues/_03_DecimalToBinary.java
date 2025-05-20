package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();


        while (!(inputNum == 0)) {


            stack.push(inputNum % 2);
            inputNum /= 2;

        }

        stack.reversed();

        for (Integer i : stack) {
            System.out.print(i);

        }

        if (stack.isEmpty()) {
            System.out.println(0);
        }
    }
}