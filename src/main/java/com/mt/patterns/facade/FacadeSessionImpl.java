package com.mt.patterns.facade;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class FacadeSessionImpl implements FacadeSession {

    /*
     * We use service in this layer and hide the complexity of these service behind this facade class
     * */
    private final SessionBean sessionBean;
    private final EntityBean entityBean;

    public void doFacadeSession() {
        log.info("doFacadeSession...");
        doSession();
        doEntity();
    }

    @Override
    public void doSession() {
        sessionBean.doSession();
    }

    @Override
    public void doEntity() {
        entityBean.doEntity();
    }
}

