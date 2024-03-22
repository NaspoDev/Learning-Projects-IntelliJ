# Design Patterns

Learning essential design patterns of programming.\
Following [this](https://www.youtube.com/watch?v=tAuRQs_d9F8&ab_channel=NeetCode) video.

---

### There are 8 design patterns:
#### Factory, Builder, Singleton, Observer, Iterator, Strategy, Adapter, Facade

Within these, they can be divided into **3 categories**:
1. Creational patterns
2. Behavioural patterns
3. Structural patterns

---

## Creational Patterns

### Factory
The factory pattern is a creational pattern that uses a factory class to create objects.

Example:\
You have a `BurgerFactory` class which creates different types of burgers (`Burger` class).\
You can run things like `burgerFactory.createCheeseBurger()` which will create and return a 
Burger object with the necessary ingredients for a cheeseburger.

### Builder
The builder pattern is a creational pattern that allows the construction of an object step by step.

Example:\
The `BurgerBuilder` class has methods like `addCheese()`, `addTomato()`, `addLettuce()` etc.\
We don't have to pass in all the ingredients at once.
Then you can call `burgerBuilder.build()` to return a `Burger` object with the ingredients you added.

### Singleton
A singleton is a class that can only have one instance of it instantiated.

Example:\
You want to maintain global Application state. The App class should only be instantiated once.

## Behavioural Patterns

### Observer (aka PubSub)
The observer pattern is a behavioural pattern that allows the subject (aka the publisher) to notify
other observers (aka the subscribers) upon some action.

Example:\
A YouTube channel has many subscribers. When the channel uploads a new video, all the subscribers
are notified.

### Iterator
A behavioural pattern that defines how the values in an object can be iterated through.

Example:\
Iterating through a binary tree or a linked list.

### Strategy