package com.qinfengsa.pattern.memento;

import lombok.extern.slf4j.Slf4j;

/**
 * @author qinfengsa
 * @date 2021/1/11 14:49
 */
@Slf4j
public class GameRole {

    // 生命力
    private int vitality;

    // 攻击
    private int attack;

    // 防御
    private int defense;

    /**
     * 保存角色状态
     *
     * @return
     */
    public RoleState saveState() {

        return new RoleState(vitality, attack, defense);
    }

    /**
     * 恢复角色状态
     *
     * @param state
     */
    public void recoveryState(RoleState state) {
        this.vitality = state.getVitality();
        this.attack = state.getAttack();
        this.defense = state.getDefense();
    }

    /** 初始化 */
    public void initState() {
        this.vitality = 100;
        this.attack = 100;
        this.defense = 100;
    }

    /** 状态展示 */
    public void displayState() {
        log.debug("生命: {}; 攻击: {}; 防御: {}", this.vitality, this.attack, this.defense);
    }

    public void fight() {
        this.vitality -= 40;
        this.attack -= 10;
        this.defense -= 20;
    }
}
