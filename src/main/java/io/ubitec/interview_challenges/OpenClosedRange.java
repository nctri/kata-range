package io.ubitec.interview_challenges;

public class OpenClosedRange<T extends Comparable<T>> extends AbstractRange<T> {
    /**
     * Constructor is private BY DESIGN.
     *
     * TODO: Change the constructor to meet your requirements.
     * @param lowerBound
     * @param upperBound
     */
    private OpenClosedRange(T lowerBound, T upperBound) {
        super(lowerBound, upperBound);
    }

    public static <T extends Comparable<T>> OpenClosedRange<T> of(T lowerBound, T upperBound) {
        return new OpenClosedRange<>(lowerBound, upperBound);
    }

    @Override
    public boolean contains(T value) {
        return value.compareTo(lowerBound()) > 0  && value.compareTo(upperBound()) <= 0;
    }
}
