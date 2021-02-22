package com.qinfengsa.pattern.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * 外观（Facade）模式又叫作门面模式，是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。
 *
 * <p>该模式对外有一个统一接口，外部应用程序不用关心内部子系统的具体细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。
 *
 * <p>降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口。
 *
 * @author qinfengsa
 * @date 2021/1/8 16:30
 */
@Slf4j
public class FacadeMain {

    public static void main(String[] args) {
        Fund fund = new Fund();
        log.debug("基金买入");
        fund.buyFund();
        log.debug("基金卖出");
        fund.sellFund();
    }
}
