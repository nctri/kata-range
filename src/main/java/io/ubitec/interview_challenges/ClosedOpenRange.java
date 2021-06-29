package io.ubitec.interview_challenges;

public class ClosedOpenRange<T extends Comparable<T>> extends AbstractRange<T> {


    /**
     * Constructor is private BY DESIGN.
     *
     * TODO: Change the constructor to meet your requirements.
     * @param lowerBound
     * @param upperBound
     */
    private ClosedOpenRange(T lowerBound, T upperBound) {
        super(lowerBound, upperBound);
    }

    public static <T extends Comparable<T>> ClosedOpenRange<T> of(T lowerBound, T upperBound) {
        return new ClosedOpenRange<T>(lowerBound, upperBound);
    }

    @Override
    public boolean contains(T value) {
        return value.compareTo(lowerBound()) >= 0 && value.compareTo(upperBound()) < 0;
    }
}
