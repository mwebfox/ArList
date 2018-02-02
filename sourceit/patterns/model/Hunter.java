package com.sourceit.patterns.model;

import com.sourceit.patterns.behavior.ICharacterBehavior;

public class Hunter  extends Character{
    public Hunter(ICharacterBehavior attackBehavior) {
        super(attackBehavior);
    }

    @Override
    public void display() {
        System.out.println("Hunter has appeared");
    }
}
