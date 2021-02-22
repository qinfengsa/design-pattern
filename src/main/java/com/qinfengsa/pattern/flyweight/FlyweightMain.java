package com.qinfengsa.pattern.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * 享元模式 主要用于减少创建对象的数量，以减少内存占用和提高性能
 *
 * @author qinfengsa
 * @date 2021/1/16 16:32
 */
@Slf4j
public class FlyweightMain {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite site1 = factory.getWebSiteCategory("产品展示");
        site1.use(new User("刘备"));

        WebSite site2 = factory.getWebSiteCategory("产品展示");
        site2.use(new User("曹操"));

        WebSite site3 = factory.getWebSiteCategory("产品展示");
        site3.use(new User("孙权"));

        WebSite site4 = factory.getWebSiteCategory("博客");
        site4.use(new User("关羽"));

        WebSite site5 = factory.getWebSiteCategory("博客");
        site5.use(new User("张飞"));

        WebSite site6 = factory.getWebSiteCategory("博客");
        site6.use(new User("赵云"));

        log.debug("网站总数 : {}", factory.getWebSiteCount());
    }
}
