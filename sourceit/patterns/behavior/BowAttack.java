package com.sourceit.patterns.behavior;

public class BowAttack implements ICharacterBehavior {

    @Override
    public void attack() {
        System.out.println("Character performing attack with the bow");
    }
}
