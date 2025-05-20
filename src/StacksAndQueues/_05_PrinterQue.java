package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;


public class _05_PrinterQue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> que = new ArrayDeque<>();

        String inputData = scanner.nextLine();
        while (!inputData.equals("print")) {


            switch (inputData) {
                case "cancel":
                    if (que.isEmpty()) {
                        System.out.println("Printer is on standby");
                    } else {
                        String canceled = que.poll();
                        System.out.println("Canceled " + canceled);
                    }
                    break;
                default:
                    que.offer(inputData);
            }


            inputData = scanner.nextLine();
        }


        que.forEach(entry -> System.out.println(entry));


    }
}
