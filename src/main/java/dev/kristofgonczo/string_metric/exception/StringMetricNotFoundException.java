package dev.kristofgonczo.string_metric.exception;

import dev.kristofgonczo.string_metric.StringMetricType;

public class StringMetricNotFoundException extends RuntimeException {

    public StringMetricNotFoundException(StringMetricType stringMetricType) {
        super("No metric found for type: " + stringMetricType);
    }

}
