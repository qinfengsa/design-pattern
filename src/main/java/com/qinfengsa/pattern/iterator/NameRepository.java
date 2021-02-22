package com.qinfengsa.pattern.iterator;

import java.util.Iterator;

/**
 * @author qinfengsa
 * @date 2021/1/14 10:12
 */
public class NameRepository {

    private final String[] names;

    public NameRepository(String[] names) {
        this.names = names;
    }

    public Iterator<String> getIterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < names.length;
            }

            @Override
            public String next() {
                return hasNext() ? names[index++] : null;
            }
        };
    }
}
