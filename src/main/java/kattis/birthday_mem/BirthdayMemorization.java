package kattis.birthday_mem;

import java.util.HashMap;
import java.util.Scanner;

public class BirthdayMemorization {

    public static void main(String[] args) {

        HashMap<String, Integer> dateScore = new HashMap<>();
        HashMap<String, String> dateName = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int birthdays = scanner.nextInt();
        for (int i = 0; i < birthdays; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            String date = scanner.next();
            if (!dateName.containsKey(date)) {
                dateScore.put(date, score);
                dateName.put(date, name);
            } else {
                int savedScore = dateScore.get(date);
                if (savedScore < score) {
                    dateScore.put(date, score);
                    dateName.put(date, name);
                }
            }
        }
        System.out.println(dateName.size());
        dateName.values().stream().sorted().forEach(System.out::println);
    }
}
