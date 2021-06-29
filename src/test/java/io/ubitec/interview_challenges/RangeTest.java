package io.ubitec.interview_challenges;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.assertj.core.api.Assertions.*;

public class RangeTest {

  @Test
  public void should_create_range() {
    Range<Integer> range = Range.of(5, 50);
    assertThat(range.lowerBound()).isEqualTo(5);
    assertThat(range.upperBound()).isEqualTo(50);
  }

  @Test
  public void should_throw_error__when_create_with_lowerbound_bigger_than_upperbound() {
    try {
      Range.of(500, 1);
      fail("Should not allow creating a invalid Range");
    } catch(IllegalArgumentException e) {
      // pass
    }
  }

  @Test
  public void closed_range_should_contain_both_bounds_and_all_elements_in_between() {
    Range<Integer> closedRange = Range.closed(5, 50);

    assertThat(closedRange.contains(Integer.MIN_VALUE)).isEqualTo( false);
    assertThat(closedRange.contains(4)).isEqualTo( false);

    assertThat(closedRange.contains(5)).isEqualTo( true);

    assertThat(closedRange.contains(42)).isEqualTo( true);

    assertThat(closedRange.contains(50)).isEqualTo( true);

    assertThat(closedRange.contains(10000)).isEqualTo( false);
    assertThat(closedRange.contains(Integer.MAX_VALUE)).isEqualTo( false);
  }

  @Test
  public void range_should_be_state_independent() {
    Range<Integer> range1 = Range.of(5, 10);
    Range<Integer> range2 = Range.of(11, 20);

    assertThat(range1.contains(10)).isEqualTo( true);
    assertThat(range2.contains(10)).isEqualTo( false);
  }

  @Test
  public void less_than_should_contain_all_element_less_than_value_and_left_infinitive() {
    Range<Integer> lessThan = Range.lessThan(50);

    assertThat(lessThan.contains(Integer.MIN_VALUE)).isEqualTo( true);
    assertThat(lessThan.contains(Integer.MAX_VALUE)).isEqualTo( false);
    assertThat(lessThan.contains(4)).isEqualTo( true);
    assertThat(lessThan.contains(51)).isEqualTo( false);
  }

  @Test
  public void greater_than_should_contain_all_element_greater_than_value_and_right_infinitive() {
    Range<Integer> greaterThan = Range.greaterThan(50);

    assertThat(greaterThan.contains(Integer.MIN_VALUE)).isEqualTo(false);
    assertThat(greaterThan.contains(Integer.MAX_VALUE)).isEqualTo(true);
    assertThat(greaterThan.contains(4)).isEqualTo(false);
    assertThat(greaterThan.contains(51)).isEqualTo(true);
    assertThat(greaterThan.contains(50)).isEqualTo(false);
  }


  @Test
  public void at_most_should_contain_all_element_less_than_or_equals_value_and_left_infinitive() {
    Range<Integer> atMost = Range.atMost(100);

    assertThat(atMost.contains(Integer.MIN_VALUE)).isEqualTo( true);
    assertThat(atMost.contains(Integer.MAX_VALUE)).isEqualTo( false);
    assertThat(atMost.contains(4)).isEqualTo( true);
    assertThat(atMost.contains(100)).isEqualTo( true);
    assertThat(atMost.contains(101)).isEqualTo( false);
    assertThat(atMost.contains(51)).isEqualTo( true);
  }


  @Test
  public void at_least_should_contain_all_element_greater_than_or_equals_value_and_right_infinitive() {
    Range<Integer> atLeast = Range.atLeast(50);

    assertThat(atLeast.contains(Integer.MIN_VALUE)).isEqualTo(false);
    assertThat(atLeast.contains(Integer.MAX_VALUE)).isEqualTo(true);
    assertThat(atLeast.contains(4)).isEqualTo(false);
    assertThat(atLeast.contains(50)).isEqualTo(true);
    assertThat(atLeast.contains(51)).isEqualTo(true);
  }

  @Test
  public void all_should_contain_all_element() {
    Range<Integer> all = Range.all();

    assertThat(all.contains(Integer.MIN_VALUE)).isEqualTo(true);
    assertThat(all.contains(Integer.MAX_VALUE)).isEqualTo(true);
    assertThat(all.contains(4)).isEqualTo(true);
    assertThat(all.contains(50)).isEqualTo(true);
    assertThat(all.contains(51)).isEqualTo(true);
  }

  @Test
  public void to_string_should_look_expected() {
    Range<String> lessThen100 = Range.lessThan("100");
    assert lessThen100.toString().equals("[Infinitive, 100)");
  }

  @Test
  public void parse_notation_should_work_in_normal_case() {
    String rangeString = Range.lessThan(100).toString();
    Range<Integer> lessThan100 = Range.parse(rangeString, Integer.class);
    assert lessThan100.toString().equals("[Infinitive, 100)");
  }

  //TODO: them co che compartor truyen nhu lambda vao`

}
