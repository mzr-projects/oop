package com.mt.patterns.creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
public class BankAccount {

    private long accountNumber;
    private double balance;
    private String owner;

    @Slf4j
    public static class BuilderAccount {
        private final long accountNumber;

        private double balance;
        private String owner;

        /*
         * Make the accountNumber a required field to create the account
         * */
        public BuilderAccount(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public BuilderAccount balance(double balance) {
            this.balance = balance;
            return this;
        }

        public BuilderAccount owner(String owner) {
            this.owner = owner;
            return this;
        }

        public BankAccount build() {
            BankAccount bankAccount = new BankAccount();
            bankAccount.accountNumber = accountNumber;
            bankAccount.balance = balance;
            bankAccount.owner = owner;
            return bankAccount;
        }
    }

    /*
     * We make creation of BankAccount only through the Builder
     * */
    private BankAccount() {

    }

    public String toString() {
        return "BankAccount " + getAccountNumber() + " created.";
    }
}
