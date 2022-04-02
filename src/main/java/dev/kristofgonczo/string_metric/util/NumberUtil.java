package dev.kristofgonczo.string_metric.util;

import java.util.Arrays;

public abstract class NumberUtil {

    public static int min(int... numbers) {
        return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
    }

}
