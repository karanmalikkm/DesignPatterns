package com.karanmalik.strategypattern.simuduck.duck;

import com.karanmalik.strategypattern.simuduck.behaviour.FlyNoWay;
import com.karanmalik.strategypattern.simuduck.behaviour.MuteQuack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }
}
