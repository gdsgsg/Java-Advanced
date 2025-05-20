import java.util.ArrayDeque;
import java.util.Scanner;


public class _04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        //(2 + 3) - (2 + 3)

        for (int i = 0; i < input.length(); i++) {

            char symbol = input.charAt(i);

            if (symbol == '(') {

                stack.push(i);


            } else if (symbol == ')') {

                int openBracket = stack.pop();


                System.out.println(input.substring(openBracket, i + 1));

            }

        }


    }
}
