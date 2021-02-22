package com.qinfengsa.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * 测试试卷
 *
 * @author qinfengsa
 * @date 2021/1/7 17:36
 */
@Slf4j
public abstract class TestPaper {

    // 问题
    public void question1() {
        log.debug("问题1: 1+1=?");
        log.debug("答案: {}", answer1());
    }

    public void question2() {
        log.debug("问题2: 2*2=?");
        log.debug("答案: {}", answer2());
    }

    public void question3() {
        log.debug("问题3: 3-1=?");
        log.debug("答案: {}", answer3());
    }

    // 答案
    protected abstract String answer1();

    protected abstract String answer2();

    protected abstract String answer3();
}
