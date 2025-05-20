package StacksAndQueuesExercise;
import java.util.Scanner;

public class _06_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(test1(scanner.nextInt()));
    }

    public static long test1(int n) {
        // Базови случаи
        if (n == 0 || n == 1) {
            return 1;
        }
        // Рекурсивно извикване
        return test1(n - 1) + test1(n - 2);
    }
}

