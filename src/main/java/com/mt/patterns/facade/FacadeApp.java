package com.mt.patterns.facade;

import lombok.extern.slf4j.Slf4j;

/*
 * Provides a unified interface to a set of interfaces in a subsystem, It's a higher level interface that
 * makes the subsystem easier to use, usually we name them with plurals like Arrays,Collections,Executors...
 * */
@Slf4j
public class FacadeApp {

    static void main() {
        log.info("########### Without Facade ###########");
        SessionBean sessionBean = new SessionBean();
        sessionBean.doSession();
        EntityBean entityBean = new EntityBean();
        entityBean.doEntity();

        log.info("########### Without Facade ###########");
        FacadeSessionImpl facadeSession = new FacadeSessionImpl(sessionBean, entityBean);
        facadeSession.doFacadeSession();
    }
}
