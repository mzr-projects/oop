package com.mt.patterns.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy() {
        log.info("Proxy created");
    }

    @Override
    public void performAction(String docId) {
        if (docId.equalsIgnoreCase("ADMIN")) {
            log.info("performAction in proxy, docId:{}", docId);

            /*
             * Here we create the real object through this proxy, client cannot access the real object except
             * through this proxy class
             * */
            if (realSubject == null) {
                realSubject = new RealSubject();
            }
            realSubject.performAction(docId);
        } else {
            log.error("Just admin user can access to this docId:{}", docId);
        }
    }
}
