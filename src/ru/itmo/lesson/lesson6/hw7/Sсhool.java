package ru.itmo.lesson.lesson6.hw7;

public class Sсhool {
    private String name;
    private Director director;


    public String getName() {
        return name;
    }
    private Teacher[] teachers = new Teacher[3];
    private Student[] students = new Student[10];

    public Sсhool (String name, Director director){
        this.name = name;
        this.director = director;

    }
    public void day (){
        director.start();
        for (Teacher x: teachers){
            for (Student y: students){
                if (y != null && x != null){
                    x.navik(y);
                }
            }
        }
        director.end();
    }
    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] == null) {
                teachers[i] = teacher;
                break;
            }
        }
    }

    public void addStudents(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
}