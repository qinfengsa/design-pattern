package com.qinfengsa.pattern.memento;

/**
 * 备忘录模式
 *
 * <p>在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态
 *
 * @author qinfengsa
 * @date 2021/1/11 14:37
 */
public class MementoMain {

    public static void main(String[] args) {
        GameRole player = new GameRole();
        player.initState();
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleState(player.saveState());
        player.displayState();

        player.fight();
        caretaker.setRoleState(player.saveState());
        player.fight();
        player.displayState();

        player.recoveryState(caretaker.getRoleState());
        player.displayState();
    }
}
