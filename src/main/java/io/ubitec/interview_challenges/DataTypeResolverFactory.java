package io.ubitec.interview_challenges;

public class DataTypeResolverFactory {

    public static <T> DataTypeResolver<T> getResolver(Class<T> type) {
        if (type.equals(Integer.class)) {
            return (DataTypeResolver<T>) new IntegerResolver();
        } else if(Double.class.equals(type)) {
            return (DataTypeResolver<T>) new DoubleResolver();
        }
        throw new IllegalArgumentException("Unsupported operator!");
    }

}
