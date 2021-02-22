package com.qinfengsa.pattern.command;

import lombok.extern.slf4j.Slf4j;

/**
 * 命令的接收者, 也是命令具体的执行者
 *
 * @author qinfengsa
 * @date 2021/1/16 12:34
 */
@Slf4j
public class Receiver {

    public void bakeMutton() {
        log.debug("开始烤羊肉串");
    }

    public void bakeChickenWing() {
        log.debug("开始烤鸡翅");
    }
}
