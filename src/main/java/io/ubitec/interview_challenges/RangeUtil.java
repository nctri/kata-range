package io.ubitec.interview_challenges;

public class RangeUtil {

    public static <T extends Comparable<T>> boolean greaterThan(T first, T second) {
        return first.compareTo(second) > 0;
    }

    public static <T extends Comparable<T>> boolean greaterThanOrEquals(T first, T second) {
        return first.compareTo(second) >= 0;
    }


    public static <T extends Comparable<T>> boolean lessThan(T first, T second) {
        return first.compareTo(second) < 0;
    }

    public static <T extends Comparable<T>> boolean lessThanOrEquals(T first, T second) {
        return first.compareTo(second) <= 0;
    }

}
