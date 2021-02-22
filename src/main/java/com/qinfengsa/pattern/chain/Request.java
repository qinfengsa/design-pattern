package com.qinfengsa.pattern.chain;

import lombok.Data;

/**
 * 工作申请
 *
 * @author qinfengsa
 * @date 2021/1/16 14:56
 */
@Data
public class Request {

    // 请求类型
    private String requestType;

    // 请求内容
    private String requestContext;

    public Request(String requestType, String requestContext) {
        this.requestType = requestType;
        this.requestContext = requestContext;
    }

    // 请求数量
    private int requestNum;
}
