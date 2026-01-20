package com.mt.inheritance;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class UndergraduateStudent extends Student {

    public UndergraduateStudent(int id, String name) {
        super(id, name);
    }

    @Override
    public void saySomething(String message) {
        log.info("In UndergraduateStudent");
        super.saySomething(message);
    }
}
