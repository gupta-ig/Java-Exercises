package concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class Example {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding entries
        map.put("one", 1);
        map.put("two", 2);

        // Concurrent read
        System.out.println(map.get("one")); // Output: 1

        // Concurrent update
        map.putIfAbsent("three", 3); // Adds entry if key "three" is not already present

        // Concurrent remove
        map.remove("two", 2); // Removes entry with key "two" only if its value is 2

        // Iteration (note: iteration order is not guaranteed to be consistent)
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
