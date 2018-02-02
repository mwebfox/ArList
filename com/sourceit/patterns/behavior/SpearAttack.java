package com.sourceit.patterns.behavior;

public class SpearAttack implements ICharacterBehavior {

    @Override
    public void attack() {
        System.out.println("Knight performing attack with the spear");
    }
}
