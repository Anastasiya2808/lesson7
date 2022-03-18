package ru.itmo.lesson.lesson6.lesson7;
// Король
  // здоровье
  // золото
  // армия боевых юнитов

import ru.itmo.lesson.lesson6.lesson7.base.BattleUnit;
import ru.itmo.lesson.lesson6.lesson7.base.Unit;

public class King extends Unit {
    private int gold = 500;
    private BattleUnit[] army;

    public King (int healthScore){
        super(healthScore);
    }

}
