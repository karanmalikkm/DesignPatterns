package com.karanmalik.strategypattern.simuduck.behaviour;

public class FlyNoWay implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I CANNOT FLY!!!");
    }
}
