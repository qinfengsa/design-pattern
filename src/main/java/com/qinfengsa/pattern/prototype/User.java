package com.qinfengsa.pattern.prototype;

import java.time.LocalDate;
import lombok.Data;
import lombok.ToString;

/**
 * @author qinfengsa
 * @date 2021/1/7 15:17
 */
@Data
@ToString
public class User implements Cloneable {

    private int id;

    private String name;

    private LocalDate birthDay;

    public User(int id, String name, LocalDate birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
