package main.java.dev.naspo.designpatterns;

import main.java.dev.naspo.designpatterns.factory.Burger;
import main.java.dev.naspo.designpatterns.factory.BurgerFactory;

// Learning fundamental programming design patterns.
public class Main {
    public static void main(String[] args) {
        /*
        There are 8 design patterns:
        Factory, Builder, Singleton, Observer, Iterator, Strategy, Adapter, Facade

        Within these, they can be divided into 3 categories:
            1. Creational patterns
            2. Structural patterns
            3. Behavioural patterns
         */

        System.out.println("Learning Design Patterns");

        // 1. Factory
        // The factory pattern is a creational pattern that uses a factory class to create objects.
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger cheeseBurger = burgerFactory.createCheeseBurger();
        Burger veggieBurger = burgerFactory.createVeggieBurger();
        Burger deluxeBurger = burgerFactory.createDeluxeBurger();

        // 2. Builder
        // The builder pattern is a creational pattern that allows the construction of an object step by step.
        // We don't have to pass in all the ingredients at once.
    }
}