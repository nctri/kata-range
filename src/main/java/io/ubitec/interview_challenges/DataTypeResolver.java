package io.ubitec.interview_challenges;

public interface DataTypeResolver<T> {

    T convert(String data);

}
