package com.mt.patterns.behavioral.template;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/*
* Template define the skeleton of an algorithm
* */
@Slf4j
public class TemplateApp {

    static void main() {
        List<Worker> workers = new ArrayList<>();
        Worker pw1 = new Programmer();
        workers.add(pw1);
        Worker pw2 = new ProductOwner();
        workers.add(pw2);
        Worker pw3 = new ProjectManager();
        workers.add(pw3);

        for (Worker worker : workers) {
            log.info("Daily routine for {}", worker.toString());
            worker.dailyRoutine();
            log.info("##############");
        }
    }
}
