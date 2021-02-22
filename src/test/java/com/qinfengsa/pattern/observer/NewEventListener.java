package com.qinfengsa.pattern.observer;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2020/10/13 14:44
 */
@Slf4j
public class NewEventListener {

    private String name;
    private String lastMessage;

    public NewEventListener(String name) {
        this.name = name;
    }

    @Subscribe
    public void listen(NewEvent event) {
        lastMessage = event.getMessage();
        log.debug("name:{} Message:{}", name, lastMessage);
    }

    public String getLastMessage() {
        return lastMessage;
    }
}
