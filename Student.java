package com.Main;

public class Student {
    private String StudentName;
    private String Ages;
    private String ID;
    //height(身高)
    private String Height;

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getAges() {
        return Ages;
    }

    public void setAges(String ages) {
        this.Ages = ages;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        this.Height = height;
    }

    public Student(String studentName, String ages, String id, String height) {
        StudentName = studentName;
        Ages = ages;
        ID = id;
        Height = height;
    }

    @Override
    public String toString() {
        return StudentName+","+ Ages +","+ID+","+ Height;
    }

    public Student(){}

}
