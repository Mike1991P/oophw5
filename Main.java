package org.example;

import org.example.controller.Controller;
import org.example.model.Student;
import org.example.model.StudentGroup;
import org.example.model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller =  new Controller();

        Student student1_group1 = controller.createStudent(new Student("Григорий", "Светлаков", 16, 1));
        Student student2_group1 = controller.createStudent(new Student("Светлана", "Григорьева", 12, 2));
        Student student3_group1 = controller.createStudent(new Student("Семен", "Слепаков", 14, 3));

 
        Teacher teacher_group1 = controller.createTeacher(new Teacher("Светлана", "Борисова", 19, 1));


        StudentGroup group1 = controller.createGroup(1, teacher_group1, student1_group1, student2_group1, student3_group1);


        Student student1_group2 = controller.createStudent(new Student("Лилия", "Пантюкова", 16, 4));
        Student student2_group2 = controller.createStudent(new Student("Арман", "Балян", 17, 5));
        Student student3_group2 = controller.createStudent(new Student("Андрей", "Степашов", 15, 6));


        Teacher teacher_group2 = controller.createTeacher(new Teacher("Степан", "Сарычев", 40, 2));


        StudentGroup group2 = controller.createGroup(2, teacher_group2, student1_group2, student2_group2, student3_group2);


        System.out.println(group1.toString());
        System.out.println(group2.toString());

    }
}