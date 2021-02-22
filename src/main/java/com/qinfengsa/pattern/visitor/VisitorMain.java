package com.qinfengsa.pattern.visitor;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * 访问者模式
 *
 * <p>一种将数据操作和数据结构分离的设计模式
 *
 * <p>表示一个作用于某对象结构中的各元素的操作，它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作
 *
 * @author qinfengsa
 * @date 2021/1/16 18:27
 */
@Slf4j
public class VisitorMain {

    public static void main(String[] args) {
        // 构建报表
        BusinessReport report = new BusinessReport();
        log.debug("=========== CEO看报表 ===========");
        report.showReport(new CEOVisitor());
        log.debug("=========== CTO看报表 ===========");
        report.showReport(new CTOVisitor());
    }

    static class BusinessReport {

        private List<Staff> staffList = new ArrayList<>();

        public BusinessReport() {
            staffList.add(new Manager("经理-A"));
            staffList.add(new Engineer("工程师-A"));
            staffList.add(new Engineer("工程师-B"));
            staffList.add(new Engineer("工程师-C"));
            staffList.add(new Manager("经理-B"));
            staffList.add(new Engineer("工程师-D"));
        }

        /**
         * 为访问者展示报表
         *
         * @param visitor 公司高层，如CEO、CTO
         */
        public void showReport(Visitor visitor) {
            for (Staff staff : staffList) {
                staff.accept(visitor);
            }
        }
    }

    static class CEOVisitor implements Visitor {

        @Override
        public void visit(Engineer engineer) {
            log.debug(
                    "工程师:{},KPI:{},代码行数:{}",
                    engineer.getName(),
                    engineer.getKpi(),
                    engineer.getCodeLines());
        }

        @Override
        public void visit(Manager manager) {
            log.debug(
                    "经理:{},KPI:{},产品数量:{}",
                    manager.getName(),
                    manager.getKpi(),
                    manager.getProducts());
        }
    }

    static class CTOVisitor implements Visitor {

        @Override
        public void visit(Engineer engineer) {
            log.debug("工程师:{}, 代码行数:{}", engineer.getName(), engineer.getCodeLines());
        }

        @Override
        public void visit(Manager manager) {
            log.debug("经理:{}, 产品数量:{}", manager.getName(), manager.getProducts());
        }
    }
}
