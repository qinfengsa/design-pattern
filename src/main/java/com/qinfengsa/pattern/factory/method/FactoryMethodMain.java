package com.qinfengsa.pattern.factory.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/7 14:55
 */
@Slf4j
public class FactoryMethodMain {

    public static void main(String[] args) {
        PhoneFactory factory1 = new ApplePhoneFactory();
        Phone phone1 = factory1.create();
        phone1.create();

        PhoneFactory factory2 = new HuaweiPhoneFactory();
        Phone phone2 = factory2.create();
        phone2.create();
    }

    static class ApplePhone implements Phone {
        @Override
        public void create() {
            log.debug("生产苹果手机");
        }
    }

    static class HuaweiPhone implements Phone {
        @Override
        public void create() {
            log.debug("生产华为手机");
        }
    }

    static class ApplePhoneFactory implements PhoneFactory {

        @Override
        public Phone create() {
            return new ApplePhone();
        }
    }

    static class HuaweiPhoneFactory implements PhoneFactory {

        @Override
        public Phone create() {
            return new HuaweiPhone();
        }
    }
}
