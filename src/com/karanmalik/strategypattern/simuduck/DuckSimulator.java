package com.karanmalik.strategypattern.simuduck;

import com.karanmalik.strategypattern.simuduck.behaviour.FlyRocketPowered;
import com.karanmalik.strategypattern.simuduck.behaviour.Squeak;
import com.karanmalik.strategypattern.simuduck.duck.Duck;
import com.karanmalik.strategypattern.simuduck.duck.MallardDuck;
import com.karanmalik.strategypattern.simuduck.duck.ModelDuck;

import java.util.Scanner;

public class DuckSimulator {
    public static void startDuckSimulator(){
        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.performFly();
        duck1.performQuack();
        Duck duck2 = new ModelDuck();
        duck2.display();
        duck2.performQuack();
        duck2.performFly();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to change the duck strategy on runtime? (Y/N): ");
        String input = scanner.nextLine().toLowerCase();
        if (input.equals("y")) {
            duck2.setFlyBehaviour(new FlyRocketPowered());
            duck2.setQuackBehaviour(new Squeak());
        } else if (!input.equals("n")) {
            System.out.println("Invalid input: " + input);
        }
        duck2.display();
        duck2.performQuack();
        duck2.performFly();
    }
}
