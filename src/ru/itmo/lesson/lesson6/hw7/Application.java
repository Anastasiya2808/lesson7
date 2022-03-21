package ru.itmo.lesson.lesson6.hw7;

public class Application {
    public static void main(String[] args) {
        Director director = new Director("Сергей");
        Sсhool sсhool = new Sсhool(87,director);

        Teacher teacher1 = new Teacher("Ольга Ивановна","георгафия", 10);
        Teacher teacher2 = new Teacher("Елена Дмитриевна","история", 20);

        Student student1 = new Student("Иван", "георгафия");
        Student student2 = new Student("Роман", "биология");

        sсhool.addTeacher(teacher1);
        sсhool.addTeacher(teacher2);

        sсhool.addStudents(student1);
        sсhool.addStudents(student2);

        sсhool.day();
    }
}
