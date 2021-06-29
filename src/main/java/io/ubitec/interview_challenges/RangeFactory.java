package io.ubitec.interview_challenges;

import java.util.Comparator;
import java.util.HashMap;

public class RangeFactory {

    static <T extends Comparable<T>> Range<T> getFactory(String bracket,T lowerBound,T upperBound) {
        switch (bracket) {
            case "[)" :
                return Range.closedOpen(lowerBound, upperBound);
            case "[]" :
                return Range.closed(lowerBound, upperBound);
            case "(]" :
                return Range.openClosed(lowerBound, upperBound);
            case "()" :
                return Range.open(lowerBound, upperBound);
        }
        throw new IllegalArgumentException("Unsupported operator!");
    }

}
