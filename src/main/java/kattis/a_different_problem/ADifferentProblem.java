package kattis.a_different_problem;

import java.util.Scanner;

public class ADifferentProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            long first = scanner.nextLong();
            long second = scanner.nextLong();
            System.out.println(Math.abs(first - second));
        }
    }
}
