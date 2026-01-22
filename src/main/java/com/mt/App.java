package com.mt;

import com.mt.inheritance.MasterStudent;
import com.mt.inheritance.PhdStudent;
import com.mt.inheritance.Student;
import com.mt.inheritance.UndergraduateStudent;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main() {
        List<Student> students = new ArrayList<>();
        students.add(new MasterStudent(1, "Jane"));
        students.add(new UndergraduateStudent(2, "James"));
        students.add(new PhdStudent(3, "Jason"));

        for (Student student : students) {
            /*
             * Java is going to start from the lowest level of saySomething e.g if there is saySomething method in
             * MasterStudent then will run it if not it goes level by level up to the parent class which here is
             * Student.
             * */
            student.saySomething("This is a random student");
        }
    }
}
