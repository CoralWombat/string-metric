package dev.kristofgonczo.string_metric.metric;

import lombok.NonNull;

public interface StringMetric {

    public double measure(@NonNull String string1, @NonNull String string2);

}
