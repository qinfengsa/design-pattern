package com.qinfengsa.pattern.factory.simple;

/**
 * @author qinfengsa
 * @date 2021/1/5 16:01
 */
public class OperationFactory {

    public static Operation createOperation(String op) {
        Operation operation;
        switch (op) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMult();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new IllegalStateException("错误的运算符: " + op);
        }
        return operation;
    }

    /**
     * @author qinfengsa
     * @date 2021/1/5 15:51
     */
    static class OperationAdd extends Operation {
        @Override
        public double getResult() {
            return getNum1() + getNum2();
        }
    }

    /**
     * @author qinfengsa
     * @date 2021/1/5 15:51
     */
    static class OperationDiv extends Operation {
        @Override
        public double getResult() {
            return getNum1() - getNum2();
        }
    }

    /**
     * @author qinfengsa
     * @date 2021/1/5 15:51
     */
    static class OperationMult extends Operation {
        @Override
        public double getResult() {
            return getNum1() * getNum2();
        }
    }

    /**
     * @author qinfengsa
     * @date 2021/1/5 15:51
     */
    static class OperationSub extends Operation {
        @Override
        public double getResult() {
            if (getNum2() == 0.0) {
                throw new IllegalArgumentException("除数不能为0");
            }
            return getNum1() / getNum2();
        }
    }
}
