package com.qinfengsa.pattern.factory.simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/5 16:04
 */
@Slf4j
public class OperationMain {

    public static void main(String[] args) {
        try {
            System.out.println("请输入数字A:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String num1 = br.readLine();
            System.out.println("请选择运算符号:");
            String op = br.readLine();
            System.out.println("请输入数字B:");
            String num2 = br.readLine();

            Operation operation = OperationFactory.createOperation(op);
            operation.setNum1(Double.valueOf(num1));
            operation.setNum2(Double.valueOf(num2));
            System.out.println("运算结果:" + operation.getResult());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }
}
