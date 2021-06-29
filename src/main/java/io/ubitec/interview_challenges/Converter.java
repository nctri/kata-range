package io.ubitec.interview_challenges;

public interface Converter<T, R> {

    T convert(R r);

}
