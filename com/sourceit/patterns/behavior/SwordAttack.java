package com.sourceit.patterns.behavior;

public class SwordAttack implements ICharacterBehavior {

    @Override
    public void attack() {
        System.out.println("Knight performing attack with the sword");
    }
}
