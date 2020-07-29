package com.lechowicz;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatList {
    public Stream<Object> execute(Object[] multidimensionalList){
        return Arrays.stream(multidimensionalList).
                flatMap(o -> o instanceof Object[]? execute((Object[])o): Stream.of(o));
    }
}
