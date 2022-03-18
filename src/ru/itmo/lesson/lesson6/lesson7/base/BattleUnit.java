package ru.itmo.lesson.lesson6.lesson7.base;

// BattleUnit наследуется от Unit (родительский)
// Unit - родительский класс
// BattleUnit - дочерний класс
// при наследовании наследуется методы и свойства родительского класса, конструктор НЕ наследуется
abstract public class BattleUnit extends Unit {
        protected int attackScore;
        public BattleUnit (int healthScore, int attackScore){
            super(healthScore); // вызов конструктора родителя
            if (attackScore < 1){
                throw new IllegalArgumentException("Атака дб положительной");
            }
            this.attackScore = attackScore;
        }

    public int getAttackScore() {
        return attackScore;
    }
    public void batteleUnitVoid (){
        System.out.println("Mетод BatteleUnitVoid");
    }
}
