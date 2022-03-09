package dev.kristofgonczo.string_metric.metric;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LevenshteinDistanceMetricTest {

    static StringMetric levenshteinDistanceMetric;

    @BeforeAll
    static void beforeAll() {
        levenshteinDistanceMetric = StringMetricFactory.getStringMetric(StringMetricType.LEVENSHTEIN_DISTANCE);
    }

    @Test
    void measureTest() {
        assertDoesNotThrow(() -> levenshteinDistanceMetric.measure("", ""));

        assertEquals(0, levenshteinDistanceMetric.measure("Testing!","Testing!"));
        assertEquals(3, levenshteinDistanceMetric.measure("kitten", "sitting"));
        assertEquals(31, levenshteinDistanceMetric.measure("Testing!","This is almost completely different."));
        assertEquals(5, levenshteinDistanceMetric.measure("abcde","fghij"));
    }

}
