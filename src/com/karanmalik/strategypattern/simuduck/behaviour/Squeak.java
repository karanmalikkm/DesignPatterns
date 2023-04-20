package com.karanmalik.strategypattern.simuduck.behaviour;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak Squeak Squeak");
    }
}
