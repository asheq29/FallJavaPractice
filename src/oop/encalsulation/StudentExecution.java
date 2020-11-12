package oop.encalsulation;

import oop.encalsulation.Student;

public class StudentExecution {

    public static void main(String[] args) {
        Student student = new Student();
        student.setIdOfStudent(01);
        student.setNameOfStudent("Alizeh");
        System.out.println(student.getNameOfStudent());
        System.out.println(student.getIdOfStudent());
        Student izraan = new Student();
        izraan.setNameOfStudent("Izraan");
        izraan.setIdOfStudent(02);
        System.out.println(izraan.getIdOfStudent());
        System.out.println(izraan.getNameOfStudent());
    }
}
