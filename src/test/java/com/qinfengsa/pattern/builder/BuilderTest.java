package com.qinfengsa.pattern.builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author qinfengsa
 * @date 2021/1/4 15:34
 */
@Slf4j
public class BuilderTest {

    @Test
    public void testTextBuilder() {
        TextBuilder builder = new TextBuilder();
        Director director = new Director(builder);
        director.construct();
        log.debug("text:\n{}", builder.getResult());
    }

    @Test
    public void testHtmlBuilder() {
        HtmlBuilder builder = new HtmlBuilder();
        Director director = new Director(builder);
        director.construct();
        log.debug("file:{}", builder.getResult());
    }
}
