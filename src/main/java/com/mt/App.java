package com.mt;

import com.mt.student.MasterStudent;
import com.mt.student.PhdStudent;
import com.mt.student.Student;
import com.mt.student.UndergraduateStudent;

import java.util.ArrayList;
import java.util.List;

public class App {
    static void main() {
        List<Student> students = new ArrayList<>();
        students.add(new MasterStudent(1, "Jane"));
        students.add(new UndergraduateStudent(2, "James"));
        students.add(new PhdStudent(3, "Jason"));

        for (Student student : students) {
            student.saySomething("This is a random student");
        }
    }
}
