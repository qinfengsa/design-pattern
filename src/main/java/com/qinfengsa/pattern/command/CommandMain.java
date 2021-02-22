package com.qinfengsa.pattern.command;

/**
 * 命令模式 将一个请求封装成一个对象，从而使您可以用不同的请求对客户进行参数化
 *
 * @author qinfengsa
 * @date 2021/1/15 9:21
 */
public class CommandMain {

    public static void main(String[] args) {
        // 烤肉厨师
        Receiver receiver = new Receiver();
        // 服务员
        Waiter waiter = new Waiter();
        BakeChickenWingCommand command1 = new BakeChickenWingCommand(receiver);
        waiter.addOrder(command1);
        BakeMuttonCommand command2 = new BakeMuttonCommand(receiver);
        waiter.addOrder(command2);
        BakeMuttonCommand command3 = new BakeMuttonCommand(receiver);
        waiter.addOrder(command3);

        waiter.commandNotify();
    }

    static class BakeChickenWingCommand implements Command {
        private final Receiver receiver;

        BakeChickenWingCommand(Receiver receiver) {
            this.receiver = receiver;
        }

        @Override
        public void execute() {
            receiver.bakeChickenWing();
        }
    }

    static class BakeMuttonCommand implements Command {
        private final Receiver receiver;

        BakeMuttonCommand(Receiver receiver) {
            this.receiver = receiver;
        }

        @Override
        public void execute() {
            receiver.bakeMutton();
        }
    }
}
