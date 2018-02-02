package com.sourceit.patterns;

import com.sourceit.patterns.behavior.BowAttack;
import com.sourceit.patterns.behavior.ICharacterBehavior;
import com.sourceit.patterns.behavior.SpearAttack;
import com.sourceit.patterns.behavior.SwordAttack;
import com.sourceit.patterns.model.Character;
import com.sourceit.patterns.model.Knight;

public class PatternStrategy {

    public static void main(String[] args) {

        Character soldier = new Knight( new SwordAttack());
        Character hunter = new Knight( new BowAttack());
        Character legionare = new Knight( new SpearAttack());

        soldier.display();
        hunter.display();
        legionare.display();

        soldier.resolveAttack();
        hunter.resolveAttack();
        legionare.resolveAttack();

    }
}
