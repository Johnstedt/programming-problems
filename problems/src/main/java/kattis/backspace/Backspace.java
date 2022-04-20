package kattis.backspace;

import java.util.Scanner;

public class Backspace {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.next().toCharArray();
        char[] process = new char[input.length];
        int backspaces = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '<') {
                backspaces+=2;
            } else {
                process[i-backspaces] = input[i];
            }
        }
        char[] output = new char[input.length - backspaces];
        System.arraycopy(process, 0, output, 0, output.length);
        System.out.println(output);
    }
}
