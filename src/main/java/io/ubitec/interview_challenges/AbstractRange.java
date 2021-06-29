package io.ubitec.interview_challenges;

public abstract class AbstractRange<T extends Comparable<T>> implements Range<T> {

  private final T lowerBound;
  private final T upperBound;


  /**
   * Constructor is private BY DESIGN.
   *
   * TODO: Change the constructor to meet your requirements.
   */
  protected AbstractRange(T lowerBound, T upperBound) {
    if (lowerBound != null && upperBound != null && lowerBound.compareTo(upperBound) > 0) {
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
  public boolean contains(T value) {
    if (lowerBound == null && upperBound == null) {
      return true;
    } else if (lowerBound == null) {
      return valueLessThanUpperBound(value);
    } else  if (upperBound == null)  {
      return  valueGreaterThanLowerBound(value);
    } else {
      return doCompare(value);
    }
  }

  protected abstract boolean doCompare(T value);

  protected abstract boolean valueGreaterThanLowerBound(T value);

  protected abstract boolean valueLessThanUpperBound(T value);

  /**
   * Returns the {@code lowerbound} of this {@code Range}.
   */
  public T lowerBound() {
    return this.lowerBound;
  }

  /**
   * Returns the {@code upperbound} of this {@code Range}.
   */
  public T upperBound() {
    return this.upperBound;
  }

}
