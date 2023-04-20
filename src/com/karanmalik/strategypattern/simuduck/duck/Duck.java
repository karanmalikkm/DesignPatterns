package com.karanmalik.strategypattern.simuduck.duck;

import com.karanmalik.strategypattern.simuduck.behaviour.FlyBehaviour;
import com.karanmalik.strategypattern.simuduck.behaviour.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public Duck() {
        //Empty constructor for now
        System.out.println("\nCreating a new duck object....");
    }

    public void swim(){
        //Common method for all future classes as all ducks swim
        System.out.println("I am swimming!!!");
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    //concrete classes should tell how the duck will display
    public abstract void display();
}
