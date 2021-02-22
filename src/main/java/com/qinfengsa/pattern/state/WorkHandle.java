package com.qinfengsa.pattern.state;

/**
 * 工作处理接口
 *
 * @author qinfengsa
 * @date 2021/1/10 9:10
 */
public interface WorkHandle {

    void handle(WorkContext context);
}
