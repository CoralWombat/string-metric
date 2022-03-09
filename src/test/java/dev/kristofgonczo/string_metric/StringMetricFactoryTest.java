package dev.kristofgonczo.string_metric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class StringMetricFactoryTest {

    @Test
    void getStringMetricTest() {
        assertThrows(
                NullPointerException.class,
                () -> StringMetricFactory.getStringMetric(null)
        );
    }

}
