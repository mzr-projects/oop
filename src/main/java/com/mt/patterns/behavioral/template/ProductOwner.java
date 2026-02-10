package com.mt.patterns.behavioral.template;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class ProductOwner extends Worker {

    @Override
    public void work() {
        log.info("ProductOwner work");
    }

    @Override
    public void commute() {
        log.info("ProductOwner commute");
    }
}
