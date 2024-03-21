package main.java.dev.naspo.designpatterns;

import main.java.dev.naspo.designpatterns.creationalpatterns.builder.Burger2;
import main.java.dev.naspo.designpatterns.creationalpatterns.builder.BurgerBuilder;
import main.java.dev.naspo.designpatterns.creationalpatterns.factory.Burger;
import main.java.dev.naspo.designpatterns.creationalpatterns.factory.BurgerFactory;
import main.java.dev.naspo.designpatterns.creationalpatterns.singleton.App;

// Learning fundamental programming design patterns.
public class Main {
    public static void main(String[] args) {
        /*
        There are 8 design patterns:
        Factory, Builder, Singleton, Observer, Iterator, Strategy, Adapter, Facade

        Within these, they can be divided into 3 categories:
            1. Creational patterns
            2. Behavioural patterns
            3. Structural patterns
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
        Burger2 myBurger = new BurgerBuilder()
                .setBun("Sesame")
                .setCheese("Cheddar")
                .setPatty("Beef")
                .build();

        // 3. Singleton
        // A singleton is a class that can only have one instance of it instantiated.
        App app1 = App.getAppState();
        System.out.println(app1.isLoggedIn()); // false

        App app2 = App.getAppState(); // this will return the same instance as app1
        app2.logIn();
        System.out.println(app1.isLoggedIn()); // true

        // 4. Observer (aka PubSub)
        // The observer pattern is a behavioural pattern that allows an object (the publisher) to notify
        // other objects (the subscribers) upon some action.
    }
}
