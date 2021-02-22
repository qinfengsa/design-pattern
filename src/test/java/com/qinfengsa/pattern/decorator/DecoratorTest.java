package com.qinfengsa.pattern.decorator;

import com.qinfengsa.pattern.decorator.beverage.Beverage;
import com.qinfengsa.pattern.decorator.beverage.DarkRoast;
import com.qinfengsa.pattern.decorator.beverage.Espresso;
import com.qinfengsa.pattern.decorator.beverage.HouseBlend;
import com.qinfengsa.pattern.decorator.beverage.Mocha;
import com.qinfengsa.pattern.decorator.beverage.Soy;
import com.qinfengsa.pattern.decorator.beverage.Whip;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author qinfengsa
 * @date 2020/10/13 16:36
 */
@Slf4j
public class DecoratorTest {

    @Test
    public void testBeverage() {
        Beverage beverage = new Espresso();
        log.debug(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        log.debug(beverage2.getDescription() + " $" + beverage2.cost());
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        log.debug(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
