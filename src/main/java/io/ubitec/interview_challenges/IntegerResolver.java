package io.ubitec.interview_challenges;

public class IntegerResolver implements DataTypeResolver<Integer> {

    @Override
    public Integer convert(String data) {
        try {
            return Integer.valueOf(data);
        } catch (NumberFormatException e) {
            return null; // indicate infinitive
        }

    }
}
