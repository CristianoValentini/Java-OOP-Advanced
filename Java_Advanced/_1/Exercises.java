package Java_Advanced._1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1:
     * <p>
     * 1. Add some numbers (1, 1, 5, 2, 1) to the set using the add() method.
     * 2. Remove '1' from  the set using the .remove(1)
     * 3. Print the set again to confirm the element was removed.
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        Set<Integer> ourSet = new HashSet<>();

        // Add some numbers using the add method
        // Your code

        ourSet.add(1) ;
        ourSet.add(2) ;
        ourSet.add(5) ;



        if (ourSet.containsAll(Set.of(1, 5, 2))) {
            System.out.println("1a. Set contains all numbers");
        } else {
            System.out.println("1a. Set does not contain all numbers");
        }

        System.out.println(ourSet + "\n");

        // Remove the element '1'
        // Your code

        ourSet.remove(1) ;

        System.out.println(ourSet);

        if (ourSet.contains(1)) {
            System.out.println("1b. The set still contains 1\n");
        } else {
            System.out.println("1b. The set does not contain 1\n");
        }
    }

    /**
     * 2:
     * <p>
     * Read the comments below and write comments on what you think our print statement will output!
     */
    private static void exercise2() {
        Set<String> fruitsSet = new HashSet<>();

        fruitsSet.add("apple");
        fruitsSet.add("banana");
        fruitsSet.add("orange");
        fruitsSet.add("kiwi");
        fruitsSet.add("mango");

        fruitsSet.addAll(fruitsSet);

        //2a. What will this output? [banana, orange, mango, kiwi, apple]
        System.out.println(fruitsSet);

        List<String> fruitsList = List.of("apple", "banana", "grapes", "pear", "mango");

        fruitsSet.addAll(fruitsList);

        //2b. What will this output? [banana, orange, kiwi, apple, pear, grapes, mango]
        System.out.println(fruitsSet);

        // da quello che ho capito l'ordine in cui gli elementi vengono stampati può variare in modo imprevedibile.
    }

    /**
     * 3: Write code to solve the following problems
     */
    private static void exercise3() {
        // 3a. Find the min and max values in the Set below
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int max = Integer.MIN_VALUE ;
        int min = Integer.MAX_VALUE ;


        for (Integer number : numbers) {
            // Your code
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        if (max != 10 || min != 1) {
            System.out.println("3a. Incorrect min or max values");
        }

        // 3b. Find which items from set a are also in set b, add these to itemsContainedInBothSets
        //     use the `contains` method and "nested" for loop
        Set<Integer> setA = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> setB = Set.of(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Set<Integer> itemsContainedInBothSets = new HashSet<>();

        // Your code

        for (Integer itemA : setA) {
            for (Integer itemB : setB) {
                if (itemA.equals(itemB)) {
                    itemsContainedInBothSets.add(itemA);
                    break;
                }
            }
        }

        if (!itemsContainedInBothSets.equals(Set.of(5, 6, 7, 8, 9, 10))) {
            System.out.println("3b. Incorrect number of items in itemsContainedInBothSets");
        } else {
            System.out.println("3b. Correct number of items in itemsContainedInBothSets");
        }
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     */
    private static void exercise4() {
        Set<Integer> orderedNumbers = new TreeSet<>();
        orderedNumbers.addAll(Set.of(5, 3, 1, 2, 4, 6, 7, 8, 9, 10));
        // 4a. Find the min value in the TreeSet with as few loops as possible,
        //     you can use `break;` to exit the loop once you've found it!
        int min = Integer.MAX_VALUE;
        // Your code

        for (Integer minore : orderedNumbers) {
            if (minore < min) {
                min = minore ;
            }
        }

        if (min != 1) {
            System.out.println("4a. Incorrect min value");
        } else {
            System.out.println("4a. Correct min value");
        }
    }
}
