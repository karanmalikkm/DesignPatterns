package com.karanmalik.strategypattern.simuduck.behaviour;

public class FlyRocketPowered implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Ignition in Rocket 3..2..1..GO......");
    }
}
