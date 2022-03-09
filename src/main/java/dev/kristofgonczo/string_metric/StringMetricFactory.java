package dev.kristofgonczo.string_metric;

import dev.kristofgonczo.string_metric.exception.StringMetricNotFoundException;
import lombok.NonNull;

public interface StringMetricFactory {

    static StringMetric getStringMetric(@NonNull StringMetricType stringMetricType) {
        throw new StringMetricNotFoundException(stringMetricType);
    }

}
