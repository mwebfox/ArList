package com.sourceit.patterns.model;

import com.sourceit.patterns.behavior.ICharacterBehavior;

public abstract class Character {
    ICharacterBehavior attackBehavior;

    public Character(ICharacterBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public void resolveAttack() {
        attackBehavior.attack();
    }

    public abstract void display();
}
