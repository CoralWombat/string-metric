package dev.kristofgonczo.string_metric.metric;

import dev.kristofgonczo.string_metric.exception.StringMetricNotFoundException;
import lombok.NonNull;

public interface StringMetricFactory {

    /**
     * @param stringMetricType The required type of the metric.
     * @return The requested StringMetric class.
     */
    static StringMetric getStringMetric(@NonNull StringMetricType stringMetricType) {
        switch (stringMetricType) {
            case LEVENSHTEIN_DISTANCE:
                return new LevenshteinDistanceMetric();
            case DAMERAU_LEVENSHTEIN_DISTANCE:
                return new DamerauLevenshteinDistanceMetric();
            case HAMMING_DISTANCE:
                return new HammingDistanceMetric();
        }
        throw new StringMetricNotFoundException(stringMetricType);
    }

}
