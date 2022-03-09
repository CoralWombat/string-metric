package dev.kristofgonczo.string_metric.metric;

import dev.kristofgonczo.string_metric.exception.StringMetricNotFoundException;
import lombok.NonNull;

public interface StringMetricFactory {

    static StringMetric getStringMetric(@NonNull StringMetricType stringMetricType) {
        switch (stringMetricType) {
            case LEVENSHTEIN_DISTANCE:
                return new LevenshteinDistanceMetric();
            case DAMERAU_LEVENSHTEIN_DISTANCE:
                return new DamerauLevenshteinDistanceMetric();
        }
        throw new StringMetricNotFoundException(stringMetricType);
    }

}
