package dev.kristofgonczo.string_metric.metric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StringMetricFactoryTest {

    @Test
    void getStringMetricTest() {
        assertThrows(
                NullPointerException.class,
                () -> StringMetricFactory.getStringMetric(null)
        );

        assertDoesNotThrow(() -> StringMetricFactory.getStringMetric(StringMetricType.LEVENSHTEIN_DISTANCE));
        assertDoesNotThrow(() -> StringMetricFactory.getStringMetric(StringMetricType.DAMERAU_LEVENSHTEIN_DISTANCE));
        assertDoesNotThrow(() -> StringMetricFactory.getStringMetric(StringMetricType.HAMMING_DISTANCE));
    }

}
