package com.mt.patterns.behavioral.command;

/*
 * Creates Request objects and delivers all the information to other object to do something(command it)
 * The client creates the order(command object) pass it to the waiter(invoker) and then pass to the cook(receiver)
 * */
public class CommandApp {
    static void main() {
        /*
        * Create the receiver
        * */
        Cook cook = new Cook();

        /*
        * Create concrete commands
        * */
        Order orderSteak = new OrderSteak(cook);
        Order orderSalad = new OrderSalad(cook);

        /*
        * Create invoker
        * */
        Waiter waiter1 = new Waiter(orderSteak);
        /*
        * Order via invoker
        * */
        waiter1.submitOrder();
        /*
         * Create invoker
         * */
        Waiter waiter2 = new Waiter(orderSalad);
        /*
         * Order via invoker
         * */
        waiter2.submitOrder();
    }
}
