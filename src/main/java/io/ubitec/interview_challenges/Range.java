package io.ubitec.interview_challenges;

public interface Range {

    static Range closed(int lowerBound, int upperBound) {
        return ClosedRange.of(lowerBound, upperBound);
    }

    static Range openClosed(int lowerBound, int upperBound) {
        return OpenClosedRange.of(lowerBound, upperBound);
    }

    static Range closedOpen(int lowerBound, int upperBound) {
        return ClosedOpenRange.of(lowerBound, upperBound);
    }

    static Range open(int lowerBound, int upperBound) {
        return OpenRange.of(lowerBound, upperBound);
    }

    static Range of(int lowerBound, int upperBound) {
        return closed(lowerBound, upperBound);
    }

    boolean contains(int value);

    int lowerBound();

    int upperBound();

}
