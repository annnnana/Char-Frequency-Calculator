package com.charfrequencycalc.util;

import org.jeasy.random.EasyRandom;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomObjectGenerator {

    private final static EasyRandom generator = new EasyRandom();

    public static <T> T generate(Class<T> clazz) {
        return generator.nextObject(clazz);
    }

    public static <T> List<T> generate(Class<T> clazz, int listSize) {
        return Stream.generate(() -> generate(clazz))
                .limit(listSize)
                .collect(Collectors.toList());
    }

}
