package com.karanmalik.strategypattern.adventuregame.behaviour;

public class BowAndArrowBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Fighting with BowAndArrow!");
    }
}
