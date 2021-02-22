package com.qinfengsa.pattern.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 桥接模式 将抽象部分与它的实现部分分离,使它们都可以独立地变化
 *
 * <p>对象可以通过两个或多个维度进行分类, 我们可以通过组合来实现不同的对象
 *
 * <p>
 *
 * @author qinfengsa
 * @date 2021/1/14 20:08
 */
@Slf4j
public class BridgeMain {

    public static void main(String[] args) {
        // 白色
        Color white = new White();
        // 正方形
        Shape square = new Square();
        // 白色的正方形
        square.setColor(white);
        square.draw();

        // 长方形
        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();

        // 红色
        Color red = new Red();
        Circle circle = new Circle();
        circle.setColor(red);
        circle.draw();
    }

    static class Circle extends Shape {
        public void draw() {
            color.bepaint("圆");
        }
    }

    static class Square extends Shape {
        public void draw() {
            color.bepaint("正方形");
        }
    }

    static class Rectangle extends Shape {
        public void draw() {
            color.bepaint("长方形");
        }
    }

    static class White implements Color {

        @Override
        public void bepaint(String shape) {
            log.debug("白色的{}", shape);
        }
    }

    static class Red implements Color {

        @Override
        public void bepaint(String shape) {
            log.debug("红色的{}", shape);
        }
    }
}
