package com.qinfengsa.pattern.observer;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2020/10/13 14:33
 */
@Slf4j
public class EventListener {
    private String name;
    private String lastMessage;

    public EventListener(String name) {
        this.name = name;
    }

    @Subscribe
    public void listen(TestEvent event) {
        lastMessage = event.getMessage();
        log.debug("name:{} Message:{}", name, lastMessage);
    }

    public String getLastMessage() {
        return lastMessage;
    }
}
