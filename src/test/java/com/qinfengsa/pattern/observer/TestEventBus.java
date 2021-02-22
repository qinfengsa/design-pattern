package com.qinfengsa.pattern.observer;

import com.google.common.eventbus.EventBus;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author qinfengsa
 * @date 2020/10/13 14:35
 */
@Slf4j
public class TestEventBus {
    @Test
    public void testReceiveEvent() throws Exception {

        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener("1");

        eventBus.register(listener);

        eventBus.register(new NewEventListener("2"));

        eventBus.post(new TestEvent("test1"));
        eventBus.post(new NewEvent("test2"));

        eventBus.post(new TestEvent("KS"));

        log.debug("last:{}", listener.getLastMessage());
    }
}
