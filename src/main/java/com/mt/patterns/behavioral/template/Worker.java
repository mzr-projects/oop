package com.mt.patterns.behavioral.template;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Worker {

    @Getter
    @Setter
    private static int workerCount = 0;

    public Worker() {
        workerCount++;
    }

    /*
     * Every worker should work
     * */
    protected abstract void work();

    /*
     * We want all the workers hold the same schedule
     * */
    public final void awaken() {
        log.info("Awaken at 7 AM");
    }

    protected void commute() {

    }

    protected void relax() {
        log.info("Relaxing after work");
    }

    /*
     * We want all the workers hold the same schedule
     * */
    public final void sleep() {
        log.info("Sleep at 11 PM");
    }

    /*
     * Template method that we want all the workers to do
     * */
    public final void dailyRoutine() {
        awaken();
        commute();
        work();
        relax();
        sleep();
    }
}
