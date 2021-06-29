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
    public boolean doCompare(T value) {
        return RangeUtil.greaterThan(value, lowerBound()) && RangeUtil.lessThanOrEquals(value, upperBound());
    }

    @Override
    protected boolean valueGreaterThanLowerBound(T value) {
        return RangeUtil.greaterThan(value, lowerBound());
    }

    @Override
    protected boolean valueLessThanUpperBound(T value) {
        return RangeUtil.lessThanOrEquals(value, upperBound());
    }
}
