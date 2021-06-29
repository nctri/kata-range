package io.ubitec.interview_challenges;


public interface Range<T extends Comparable<T>> {

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
