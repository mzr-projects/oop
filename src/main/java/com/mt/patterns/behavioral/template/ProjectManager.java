package com.mt.patterns.behavioral.template;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ToString
public class ProjectManager extends Worker {

    @Override
    public void work() {
        log.info("ProjectManager sleep");
    }

    @Override
    public void relax() {
        log.info("ProjectManager relax");
    }
}
