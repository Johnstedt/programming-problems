package kattis.arrangement;

import java.util.Scanner;

public class Arrangement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rooms = scanner.nextInt();
        int teams = scanner.nextInt();

        for (int i = 0; i < rooms; i++) {
            for (int j = 0; j < teams / rooms; j++) {
                System.out.print("*");
            }
            if (i < teams % rooms) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
