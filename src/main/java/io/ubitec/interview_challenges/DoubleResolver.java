package io.ubitec.interview_challenges;

public class DoubleResolver implements DataTypeResolver<Double> {

    @Override
    public Double convert(String data) {
        try {
            return Double.valueOf(data);
        } catch (NumberFormatException ex) {
            return null;
        }

    }
}
