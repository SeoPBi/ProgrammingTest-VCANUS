package com.example.codingtest.test;

public class ProgrammingTest5 {
    public static void main(String[] args) {
        int[][] pond = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        while (true) {
            boolean isUpdated = false;

            for (int i = 0; i < pond.length; i++) {
                for (int j = 0; j < pond[i].length; j++) {
                    if (pond[i][j] == 0) continue;

                    int minAdjacent = Integer.MAX_VALUE;
                    if (i > 0) minAdjacent = Math.min(minAdjacent, pond[i - 1][j]);
                    if (j > 0) minAdjacent = Math.min(minAdjacent, pond[i][j - 1]);
                    if (i < pond.length - 1) minAdjacent = Math.min(minAdjacent, pond[i + 1][j]);
                    if (j < pond[i].length - 1) minAdjacent = Math.min(minAdjacent, pond[i][j + 1]);

                    if (minAdjacent >= pond[i][j]) {
                        pond[i][j]++;
                        isUpdated = true;
                    }
                }
            }

            if (!isUpdated) break;
        }

        for (int i = 0; i < pond.length; i++) {
            for (int j = 0; j < pond[i].length; j++) {
                System.out.print(pond[i][j] + " ");
            }
            System.out.println();
        }
    }
}

