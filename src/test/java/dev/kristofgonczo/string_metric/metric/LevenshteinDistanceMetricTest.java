package dev.kristofgonczo.string_metric.metric;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class LevenshteinDistanceMetricTest {

    static StringMetric levenshteinDistanceMetric;

    @BeforeAll
    static void beforeAll() {
        levenshteinDistanceMetric = StringMetricFactory.getStringMetric(StringMetricType.LEVENSHTEIN_DISTANCE);
    }

    @Test
    void measureTest() {
        assertDoesNotThrow(() -> levenshteinDistanceMetric.measure("", ""));
    }

}
