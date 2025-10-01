package org.chdtu;

public class PZ2204 implements Group {
    Student student;
    public PZ2204(){}
    @Override
    public void getName(){
        System.out.println("PZ2204");
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public void getStudentName(){
        this.student.getName();
    }
}
