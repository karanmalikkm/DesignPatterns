package com.karanmalik.strategypattern.simuduck.duck;

import com.karanmalik.strategypattern.simuduck.behaviour.FlyWithWings;
import com.karanmalik.strategypattern.simuduck.behaviour.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Mallard Duck!");
    }
}
