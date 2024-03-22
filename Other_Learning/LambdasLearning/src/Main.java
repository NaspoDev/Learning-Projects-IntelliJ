// Lambdas Learning

import java.util.ArrayList;

// Lambdas are methods that can be defined and used as a variable/object.
// Similar to arrow functions in javascript.
public class Main {
    public static void main(String[] args) {
        // Example 1
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.forEach((n) -> System.out.println(n));

        // Example 2
        StringFunction exclaim = (s) -> System.out.println(s + "!");
        exclaim.run("Hello World");
    }
}