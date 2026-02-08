package com.mt.patterns.creational.builder;

import lombok.extern.slf4j.Slf4j;

/*
 * Encapsulates the steps of creating an object or product
 * */
@Slf4j
public class BuilderApp {

    static void main() {
        BankAccount builderAccount = new BankAccount.BuilderAccount(123456)
                .balance(10.0)
                .owner("ME")
                .build();
        log.info("Bank Account {}", builderAccount);
    }
}
