# string-metric

In mathematics and computer science, a string metric (also known as a string similarity metric or string distance
function) is a metric that measures distance ("inverse similarity") between two text strings for approximate string
matching or comparison and in fuzzy string searching. A requirement for a string metric (e.g. in contrast to string
matching) is fulfillment of the triangle inequality. For example, the strings "Sam" and "Samuel" can be considered to be
close. A string metric provides a number indicating an algorithm-specific indication of distance.

# How-to

1. Choose the preferred metric from the StringMetricType enum.
2. Use the StringMetricFactory to get the required metric class.
3. Use the measure method to calculate the distance between two string.

Example:

```
StringMetric stringMetric = StringMetricFactory.getStringMetric(StringMetricType.HAMMING_DISTANCE);
int distance = stringMetric.measure("string1", "string2");
```
