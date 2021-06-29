package io.ubitec.interview_challenges;

public class ClosedRange extends AbstractRange {
    /**
     * Constructor is private BY DESIGN.
     *
     * TODO: Change the constructor to meet your requirements.
     * @param lowerBound
     * @param upperBound
     */
    private ClosedRange(int lowerBound, int upperBound) {
        super(lowerBound, upperBound);
    }

    public static ClosedRange of(int lowerBound, int upperBound) {
        return new ClosedRange(lowerBound, upperBound);
    }

    @Override
    public boolean contains(int value) {
        return value <= upperBound() && value >= lowerBound();
    }


}
