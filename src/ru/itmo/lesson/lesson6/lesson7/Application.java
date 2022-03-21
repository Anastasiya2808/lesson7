package ru.itmo.lesson.lesson6.lesson7;

import ru.itmo.lesson.lesson6.lesson7.base.BattleUnit;
import ru.itmo.lesson.lesson6.lesson7.base.Unit;

// public class King extends Unit
// public class Infantry extends BattleUnit (ext Unit)
// public class Knight extends BattleUnit
public class Application {
    public static void main(String[] args) {
        Knight knight1 = new Knight(20,17);
        knight1.knightUnitVoid();
        knight1.runFromField();

        BattleUnit knight2 = new Knight(20,17);
        knight2.batteleUnitVoid();

        Unit knight3 = new Knight(20,17);
        knight3.plusHealth(4);

        Infantry infantry1 = new Infantry(18,15);
        infantry1.runFromField();

        King king1 = new King(100);
        King king2 = new King(100);

        king1.generateArmy();
        king2.generateArmy();

        king1.startBattle(king2);

        System.out.println("king1 " + king1.getBattleUnitsCount());
        System.out.println("king2 " + king2.getBattleUnitsCount());

        // для обращениям к статическим методам создавать объект не нужно
    }
}
