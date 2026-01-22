package com.mt.inheritance;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MasterStudent extends Student {

    public MasterStudent(int id, String name) {
        super(id, name);
    }

    @Override
    public void saySomething(String message) {
        log.info("In MasterStudent");
        //super.saySomething(message);
    }
}
