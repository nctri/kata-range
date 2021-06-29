package io.ubitec.interview_challenges;

import java.util.Date;

public class ClosedRange<T extends Comparable<T>> extends AbstractRange<T> {
    /**
     * Constructor is private BY DESIGN.
     *
     * TODO: Change the constructor to meet your requirements.
     * @param lowerBound
     * @param upperBound
     */
    private ClosedRange(T lowerBound, T upperBound) {
        super(lowerBound, upperBound);
    }

    public static <T extends Comparable<T>> ClosedRange<T> of(T lowerBound, T upperBound) {
        return new ClosedRange<>(lowerBound, upperBound);
    }

    @Override
    public String getRightParenthesesType() {
        return "]";
    }

    @Override
    public String getLeftParenthesesType() {
        return "[";
    }

    @Override
    public boolean doCompare(T value) {
        return RangeUtil.lessThanOrEquals(value, upperBound()) && RangeUtil.greaterThanOrEquals(value, lowerBound());
    }

    @Override
    protected boolean valueGreaterThanLowerBound(T value) {
        return RangeUtil.greaterThanOrEquals(value, lowerBound());
    }

    @Override
    protected boolean valueLessThanUpperBound(T value) {
        return RangeUtil.lessThanOrEquals(value, upperBound());
    }

    public static void main(String[] args) {
        Converter<Date, String> converter = (String t) ->  new Date(Long.parseLong(t));
        System.out.println(converter.convert("1231231232"));
    }

}
