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

        BattleUnit knight2 = new Knight(20,17);
        knight2.batteleUnitVoid();

        Unit knight3 = new Knight(20,17);
        knight3.plusHealth(4);
    }
}
