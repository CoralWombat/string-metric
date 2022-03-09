package dev.kristofgonczo.string_metric.metric;

import dev.kristofgonczo.string_metric.util.NumberUtil;
import lombok.NonNull;

class LevenshteinDistanceMetric implements StringMetric {

    @Override
    public double measure(@NonNull String string1, @NonNull String string2) {
        int[][] dp = new int[string1.length() + 1][string2.length() + 1];

        for (int i = 0; i <= string1.length(); i++) {
            for (int j = 0; j <= string2.length(); j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else {
                    dp[i][j] = NumberUtil.min(dp[i - 1][j - 1] + costOfSubstitution(string1.charAt(i - 1), string2.charAt(j - 1)),
                            dp[i - 1][j] + 1,
                            dp[i][j - 1] + 1);
                }
            }
        }

        return dp[string1.length()][string2.length()];
    }

    private static int costOfSubstitution(char a, char b) {
        return a == b ? 0 : 1;
    }

}
