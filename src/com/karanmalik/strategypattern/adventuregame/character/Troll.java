package com.karanmalik.strategypattern.adventuregame.character;

import com.karanmalik.strategypattern.adventuregame.behaviour.AxeBehaviour;

public class Troll extends Character{
    @Override
    public void fight() {
        System.out.println("I am a troll!");
        setWeapon(new AxeBehaviour());
        performUseWeapon();
    }
}
