package io.ubitec.interview_challenges;

public abstract class AbstractRange implements Range {

  private final int lowerBound;
  private final int upperBound;


  /**
   * Constructor is private BY DESIGN.
   *
   * TODO: Change the constructor to meet your requirements.
   */
  protected AbstractRange(int lowerBound, int upperBound) {
    if (lowerBound > upperBound) {
      throw new IllegalArgumentException("lowerBound cannot be greater than upperBound!");
    }
    this.lowerBound = lowerBound;
    this.upperBound = upperBound;
  }

  /**
   * Creates a new <b>closed</b> {@code Range} that includes both bounds.
   */
 /* public static AbstractRange of(int lowerBound, int upperBound) {
    return new AbstractRange(lowerBound, upperBound);
  }*/

  /**
   * Returns {@code true} on if the given {@code value} is contained in this
   * {@code Range}.
   */
  public abstract boolean contains(int value);

  /**
   * Returns the {@code lowerbound} of this {@code Range}.
   */
  public int lowerBound() {
    return this.lowerBound;
  }

  /**
   * Returns the {@code upperbound} of this {@code Range}.
   */
  public int upperBound() {
    return this.upperBound;
  }

}
