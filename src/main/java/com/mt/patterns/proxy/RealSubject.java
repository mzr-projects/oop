package com.mt.patterns.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealSubject implements Subject {

    public RealSubject() {
        log.info("RealSubject created");
    }

    @Override
    public void performAction(String docId) {
        log.info("performAction in real Subject, docId: {}", docId);
    }
}