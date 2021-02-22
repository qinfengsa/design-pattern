package com.qinfengsa.pattern.state;

import lombok.Data;

/**
 * @author qinfengsa
 * @date 2021/1/9 10:15
 */
@Data
public class WorkContext {

    private WorkState state;

    private int hour = 0;

    private boolean taskFinished = false;

    public WorkContext() {
        this.state = WorkState.FORENOON_STATE;
    }

    public void handle() {

        state.getHandle().handle(this);
    }
}
