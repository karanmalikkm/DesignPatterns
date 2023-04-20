package com.karanmalik.strategypattern.adventuregame.character;

import com.karanmalik.strategypattern.adventuregame.behaviour.WeaponBehaviour;

public abstract class Character {
    WeaponBehaviour weapon;

    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }

    public Character() {
        System.out.println("Spawning a new Character!");
    }

    public abstract void fight();

    public void performUseWeapon(){
        weapon.useWeapon();
    }
}
