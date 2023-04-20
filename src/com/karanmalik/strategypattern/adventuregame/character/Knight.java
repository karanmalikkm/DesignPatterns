package com.karanmalik.strategypattern.adventuregame.character;

import com.karanmalik.strategypattern.adventuregame.behaviour.BowAndArrowBehaviour;

public class Knight extends Character{
    @Override
    public void fight() {
        System.out.println("I am a Knight!");
        setWeapon(new BowAndArrowBehaviour());
        performUseWeapon();
    }
}
