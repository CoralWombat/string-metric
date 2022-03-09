package dev.kristofgonczo.string_metric.metric;

import lombok.NonNull;

class DamerauLevenshteinDistanceMetric implements StringMetric {

    @Override
    public double measure(@NonNull String string1, @NonNull String string2) {
        int[][] d = new int[string1.length() + 1][string2.length() + 1];

        for (int i = 0; i < string1.length() + 1; i++) {
            d[i][0] = i;
        }
        for (int j = 0; j < string2.length() + 1; j++) {
            d[0][j] = j;
        }

        for (int i = 1; i < string1.length() + 1; i++) {
            for (int j = 1; j < string2.length() + 1; j++) {
                int cost = string1.charAt(i - 1) == string2.charAt(j - 1) ? 0 : 1;
                d[i][j] = Math.min(Math.min(d[i - 1][j] + 1, d[i][j - 1] + 1), d[i - 1][j - 1] + cost);
                if (i > 1 &&
                        j > 1 &&
                        string1.charAt(i - 1) == string2.charAt(j - 2) &&
                        string1.charAt(i - 2) == string2.charAt(j - 1)) {
                    d[i][j] = Math.min(d[i][j], d[i - 2][j - 2] + cost);
                }
            }
        }
        return d[string1.length()][string2.length()];
    }
}
