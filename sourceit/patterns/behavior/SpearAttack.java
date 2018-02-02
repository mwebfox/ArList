package com.sourceit.patterns.behavior;

public class SpearAttack implements ICharacterBehavior {

    @Override
    public void attack() {
        System.out.println("Character performing attack with the spear");
    }

}
