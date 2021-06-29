package io.ubitec.interview_challenges;

public class OpenClosedRange extends AbstractRange {
    /**
     * Constructor is private BY DESIGN.
     *
     * TODO: Change the constructor to meet your requirements.
     * @param lowerBound
     * @param upperBound
     */
    private OpenClosedRange(int lowerBound, int upperBound) {
        super(lowerBound, upperBound);
    }

    public static OpenClosedRange of(int lowerBound, int upperBound) {
        return new OpenClosedRange(lowerBound, upperBound);
    }

    @Override
    public boolean contains(int value) {
        return value > lowerBound() && value <= upperBound();
    }
}
