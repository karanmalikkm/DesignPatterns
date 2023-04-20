package com.karanmalik.strategypattern.adventuregame.behaviour;

public class AxeBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Fighting with an Axe!");
    }
}
