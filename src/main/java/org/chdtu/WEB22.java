package org.chdtu;

public class WEB22 implements Group {
    Student student;
    public WEB22(){

    }
    @Override
    public void getName(){
        System.out.println("WEB22");
    }

    public void setStudent(Student student){
        this.student = student;
    }

    public void getStudentName(){
        this.student.getName();
    }
}
