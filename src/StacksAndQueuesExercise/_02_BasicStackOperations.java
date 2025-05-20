package StacksAndQueuesExercise;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        List<Integer> inputCommands = Arrays.
                stream(scanner.nextLine().
                        split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());

        List<Integer> dataList = Arrays.stream(scanner.nextLine().
                        split(" ")).
                map(Integer::parseInt).
                collect(Collectors.toList());

        // NSX -- FIRST LINE
        // N number of elements to push into the stack
        // S number of elements to pop from the stack
        // X element that you should check whether is present in the stack
        int N = inputCommands.getFirst();
        int S = inputCommands.get(1);
        int X = inputCommands.get(2);


        ///First task:
        for (int i = 0; i < N; i++) {
            stack.push(dataList.get(i));
        }

        //Second task:
        for (int i = 0; i < S; i++) {
            stack.pop();
        }

        //Third task:
        boolean isItThere = stack.contains(X);
        if (isItThere) {
            System.out.println(isItThere);
        } else {

            if (!stack.isEmpty()) {
                int smallest = Integer.MAX_VALUE;

                for (int i = 0; i < stack.size(); i++) {

                    if (stack.peek() < smallest) {
                        smallest = stack.peek();
                    }


                }
                System.out.println(smallest);
            } else {
                System.out.println(0);
            }
        }

    }

}
