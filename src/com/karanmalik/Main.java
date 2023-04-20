package com.karanmalik;

import com.karanmalik.observerpattern.WeatherStation;
import com.karanmalik.strategypattern.adventuregame.AdventureGameSimulator;
import com.karanmalik.strategypattern.simuduck.DuckSimulator;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        do {
//            clearConsole();
            System.out.println("1. Strategy Pattern");
            System.out.println("2. Observer Pattern");
            System.out.println("3. Adapter Pattern");
            System.out.println("0. Exit");
            System.out.print("Enter your input: ");
            if(scanner.hasNextInt()) {
                input = scanner.nextInt();
                switch (input) {
                    case 1 -> executeStrategyPattern();
                    case 2 -> executeObserverPattern();
                    case 3 -> executeAdapterPattern();
                    case 0 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid input!");
                }
            } else {
                String invalidInput = scanner.next();
                System.out.println("Invalid Input: "+invalidInput);
            }
            scanner.nextLine();
            System.out.println("Press any key to continue");
            scanner.nextLine();
        } while (input != 0);
    }

    private static void executeAdapterPattern() {
        System.out.println("Still in development");
    }

    private static void executeObserverPattern() {
        WeatherStation.showWeatherData();
    }

    private static void executeStrategyPattern() {
        System.out.println("Starting the duck simulator game:\n");
        DuckSimulator.startDuckSimulator();
        System.out.println("\nStarting the adventure game:\n");
        AdventureGameSimulator.startAdventureGameSimulator();
    }

//    private static void clearConsole() {
//        try {
//            if (System.getProperty("os.name").contains("Windows")) {
//                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//            } else {
//                new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
//            }
//        } catch (IOException | InterruptedException e) {
//            // Ignore exceptions
//        }
//    }

}
