package kattis.abc;

import java.util.Scanner;

public class ABC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        for (char ch : scanner.next().toCharArray()) {
            switch (ch) {
                case 'A':
                    System.out.print(Math.min(Math.min(first, second), third) + " ");
                    break;
                case 'B':
                    System.out.println((first + second + third -
                            Math.min(Math.min(first, second), third) -
                            Math.max(Math.max(first, second), third)) + " ");
                    break;
                case 'C':
                    System.out.print(Math.max(Math.max(first, second), third) + " ");
                    break;
            }
        }
    }
}
