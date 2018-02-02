package com.sourceit.patterns;

import com.sourceit.patterns.behavior.BowAttack;
import com.sourceit.patterns.behavior.ICharacterBehavior;
import com.sourceit.patterns.behavior.SpearAttack;
import com.sourceit.patterns.behavior.SwordAttack;
import com.sourceit.patterns.model.Character;
import com.sourceit.patterns.model.Hunter;
import com.sourceit.patterns.model.Knight;
import com.sourceit.patterns.model.Legionnaire;

public class PatternStrategy {

    public static void main(String[] args) {

        Character soldier = new Knight( new SwordAttack());
        Character hunter = new Hunter( new BowAttack());
        Character legionnaire = new Legionnaire( new SpearAttack());

        soldier.display();
        hunter.display();
        legionnaire.display();

        soldier.resolveAttack();
        hunter.resolveAttack();
        legionnaire.resolveAttack();

    }
}
