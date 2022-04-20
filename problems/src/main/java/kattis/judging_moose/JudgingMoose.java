package kattis.judging_moose;

import java.util.Scanner;

public class JudgingMoose {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int left = scanner.nextInt();
        int right = scanner.nextInt();

        if (left == 0 && right == 0) {
            System.out.println("Not a moose");
            System.exit(0);
        }
        if (left == right) {
            System.out.print("Even ");
        } else {
            System.out.print("Odd ");
        }
        if (left >= right) {
            System.out.println(left*2);
        } else {
            System.out.println(right*2);
        }
    }
}
