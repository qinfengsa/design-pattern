package com.qinfengsa.pattern.memento;

import lombok.Getter;

/**
 * @author qinfengsa
 * @date 2021/1/13 16:54
 */
@Getter
public class RoleState {

    // 生命力
    private int vitality;

    // 攻击
    private int attack;

    // 防御
    private int defense;

    public RoleState(int vit, int atk, int def) {
        this.vitality = vit;
        this.attack = atk;
        this.defense = def;
    }
}
