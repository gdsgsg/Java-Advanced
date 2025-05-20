package StacksAndQueuesExercise;
import java.util.*;

public class _07_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //You are given an empty text. Your task is to implement 4 types of commands related to manipulating the text:
        //•	"1 {string}" - appends [string] to the end of the text.
        //•	"2 {count}" - erases the last [count] elements from the text.
        //•	"3 {index}" - returns the element at position [index] from the text.
        //•	"4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation.
        ArrayDeque<String> stack1 = new ArrayDeque<>();
        ArrayDeque<String> stack2 = new ArrayDeque<>();
        ArrayDeque<String> stackIndex = new ArrayDeque<>();
        List<String> inputList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            inputList = Arrays.stream(scanner.nextLine().split(" ")).toList();

            String command = inputList.getFirst();
            if (inputList.getFirst().equals("1") || inputList.getFirst().equals("2")) {
                stackIndex.push(inputList.getFirst());
            }

            switch (command) {

                case "1":
                    //add
                    sb.append(inputList.getLast());
                    stack1.push(inputList.getLast());
                    break;
                case "2":
                    int startIndexCase2 = Integer.parseInt(inputList.getLast());
                    int endIndexCase2 = sb.length();
                    String temp = sb.substring(endIndexCase2 - startIndexCase2);
                    stack2.push(temp);
                    sb.delete(endIndexCase2 - startIndexCase2, endIndexCase2);


                    break;
                case "3":
                    System.out.println(sb.charAt(Integer.parseInt(inputList.getLast()) - 1));
                    break;
                case "4":
                    String commandToReverse = stackIndex.pop();

                    if (commandToReverse.equals("1")) {

                        String toDelete = stack1.pop();
                        int startIndex = sb.indexOf(toDelete);
                        int endIndex = startIndex + toDelete.length();
                        sb.delete(startIndex, endIndex);
                    } else {
                        sb.append(stack2.pop());

                    }
                    break;

            }

        }


    }


}

