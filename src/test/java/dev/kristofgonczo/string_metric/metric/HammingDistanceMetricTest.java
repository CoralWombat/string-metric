package dev.kristofgonczo.string_metric.metric;

import dev.kristofgonczo.string_metric.exception.TwoStringsHaveDifferentLengthException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HammingDistanceMetricTest {

    static StringMetric hammingDistanceMetric;

    @BeforeAll
    static void beforeAll() {
        hammingDistanceMetric = StringMetricFactory.getStringMetric(StringMetricType.HAMMING_DISTANCE);
    }

    @Test
    void measureTest() {
        assertDoesNotThrow(() -> hammingDistanceMetric.measure("", ""));
        assertThrows(TwoStringsHaveDifferentLengthException.class, () -> hammingDistanceMetric.measure("a", "ab"));
        assertThrows(TwoStringsHaveDifferentLengthException.class, () -> hammingDistanceMetric.measure("ab", "a"));

        assertEquals(3, hammingDistanceMetric.measure("karolin", "kathrin"));
        assertEquals(3, hammingDistanceMetric.measure("karolin", "kerstin"));
        assertEquals(4, hammingDistanceMetric.measure("kathrin", "kerstin"));
        assertEquals(4, hammingDistanceMetric.measure("0000", "1111"));
        assertEquals(3, hammingDistanceMetric.measure("2173896", "2233796"));
    }
}
