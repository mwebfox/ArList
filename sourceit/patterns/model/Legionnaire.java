package com.sourceit.patterns.model;

import com.sourceit.patterns.behavior.ICharacterBehavior;

public class Legionnaire extends Character{

    public Legionnaire(ICharacterBehavior attackBehavior) {
        super(attackBehavior);
    }
    @Override
    public void display() {
        System.out.println("Legionnaire has appeared");
    }
}
