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
    public boolean doCompare(T value) {
        return RangeUtil.greaterThanOrEquals(value, lowerBound())
                && RangeUtil.lessThan(value, upperBound());
    }

    @Override
    protected boolean valueGreaterThanLowerBound(T value) {
        return RangeUtil.greaterThanOrEquals(value, lowerBound());
    }

    @Override
    protected boolean valueLessThanUpperBound(T value) {
        return RangeUtil.lessThan(value, upperBound());
    }
}
