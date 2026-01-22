package com.mt.inheritance;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PhdStudent extends Student {

    public PhdStudent(int id, String name) {
        super(id, name);
    }

    @Override
    public void saySomething(String message) {
        logInfo("In PhdStudent");
        //super.saySomething(message);
    }
}
