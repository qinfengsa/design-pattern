package com.qinfengsa.pattern.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/6 15:07
 */
@Slf4j
public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person("小王");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        Sneakers sneakers = new Sneakers();
        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        sneakers.decorate(bigTrouser);
        System.out.println("第一种装扮");
        sneakers.show();
        System.out.println();
        System.out.println("第二种装扮");
        Tie tie = new Tie();
        Suit suit = new Suit();
        LeatherShoes leatherShoes = new LeatherShoes();
        leatherShoes.decorate(person);
        tie.decorate(leatherShoes);
        suit.decorate(tie);
        suit.show();
    }

    static class TShirts extends Finery {

        @Override
        public void show() {
            System.out.print("大T恤 ");
            super.show();
        }
    }

    static class BigTrouser extends Finery {

        @Override
        public void show() {
            System.out.print("垮裤 ");
            super.show();
        }
    }

    static class Sneakers extends Finery {

        @Override
        public void show() {
            System.out.print("球鞋 ");
            super.show();
        }
    }

    static class Tie extends Finery {

        @Override
        public void show() {
            System.out.print("领带 ");
            super.show();
        }
    }

    static class Suit extends Finery {

        @Override
        public void show() {
            System.out.print("西装 ");
            super.show();
        }
    }

    static class LeatherShoes extends Finery {

        @Override
        public void show() {
            System.out.print("皮鞋 ");
            super.show();
        }
    }
}
