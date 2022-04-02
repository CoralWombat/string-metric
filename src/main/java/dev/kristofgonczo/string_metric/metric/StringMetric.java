package dev.kristofgonczo.string_metric.metric;

import lombok.NonNull;

/**
 * The interface that contains all public methods that needs to be done by a string metric.
 */
public interface StringMetric {

    /**
     * Measures the distance between two strings.
     *
     * @param string1 A string to compare.
     * @param string2 A string to compare.
     * @return The distance between the two inputs. (the greater, the less similar)
     */
    public double measure(@NonNull String string1, @NonNull String string2);

}
