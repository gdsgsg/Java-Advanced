package StacksAndQueuesExercise;

import java.util.*;
import java.util.stream.Collectors;

public class _04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputCommands = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> integersToPlay = Arrays.stream(scanner.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());


        int firstCommand = inputCommands.getFirst();
        int secondCommand = inputCommands.get(1);
        int thirdCommand = inputCommands.get(2);

        ArrayDeque<Integer> que = new ArrayDeque<>();

        for (int i = 0; i < firstCommand; i++) {

            que.offer(integersToPlay.get(i));
        }

        for (int i = 0; i < secondCommand; i++) {
            que.poll();
        }


        if (que.contains(thirdCommand)) {
            System.out.println("true");

        } else {

            if (que.isEmpty()) {
                System.out.println(0);

            } else {
                int smallestInt = Integer.MAX_VALUE;

                for (Integer i : que) {
                    if (i < smallestInt) {
                        smallestInt = i;
                    }

                }
                System.out.println(smallestInt);
            }
        }

    }
}
