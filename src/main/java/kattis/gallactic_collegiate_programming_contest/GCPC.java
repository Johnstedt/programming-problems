package kattis.gallactic_collegiate_programming_contest;

import java.util.*;

public class GCPC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Integer, Score> score = new HashMap<>();
        TreeSet<Score> better = new TreeSet<>();

        int teams = scanner.nextInt();
        int events = scanner.nextInt();
        Score fav = new Score();

        for (int i = 0; i < teams - 1; i++) {
            score.put(i+2, new Score());
        }

        for (int i = 0; i < events; i++) {
            int team = scanner.nextInt();
            int penalty = scanner.nextInt();
            if (team == 1) {
                fav.problems++;
                fav.penalties += penalty;
                while (!better.isEmpty() && better.first().compareTo(fav) <= 0) {
                    better.remove(better.first());
                }
            } else {
                Score comp = score.get(team);
                if (fav.compareTo(comp) < 0) {
                    better.remove(comp);
                    comp.problems++;
                    comp.penalties += penalty;
                    better.add(comp);
                } else {
                    comp.problems++;
                    comp.penalties += penalty;
                    if (fav.compareTo(comp) < 0) {
                        better.add(comp);
                    }
                }
            }
            System.out.println(better.size()+1);
        }
    }

    private static class Score implements Comparable<Score> {
        private static int TEAMS = 0;
        protected final int team;
        protected int problems = 0;
        protected int penalties = 0;
        Score() {
            TEAMS++;
            this.team = TEAMS;
        }

        @Override
        public int compareTo(Score s) {
            if (problems - s.problems != 0) return problems - s.problems;
            if (s.penalties - penalties != 0) return s.penalties - penalties;
            return s.team - team;
        }
    }
}
