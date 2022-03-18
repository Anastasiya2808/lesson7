package ru.itmo.lesson.lesson6.lesson7.base;

// package ru.itmo.lesson.lesson6.lesson7.base.Unit - имя класса
// родительский класс всех персонажей
// нельзя создать экземпляр
// может создать абстрактные методы
abstract public class Unit {
    // доступ к свойству из текущего класса + дочернего классов
    protected int healthScore;
    private int maxHealthScore;
    public Unit (int healthScore){
        if (healthScore <1){
            throw new IllegalArgumentException( "Здоровье дб положительным");
        }
        this.healthScore = healthScore;
        maxHealthScore = healthScore;
    }

    //геттер
    public int getHealthScore() {
        return healthScore;
    }

    // добавить здоровье, но не больше изначального
    public void plusHealth (int healthScore){
        if ( !isAlive()) return;
        this.healthScore = Math.min(this.healthScore + healthScore,maxHealthScore);
    }
    // уменьшить здоровье healthScore, если персонаж жив
    public void minusHealth (int healthScore){
        if ( !isAlive()) return;
            this.healthScore -= healthScore;
    }
    //метод вернет true, если здоровье больше 0
    // false, если нет
    public boolean isAlive(){
        return healthScore > 0; // вернет
    }
}
