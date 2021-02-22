package com.qinfengsa.pattern.iterator;

import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;

/**
 * 迭代器模式 提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示
 *
 * @author qinfengsa
 * @date 2021/1/14 9:59
 */
@Slf4j
public class IteratorMain {

    public static void main(String[] args) {
        NameRepository nameRepository =
                new NameRepository(new String[] {"Robert", "John", "Julie", "Lora"});
        for (Iterator<String> iterator = nameRepository.getIterator(); iterator.hasNext(); ) {
            log.debug("name:{}", iterator.next());
        }
    }
}
