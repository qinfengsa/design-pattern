package com.qinfengsa.pattern.strategy;

import com.qinfengsa.entity.Duck;
import com.qinfengsa.entity.RubberDuck;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author qinfengsa
 * @date 2020/10/10 18:09
 */
@Slf4j
public class DuckTest {

    @Test
    public void test1() {
        Duck mallard = new RubberDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
