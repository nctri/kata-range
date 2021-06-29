package io.ubitec.interview_challenges;


public interface Range<T extends Comparable<T>> {

    static <T extends Comparable<T>> Range<T> lessThan(T upperBound) {
        return ClosedOpenRange.of(null, upperBound);
    }


    static <T extends Comparable<T>> Range<T> greaterThan(T lowerBound) {
        return OpenClosedRange.of(lowerBound, null);
    }

    static <T extends Comparable<T>> Range<T> atLeast(T lowerBound) {
        return ClosedRange.of(lowerBound, null);
    }

    static <T extends Comparable<T>> Range<T> atMost(T upperBound) {
        return ClosedRange.of(null, upperBound);
    }

    static <T extends Comparable<T>> Range<T> all() {
        return ClosedRange.of(null, null);
    }

    static <T extends Comparable<T>> Range<T> closed(T lowerBound, T upperBound) {
        return ClosedRange.of(lowerBound, upperBound);
    }

    static <T extends Comparable<T>> Range<T> openClosed(T lowerBound, T upperBound) {
        return OpenClosedRange.of(lowerBound, upperBound);
    }

    static <T extends Comparable<T>> Range<T> closedOpen(T lowerBound, T upperBound) {
        return ClosedOpenRange.of(lowerBound, upperBound);
    }

    static <T extends Comparable<T>> Range<T> open(T lowerBound, T upperBound) {
        return OpenRange.of(lowerBound, upperBound);
    }

    static <T extends Comparable<T>> Range<T> of(T lowerBound, T upperBound) {
        return closed(lowerBound, upperBound);
    }

    boolean contains(T value);

    T lowerBound();

    T upperBound();

}
