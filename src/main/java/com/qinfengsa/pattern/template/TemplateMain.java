package com.qinfengsa.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/7 15:41
 */
@Slf4j
public class TemplateMain {

    public static void main(String[] args) {
        log.debug("学生A试卷");
        TestPaper studentA = new TestPaperA();
        studentA.question1();
        studentA.question2();
        studentA.question3();
        log.debug("学生B试卷");
        TestPaper studentB = new TestPaperB();
        studentB.question1();
        studentB.question2();
        studentB.question3();
    }

    static class TestPaperA extends TestPaper {

        @Override
        protected String answer1() {
            return "1";
        }

        @Override
        protected String answer2() {
            return "4";
        }

        @Override
        protected String answer3() {
            return "2";
        }
    }

    static class TestPaperB extends TestPaper {

        @Override
        protected String answer1() {
            return "3";
        }

        @Override
        protected String answer2() {
            return "2";
        }

        @Override
        protected String answer3() {
            return "1";
        }
    }
}
