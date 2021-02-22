package com.qinfengsa.pattern.builder;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/4 14:12
 */
@Slf4j
public class TextBuilder implements Builder {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("===================\n").append("[").append(title).append("]").append("\n");
    }

    @Override
    public void makeString(String str) {
        sb.append(str).append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        Arrays.stream(items).forEach(item -> sb.append(" *").append(item).append("\n"));
    }

    @Override
    public void close() {
        sb.append("===================\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
