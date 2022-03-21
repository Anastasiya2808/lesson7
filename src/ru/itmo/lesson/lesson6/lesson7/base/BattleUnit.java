package ru.itmo.lesson.lesson6.lesson7.base;

// BattleUnit наследуется от Unit (родительский)
// Unit - родительский класс
// BattleUnit - дочерний класс
// при наследовании наследуется методы и свойства родительского класса, конструктор НЕ наследуется

import ru.itmo.lesson.lesson6.lesson7.Infantry;
import ru.itmo.lesson.lesson6.lesson7.Knight;

abstract public class BattleUnit extends Unit implements AttackAble {
        protected int attackScore;
        public BattleUnit (int healthScore, int attackScore){
            super(healthScore); // вызов конструктора родителя
            if (attackScore < 1){
                throw new IllegalArgumentException("Атака дб положительной");
            }
            this.attackScore = attackScore;
        }


        public final void battleUnitVoid (){
            System.out.println("Mетод BatteleUnitVoid");
        }

    public int getAttackScore() {
        return attackScore;
    }

    public void batteleUnitVoid (){
        System.out.println("Mетод BatteleUnitVoid");
    }
    public boolean runFromField (){
            if (!isAlive()){
                System.out.println("Юнит не может бежать");
            }
            healthScore -= 1;
            if (!isAlive()){
                //healthScore -= 1; можно так записать, но не будет проверок // при бегстве юнит теряет 1 ед здоровья
                System.out.println("Юнит не смог сбежать с поля боя");
                return false;
            }
            return true;
    }
    // метод генерации боевых юнитов
    // фабричные методы
    public static BattleUnit getBattleUnit (){
            String[] types = {"knight", "infantry"};
            BattleUnit unit = null;
            switch (types[(int) (Math.random()*types.length)]){
                case "knight":
                unit = new Knight(30,18);
                break;
                case "infantry":
                    unit = new Infantry(35,20);
                    break;
            }
            return unit;
    }

    public static BattleUnit[] getBattleUnit (int count){
            BattleUnit[] units = new BattleUnit[count];
            for (int i = 0; i < units.length; i++){
                // в статических методах можно обратиться
                // только к статическим методам или свойствам
                units[i] = getBattleUnit();
            }
            return units;
    }
}
