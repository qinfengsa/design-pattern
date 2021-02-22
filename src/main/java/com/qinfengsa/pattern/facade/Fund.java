package com.qinfengsa.pattern.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * 基金
 * @author qinfengsa
 * @date 2021/1/8 16:31
 */
@Slf4j
public class Fund {

    private Stock1 stock1;

    private Stock2 stock2;

    private Stock3 stock3;

    private NationalDebt1 nationalDebt1;

    private Realty1 realty1;

    public Fund() {
        stock1 = new Stock1();
        stock2 = new Stock2();
        stock3 = new Stock3();
        nationalDebt1 = new NationalDebt1();
        realty1 = new Realty1();
    }

    public void buyFund() {
        stock1.buy();
        stock2.buy();
        stock3.buy();
        nationalDebt1.buy();
        realty1.buy();
    }

    public void sellFund() {
        stock1.sell();
        stock2.sell();
        stock3.sell();
        nationalDebt1.sell();
        realty1.sell();
    }

    static class Stock1 {
        public void buy() {
            log.debug("股票1 买入");
        }
        public void sell() {
            log.debug("股票1 卖出");
        }
    }

    static class Stock2 {
        public void buy() {
            log.debug("股票2 买入");
        }
        public void sell() {
            log.debug("股票2 卖出");
        }
    }

    static class Stock3 {
        public void buy() {
            log.debug("股票3 买入");
        }
        public void sell() {
            log.debug("股票3 卖出");
        }
    }

    static class NationalDebt1 {
        public void buy() {
            log.debug("国债1 买入");
        }
        public void sell() {
            log.debug("国债1 卖出");
        }
    }

    static class Realty1 {
        public void buy() {
            log.debug("房地产1 买入");
        }
        public void sell() {
            log.debug("房地产1 卖出");
        }
    }
}
