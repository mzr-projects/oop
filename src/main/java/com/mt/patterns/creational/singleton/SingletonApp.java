package com.mt.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonApp {

    static void main() {
        Table instance1 = SingletonV1.getInstance();
        Table instance2 = SingletonV1.getInstance();

        SingletonV4 singletonV4 = SingletonV4.INSTANCE;
        singletonV4.bounce();
        singletonV4.setColor("Red");
        singletonV4.bounce();

        ObjectPool<Talker> objectPool = new ObjectPool<>(2);
        objectPool.add(new Talker("2"));
        objectPool.add(new Talker("1"));


        Talker talker1 = objectPool.get();
        talker1.talk();
        Talker talker2 = objectPool.get();
        talker2.talk();
    }
}
