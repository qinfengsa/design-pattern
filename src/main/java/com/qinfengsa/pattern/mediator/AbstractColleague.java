package com.qinfengsa.pattern.mediator;

/**
 * 同事接口
 *
 * @author qinfengsa
 * @date 2021/1/16 16:06
 */
public abstract class AbstractColleague {

    private Mediator mediator;

    protected AbstractColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    protected Mediator getMediator() {
        return mediator;
    }

    protected abstract void msgNotify(String message);
}
