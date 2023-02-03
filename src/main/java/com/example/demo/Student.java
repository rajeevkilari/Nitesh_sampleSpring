package com.example.demo;

import java.util.ArrayList;

public class Student {

    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }


    public static ArrayList<Student> dataInfoStudents() {
        ArrayList<Student> students = new ArrayList<Student>();
        Student stude = new Student("Nitesh", "1");
        Student stud = new Student("Kumar", "2");
        students.add(stude);
        students.add(stud);
        return students;
    }

    //Java 8 -> ForEach Loop
    public static void main(String[] args) {
        //Fastest
        for (int i = 0; i < dataInfoStudents().size(); i++) {
            System.out.println(dataInfoStudents().get(i).name);
            System.out.println(dataInfoStudents().get(i).rollNo);
        }
        //More Readable
        for (Student arrayList : dataInfoStudents()) {
            System.out.println(arrayList.name);
            System.out.println(arrayList.rollNo);
        }
        dataInfoStudents().forEach(list->{
            System.out.println(list.name);
            System.out.println(list.rollNo);
        });
    }
}
