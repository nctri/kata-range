package io.ubitec.interview_challenges;

public class OpenRange extends AbstractRange {
    /**
     * Constructor is private BY DESIGN.
     *
     * TODO: Change the constructor to meet your requirements.
     * @param lowerBound
     * @param upperBound
     */
    private OpenRange(int lowerBound, int upperBound) {
        super(lowerBound, upperBound);
    }

    public static OpenRange of(int lowerBound, int upperBound) {
        return new OpenRange(lowerBound, upperBound);
    }

    @Override
    public boolean contains(int value) {
        return value < upperBound() && value > lowerBound();
    }
}
