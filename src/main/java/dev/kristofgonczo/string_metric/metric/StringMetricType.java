package dev.kristofgonczo.string_metric.metric;

public enum StringMetricType {

    /**
     * The Levenshtein distance between two words is the minimum number of single-character edits (insertions, deletions
     * or substitutions) required to change one word into the other.
     */
    LEVENSHTEIN_DISTANCE,

    /**
     * The Damerau–Levenshtein distance between two words is the minimum number of operations (consisting of insertions,
     * deletions or substitutions of a single character, or transposition of two adjacent characters) required to change
     * one word into the other.
     */
    DAMERAU_LEVENSHTEIN_DISTANCE,

    /**
     * The Hamming distance is the minimum number of substitutions required to change one string into the other, or the
     * minimum number of errors that could have transformed one string into the other.
     */
    HAMMING_DISTANCE

}
