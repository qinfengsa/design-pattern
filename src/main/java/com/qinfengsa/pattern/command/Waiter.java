package com.qinfengsa.pattern.command;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * 服务员 处理command
 *
 * @author qinfengsa
 * @date 2021/1/15 17:05
 */
@Slf4j
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    public void addOrder(Command command) {
        orders.add(command);
        log.debug(
                "增加订单:{} 时间:{}",
                command.toString(),
                LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    public void commandNotify() {
        for (Iterator<Command> iterator = orders.listIterator(); iterator.hasNext(); ) {
            Command command = iterator.next();
            iterator.remove();
            command.execute();
        }
    }
}
