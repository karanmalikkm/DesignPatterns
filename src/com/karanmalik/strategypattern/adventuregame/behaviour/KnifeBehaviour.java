package com.karanmalik.strategypattern.adventuregame.behaviour;

public class KnifeBehaviour implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("Fighting with Knife!!");
    }
}
