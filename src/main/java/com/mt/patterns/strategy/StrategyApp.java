package com.mt.patterns.strategy;

import com.mt.patterns.strategy.fly.WingFlier;
import com.mt.patterns.strategy.models.*;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class StrategyApp {

    static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        Duck duck = new BlackDuck();

        ducks.add(new MallardDuck());
        ducks.add(new RubberDuck());
        ducks.add(new WoodenDuck());
        useDucks(ducks);

        log.info("########### Setting WingFlier Strategy(Here we define the strategy of flying)###########");
        duck.setFlightBehavior(new WingFlier());
        ducks.add(duck);

        useDucks(ducks);
    }

    private static void useDucks(List<Duck> ducks) {
        for (Duck duck : ducks) {
            duck.doFly();
            duck.doNoise();
            duck.render();
        }
    }
}
