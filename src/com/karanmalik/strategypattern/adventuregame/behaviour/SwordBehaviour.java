package com.karanmalik.strategypattern.adventuregame.behaviour;

public class SwordBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Fighting with a sword!");
    }
}
