package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_HotPattato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        ArrayDeque<String> que = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .collect(Collectors
                        .toCollection(ArrayDeque::new));

        int n = Integer.parseInt(scanner.nextLine());


        while (!(que.size() == 1)) {
            count++;


            if (count == n) {
                count = 0;
                System.out.println("Removed " + que.poll());
                continue;
            }

            String current = que.poll();
            que.offer(current);


        }

        System.out.println("Last is " + que.getFirst());
    }
}
