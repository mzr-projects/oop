package com.mt.patterns.creational.factory.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeltSurface implements Surface {

    @Override
    public void description() {
        log.info("FeltSurface description");
    }
}
