package com.karanmalik.strategypattern.adventuregame.character;

import com.karanmalik.strategypattern.adventuregame.behaviour.SwordBehaviour;

public class King extends Character{
    @Override
    public void fight() {
        System.out.println("I am the KING!");
        setWeapon(new SwordBehaviour());
        performUseWeapon();
    }
}
