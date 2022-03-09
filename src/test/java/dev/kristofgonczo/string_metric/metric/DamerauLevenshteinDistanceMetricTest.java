package dev.kristofgonczo.string_metric.metric;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class DamerauLevenshteinDistanceMetricTest {

    static StringMetric damerauLevenshteinDistanceMetric;

    @BeforeAll
    static void beforeAll() {
        damerauLevenshteinDistanceMetric = StringMetricFactory.getStringMetric(StringMetricType.DAMERAU_LEVENSHTEIN_DISTANCE);
    }

    @Test
    void measureTest() {
        assertDoesNotThrow(() -> damerauLevenshteinDistanceMetric.measure("", ""));
    }
}
