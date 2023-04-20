package com.karanmalik.strategypattern.adventuregame.character;

import com.karanmalik.strategypattern.adventuregame.behaviour.KnifeBehaviour;

public class Queen extends Character{
    @Override
    public void fight() {
        System.out.println("I am the QUEEN!");
        setWeapon(new KnifeBehaviour());
        performUseWeapon();
    }
}
