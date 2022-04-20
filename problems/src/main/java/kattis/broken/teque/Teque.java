package kattis.broken.teque;

import java.util.Scanner;

public class Teque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int commands = scanner.nextInt() - 1;

        scanner.next();
        int length = 1;
        Node first = new Node(scanner.nextInt());
        Node last = first;

        for (int i = 0; i < commands; i++) {
            switch (scanner.next()) {
                case "push_back":
                    last.next = new Node(scanner.nextInt());
                    last = last.next;
                    length++;
                    break;
                case "push_front":
                    Node newFirst = new Node(scanner.nextInt());
                    newFirst.next = first;
                    first = newFirst;
                    length++;
                    break;
                case "push_middle":
                    Node newMiddle = new Node(scanner.nextInt());
                    Node oldMiddle = first;
                    for (int j = 0; j < ((length+1)/2)-1; j++) {
                        oldMiddle = oldMiddle.next;
                    }
                    newMiddle.next = oldMiddle.next;
                    oldMiddle.next = newMiddle;
                    length++;
                    break;
                case "get":
                    int index = scanner.nextInt();
                    Node get = first;
                    for (int j = 0; j < index; j++) {
                        get = get.next;
                    }
                    System.out.println(get.value);
                    break;
            }
        }
    }

    private static class Node {
        protected int value;
        protected Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private void print(Node node, int length) {
        Node loop = node;
        for (int j=0; j < length; j++) {
            System.out.print(loop.value+" ");
            loop = loop.next;
        }
        System.out.println(" ");
    }
}

