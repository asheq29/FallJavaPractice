package oop.encalsulation;

 public class Student {
    private String nameOfStudent;
    private int idOfStudent;
    private String ssn;
    private String location;
    private String gender;

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setIdOfStudent(int idOfStudent) {
        this.idOfStudent = idOfStudent;
    }

    public int getIdOfStudent() {
        return idOfStudent;
    }
}
