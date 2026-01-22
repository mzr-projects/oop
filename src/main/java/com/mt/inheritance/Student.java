package com.mt.inheritance;

import com.mt.common.StudentLog;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Student implements StudentLog {

    private int id;
    private String name;
    private int age;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void saySomething(String message) {
        log.info(message);
    }
}
