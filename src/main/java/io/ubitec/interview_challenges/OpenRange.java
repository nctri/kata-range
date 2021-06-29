package io.ubitec.interview_challenges;

public class OpenRange<T extends Comparable<T>> extends AbstractRange<T> {
    /**
     * Constructor is private BY DESIGN.
     *
     * TODO: Change the constructor to meet your requirements.
     * @param lowerBound
     * @param upperBound
     */
    private OpenRange(T lowerBound, T upperBound) {
        super(lowerBound, upperBound);
    }

    public static <T extends Comparable<T>> OpenRange<T> of(T lowerBound, T upperBound) {
        return new OpenRange<>(lowerBound, upperBound);
    }

    @Override
    public boolean contains(T value) {
        return value.compareTo(upperBound()) < 0 && value.compareTo(lowerBound()) > 0;
    }
}
