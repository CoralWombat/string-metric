package dev.kristofgonczo.string_metric.exception;

public class TwoStringsHaveDifferentLengthException extends RuntimeException {

    public TwoStringsHaveDifferentLengthException(String string1, String string2) {
        super("Cannot calculate difference because the two strings have different lengths:\"" + string1 + "\", \"" + string2 + "\".");
    }
}
