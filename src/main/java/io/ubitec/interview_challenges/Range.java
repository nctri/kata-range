package io.ubitec.interview_challenges;

public class Range {

  private final int lowerBound;
  private final int upperBound;


  /**
   * Constructor is private BY DESIGN.
   *
   * TODO: Change the constructor to meet your requirements.
   */
  private Range(int lowerBound, int upperBound) {
    super();
    if (lowerBound > upperBound) {
      throw new IllegalArgumentException("lowerBound cannot be greater than upperBound!");
    }
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }

  /**
   * Creates a new <b>closed</b> {@code Range} that includes both bounds.
   */
  public static Range of(int lowerBound, int upperBound) {
    return new Range(lowerBound, upperBound);
  }

  /**
   * Returns {@code true} on if the given {@code value} is contained in this
   * {@code Range}.
   */
  public boolean contains(int value) {
    return value <= upperBound && value >= lowerBound;
  }

  /**
   * Returns the {@code lowerbound} of this {@code Range}.
   */
  public int lowerbound() {
    return this.lowerBound;
  }

  /**
   * Returns the {@code upperbound} of this {@code Range}.
   */
  public int upperbound() {
    return this.upperBound;
  }

}
