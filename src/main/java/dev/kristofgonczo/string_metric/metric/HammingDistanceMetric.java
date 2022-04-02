package dev.kristofgonczo.string_metric.metric;

import dev.kristofgonczo.string_metric.exception.TwoStringsHaveDifferentLengthException;
import lombok.NonNull;

class HammingDistanceMetric implements StringMetric {

    @Override
    public double measure(@NonNull String string1, @NonNull String string2) {
        if (string1.length() != string2.length()) throw new TwoStringsHaveDifferentLengthException(string1, string2);
        int distance = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) distance++;
        }
        return distance;
    }
}
