package com.lechowicz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] array = { 1, 'a', new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
        FlatList flatList = new FlatList();
        Object[] flat = flatList.execute(array).toArray();
        System.out.println(Arrays.toString(flat));
    }
}
