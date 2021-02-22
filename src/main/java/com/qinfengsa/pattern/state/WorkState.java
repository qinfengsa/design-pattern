package com.qinfengsa.pattern.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 工作状态
 *
 * @author qinfengsa
 * @date 2021/1/10 9:10
 */
@Slf4j
public enum WorkState {

    // 睡眠状态
    SLEEPING_STATE(context -> log.debug("当前时间: {}点 不行了,休息", context.getHour())),
    // 下班休息
    REST_STATE(context -> log.debug("当前时间: {}点 下班回家", context.getHour())),
    // 晚上
    EVENING_STATE(
            context -> {
                if (context.isTaskFinished()) {
                    context.setState(REST_STATE);
                    context.handle();
                } else if (context.getHour() < 21) {
                    log.debug("当前时间: {}点 加班,疲惫之极", context.getHour());
                } else {
                    context.setState(SLEEPING_STATE);
                    context.handle();
                }
            }),
    // 下午
    AFTERNOON_STATE(
            context -> {
                if (context.getHour() < 17) {
                    log.debug("当前时间: {}点 下午状态尚可,继续努力", context.getHour());
                } else {
                    context.setState(EVENING_STATE);
                    context.handle();
                }
            }),
    // 中午
    NOON_STATE(
            context -> {
                if (context.getHour() < 13) {
                    log.debug("当前时间: {}点 饿了,午饭 : 犯困,午休", context.getHour());
                } else {
                    context.setState(AFTERNOON_STATE);
                    context.handle();
                }
            }),
    // 午前
    FORENOON_STATE(
            context -> {
                if (context.getHour() < 12) {
                    log.debug("当前时间: {}点 上午工作,精神百倍", context.getHour());
                } else {
                    context.setState(NOON_STATE);
                    context.handle();
                }
            });

    private final WorkHandle handle;

    WorkState(WorkHandle handle) {
        this.handle = handle;
    }

    public WorkHandle getHandle() {
        return handle;
    }
}
