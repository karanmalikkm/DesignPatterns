package com.karanmalik.strategypattern.simuduck.behaviour;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Quack Quack Quack");
    }
}
