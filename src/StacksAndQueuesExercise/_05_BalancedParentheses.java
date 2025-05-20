package StacksAndQueuesExercise;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_BalancedParentheses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> brackets = Arrays.stream(scanner.nextLine().
                split("")).collect(Collectors.toList());
        int halfSize = brackets.size() / 2;

        if (brackets.size() % 2 != 0) {
            System.out.println("NO");
            return;
        }
        // first {[(  <-- que FIFO
        //second )]}  <-- stack  FILO
        ArrayDeque<String> firstQue = new ArrayDeque<>();
        ArrayDeque<String> secondStack = new ArrayDeque<>();

        for (int i = 0; i < brackets.size(); i++) {

            if (i < halfSize) {
                firstQue.offer(brackets.get(i));
            } else {
                secondStack.push(brackets.get(i));
            }

        }

        for (int i = 0; i < firstQue.size(); i++) {

            switch (firstQue.peek()) {

                case "(":
                    if (secondStack.peek().equals(")")) {
                        firstQue.poll();
                        secondStack.pop();
                    } else {
                        System.out.println("NO");
                        return;
                    }
                    break;

                case "[":
                    if (secondStack.peek().equals("]")) {
                        firstQue.poll();
                        secondStack.pop();
                    } else {
                        System.out.println("NO");
                        return;
                    }
                    break;

                case "{":
                    if (secondStack.peek().equals("}")) {
                        firstQue.poll();
                        secondStack.pop();
                    } else {
                        System.out.println("NO");
                        return;
                    }
                    break;
            }

        }
        System.out.println("YES");

    }

}