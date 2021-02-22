package com.qinfengsa.pattern.prototype;

import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/7 15:15
 */
@Slf4j
public class PrototypeMain {

    public static void main(String[] args) {
        User user1 = new User(1, "A", LocalDate.of(2020, 1, 1));

        User user2 = (User) user1.clone();
        User user3 = (User) user1.clone();
        user3.setBirthDay(LocalDate.of(2011, 1, 1));
        log.debug("user1:{}", user1);
        log.debug("user2:{}", user2);
        log.debug("user3:{}", user3);
    }
}
