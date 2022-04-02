package dev.kristofgonczo.string_metric.metric;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DamerauLevenshteinDistanceMetricTest {

    static StringMetric damerauLevenshteinDistanceMetric;

    @BeforeAll
    static void beforeAll() {
        damerauLevenshteinDistanceMetric = StringMetricFactory.getStringMetric(StringMetricType.DAMERAU_LEVENSHTEIN_DISTANCE);
    }

    @Test
    void measureTest() {
        assertDoesNotThrow(() -> damerauLevenshteinDistanceMetric.measure("", ""));

        assertEquals(0, damerauLevenshteinDistanceMetric.measure("abc","abc"));
        assertEquals(1, damerauLevenshteinDistanceMetric.measure("ac", "ca"));
        assertEquals(2, damerauLevenshteinDistanceMetric.measure("abc", "cba"));
        assertEquals(2, damerauLevenshteinDistanceMetric.measure("10011","00101"));
        assertEquals(2, damerauLevenshteinDistanceMetric.measure("bccbbcb", "ccbbccb"));
        assertEquals(5, damerauLevenshteinDistanceMetric.measure("abcdef", "cba"));
        assertEquals(6, damerauLevenshteinDistanceMetric.measure("abcdef", "ghijkl"));
    }
}
