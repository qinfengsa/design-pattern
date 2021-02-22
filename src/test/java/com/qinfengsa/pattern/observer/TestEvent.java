package com.qinfengsa.pattern.observer;

/**
 * @author qinfengsa
 * @date 2020/10/13 14:27
 */
public class TestEvent {

    private String message;

    public TestEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
