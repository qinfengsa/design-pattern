package com.qinfengsa.pattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.extern.slf4j.Slf4j;

/**
 * 网站工厂
 *
 * @author qinfengsa
 * @date 2021/1/16 17:27
 */
@Slf4j
public class WebSiteFactory {

    private final Map<String, WebSite> webSiteMap = new ConcurrentHashMap<>();

    public WebSite getWebSiteCategory(String key) {
        return webSiteMap.computeIfAbsent(key, k -> new ConcreteWebSite(key));
    }

    static class ConcreteWebSite implements WebSite {
        private final String name;

        ConcreteWebSite(String name) {
            this.name = name;
        }

        @Override
        public void use(User user) {
            log.debug("网站分类:{} 用户:{}", name, user.getName());
        }
    }

    public int getWebSiteCount() {
        return webSiteMap.size();
    }
}
