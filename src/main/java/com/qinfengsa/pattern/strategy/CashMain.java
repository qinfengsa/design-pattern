package com.qinfengsa.pattern.strategy;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/6 9:23
 */
@Slf4j
public class CashMain {

    // 打折策略
    static Map<String, CashSuper> strategyMap = new HashMap<>();

    static {
        strategyMap.put("打8折", money -> money * 0.8);
        strategyMap.put("打7折", new CashContext.CashRebate(0.7));
        strategyMap.put("满300减100", new CashContext.CashReturn(300, 100));
        strategyMap.put("正常收费", new CashContext.CashNormal());
    }

    public static double getResult(double money, String type) {
        CashContext cashContext =
                new CashContext(strategyMap.getOrDefault(type, new CashContext.CashNormal()));
        return cashContext.getResult(money);
    }

    public static void main(String[] args) {
        double money = 400;
        String type = "打7折";
        log.debug("结果:{}", getResult(money, type));
    }
}
