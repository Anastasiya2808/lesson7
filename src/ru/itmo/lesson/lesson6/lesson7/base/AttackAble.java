package ru.itmo.lesson.lesson6.lesson7.base;

public interface AttackAble {
    // экземпляры интерфейса создать нельзя
    // интерфейсы содержат методы без реализации
   /* public */ void attack(BattleUnit emeny); // public можно не писать
    // метод с реализацией должен быть определен, как default
    default void someVoid(){
        System.out.println("Метод с реализацией");
    }
}
