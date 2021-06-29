package io.ubitec.interview_challenges;

public class ClosedOpenRange extends AbstractRange {


    /**
     * Constructor is private BY DESIGN.
     *
     * TODO: Change the constructor to meet your requirements.
     * @param lowerBound
     * @param upperBound
     */
    private ClosedOpenRange(int lowerBound, int upperBound) {
        super(lowerBound, upperBound);
    }

    public static ClosedOpenRange of(int lowerBound, int upperBound) {
        return new ClosedOpenRange(lowerBound, upperBound);
    }

    @Override
    public boolean contains(int value) {
        return value >= lowerBound() && value < upperBound();
    }
}
