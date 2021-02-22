package com.qinfengsa.pattern.interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * 解释器模式
 *
 * <p>给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子
 *
 * @author qinfengsa
 * @date 2021/1/16 17:48
 */
@Slf4j
public class InterpreterMain {

    public static void main(String[] args) {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        Expression isMarriedWoman = new AndExpression(julie, married);
        log.debug("Julie is a married women ? {}", isMarriedWoman.interpret("Married Julie"));
    }

    // 终端解析 判断 是否包含data
    static class TerminalExpression implements Expression {

        private final String data;

        TerminalExpression(String data) {
            this.data = data;
        }

        @Override
        public boolean interpret(String context) {
            return context.contains(data);
        }
    }

    // 与运算解析
    static class AndExpression implements Expression {

        private final Expression expr1;
        private final Expression expr2;

        public AndExpression(Expression expr1, Expression expr2) {
            this.expr1 = expr1;
            this.expr2 = expr2;
        }

        @Override
        public boolean interpret(String context) {
            return expr1.interpret(context) && expr2.interpret(context);
        }
    }
}
