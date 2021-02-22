package com.qinfengsa.pattern.chain;

import java.util.Objects;
import lombok.extern.slf4j.Slf4j;

/**
 * 责任链模式 让多个对象都有机会接收请求，避免请求发送者和接收者的耦合关系，
 *
 * <p>将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止
 *
 * @author qinfengsa
 * @date 2021/1/16 14:48
 */
@Slf4j
public class ChainMain {

    public static void main(String[] args) {
        CommonManager cm = new CommonManager("经理");
        Director md = new Director("总监");
        GeneralManager gm = new GeneralManager("总经理");
        cm.setSuperior(md);
        md.setSuperior(gm);

        Request request1 = new Request("请假", "qinfengsa请假申请");
        request1.setRequestNum(1);
        cm.handleRequest(request1);

        Request request2 = new Request("请假", "qinfengsa请假申请");
        request2.setRequestNum(4);
        cm.handleRequest(request2);

        Request request3 = new Request("加薪", "qinfengsa加薪申请");
        request3.setRequestNum(500);
        cm.handleRequest(request3);

        Request request4 = new Request("加薪", "qinfengsa加薪申请");
        request4.setRequestNum(1000);
        cm.handleRequest(request4);
    }

    // 经理
    static class CommonManager extends Manager {

        protected CommonManager(String name) {
            super(name);
        }

        @Override
        protected void handleRequest(Request request) {
            // 请假小于2天 直接批准
            if (Objects.equals(request.getRequestType(), "请假") && request.getRequestNum() <= 2) {
                log.debug(
                        "{} : {} 天数 {} 被批准",
                        getName(),
                        request.getRequestContext(),
                        request.getRequestNum());
            } else if (Objects.nonNull(getSuperior())) {
                getSuperior().handleRequest(request);
            }
        }
    }

    // 总监
    static class Director extends Manager {

        protected Director(String name) {
            super(name);
        }

        @Override
        protected void handleRequest(Request request) {
            // 请假小于5天 直接批准
            if (Objects.equals(request.getRequestType(), "请假") && request.getRequestNum() <= 5) {
                log.debug(
                        "{} : {} 天数 {} 被批准",
                        getName(),
                        request.getRequestContext(),
                        request.getRequestNum());
            } else if (Objects.nonNull(getSuperior())) {
                getSuperior().handleRequest(request);
            }
        }
    }

    // 总经理
    static class GeneralManager extends Manager {

        protected GeneralManager(String name) {
            super(name);
        }

        @Override
        protected void handleRequest(Request request) {
            // 请假小于5天 直接批准
            if (Objects.equals(request.getRequestType(), "请假")) {
                log.debug(
                        "{} : {} 天数 {} 被批准",
                        getName(),
                        request.getRequestContext(),
                        request.getRequestNum());
            } else if (Objects.equals(request.getRequestType(), "加薪")
                    && request.getRequestNum() <= 500) {
                log.debug(
                        "{} : {} 加薪 {} 被批准",
                        getName(),
                        request.getRequestContext(),
                        request.getRequestNum());
            } else if (Objects.equals(request.getRequestType(), "加薪")
                    && request.getRequestNum() > 500) {
                log.debug(
                        "{} : {} 加薪 {} 以后再说吧",
                        getName(),
                        request.getRequestContext(),
                        request.getRequestNum());
            }
        }
    }
}
