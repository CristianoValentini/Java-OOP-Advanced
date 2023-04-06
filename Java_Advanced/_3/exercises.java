package Java_Advanced._3;

import java.util.*;

public class exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }


    /**
     * 1: Complete the function that removes any duplicates by using a set
     * then recreates a new list of unique items
     * <p>
     * You can reset a list by using list = new ArrayList<>();
     */
    private static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "a", "b", "c", "a", "b", "c"));

        // Your code here
        Set<String> setList = new HashSet<>();

        setList.addAll(list);
        list = new ArrayList<>();
        list.addAll(setList);
        System.out.println(list);


        if (list.size() == 3) {
            System.out.println("Exercise 1: Success");
        } else {
            System.out.println("Exercise 1: Failed");
        }
    }

    /**
     * 2: Write a method that takes a List of Strings or a Set of Strings and returns a Set of Strings.
     * the method should take a collection as a parameter
     */
    private static void exercise2() {
        // Your code here
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "kiwi", "banana");
        Set<String> set = Set.of("apple", "banana");
        Set<String> List2 = toSet(list);
        toSet(set);
        System.out.println(List2);
        System.out.println(toSet(set));
    }

    // Write your method for exercise 2 here
    private static Set<String> toSet(Collection<String> collection) {
        Set<String> set = new HashSet<>();
        set.addAll(collection);
        return set;

    }

    /**
     * 3: Follow the instructions in the comments
     */
    private static void exercise3() {
        String str = "the fox and the lazy dog saw another fox with another not lazy dog";
        List<String> words = Arrays.stream(str.split(" ")).toList();
        Map<String, Integer> wordCount = new HashMap<>();

        // Write code to count the number of occurrences of each word in the String `words`
        // and store the counts in the Map `wordCount`, note you will need to first get the previous value
        // from the Map and then increment it by 1, if no previous value exists, use 0 as the previous value.

        // Your code here


        for(String word : words){
            if(!wordCount.containsKey(word)){
                wordCount.put(word, 1);
            } else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }

        System.out.println(wordCount);

    }




    /**
     * 4: Answer the following questions
     *
     *    What is the best data structure to use in the following scenarios, chose either a List, Set or Map
     *    and explain why you chose that data structure.
     *
     *    1 - You want to store the students in order of their arrival
     *    Answer: list (ordine di arrivo degli studenti)
     *
     *    2 - You want to store the students in a class and their grades
     *    Answer: list (studenti con stesso nome o voto)
     *
     *    3 - You want to store the countries in the world in order of age
     *    Answer: map ( key countries, value age)
     *
     *    4 - You want to store the products available for purchase in an online store, along with their corresponding prices.
     *    Answer: map (key products, value prices)
     *
     *    5 - You want to store the employees at a company in the order you added them
     *    Answer: list  (ordine di arrivo degli impiegati)
     *
     *    6 - You want to store the cities in a particular state, along with their populations.
     *    Answer: map (key state, value popolations)
     *
     *    7 - You want to store the books in a library, along with their authors and publication dates.
     *    Answer: set (perché l'autore del libro è unico)
     *
     *    8 - You want to store the courses offered at a university, along with the professors teaching each course.
     *    Answer: map ( key courses , value professors)
     *
     *    9 - You want to store the movies in a movie rental store, along with their ratings and release dates.
     *    Answer: set (unicità)
     *
     *    10 - You want to store the flights available for booking on an airline, along with their destinations and departure times.
     *    Answer: set, i dati di un volo devono essere unici
     *
     *    11 - You want to store the articles on a news website, along with their titles and publication dates.
     *    Answer: set, i dati devono essere unici
     *
     *    12 - You want to store the songs in a music streaming service, along with their artists and album names.
     *    Answer: set, i dati devono essere unici
     */
}
