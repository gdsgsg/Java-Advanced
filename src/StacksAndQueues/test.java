package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> que = new ArrayDeque<>();


        String input = scanner.nextLine();
        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (que.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + que.poll());
                }
            } else {

                que.offer(input);
            }

                input = scanner.nextLine();


        }
        que.forEach(entry -> System.out.println(entry));
    }
}

