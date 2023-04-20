package com.karanmalik.strategypattern.adventuregame;

import com.karanmalik.strategypattern.adventuregame.character.*;
import com.karanmalik.strategypattern.adventuregame.character.Character;

public class AdventureGameSimulator {
    public static void startAdventureGameSimulator(){
        Character char1 = new King();
        char1.fight();
        Character char2 = new Queen();
        char2.fight();
        Character char3 = new Knight();
        char3.fight();
        Character char4 = new Troll();
        char4.fight();
    }
}
