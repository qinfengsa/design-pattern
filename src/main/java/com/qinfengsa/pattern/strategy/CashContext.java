package com.qinfengsa.pattern.strategy;

/**
 * @author qinfengsa
 * @date 2021/1/5 17:15
 */
public class CashContext {

    private final CashSuper strategy;

    public CashContext(CashSuper strategy) {
        this.strategy = strategy;
    }

    public double getResult(double money) {
        return this.strategy.acceptCash(money);
    }

    static class CashNormal implements CashSuper {

        @Override
        public double acceptCash(double money) {
            return money;
        }
    }

    static class CashRebate implements CashSuper {
        // 折扣
        private final double rebate;

        CashRebate(double rebate) {
            this.rebate = rebate;
        }

        @Override
        public double acceptCash(double money) {
            return this.rebate * money;
        }
    }

    static class CashReturn implements CashSuper {

        private final double moneyCondition;

        private final double moneyReturn;

        CashReturn(double moneyCondition, double moneyReturn) {
            this.moneyCondition = moneyCondition;
            this.moneyReturn = moneyReturn;
        }

        @Override
        public double acceptCash(double money) {
            double result = money;
            if (result > moneyCondition) {
                result -= moneyReturn;
            }
            return result;
        }
    }
}
