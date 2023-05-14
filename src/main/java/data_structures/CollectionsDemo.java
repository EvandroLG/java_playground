package data_structures;

import java.sql.Array;
import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        //setDemo();
        //setList();
        //queueDemo();
        mapDemo();
    }

    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        var i = fruits.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println(fruits);
        fruits.remove("lemon");
        System.out.println("Contains lemon? " + fruits.contains("lemon"));
        System.out.println("size: " + fruits.size());

        Set moreFruits = Set.of("pear", "raisin", "cherry"); // Immutable Set
    }

    public static void setList() {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.set(2, "grape");
        fruits.add("lemon");
        fruits.remove("lemon"); // removes first item found

        //for (String fruit : fruits) {
        //    System.out.println(fruit);
        //}

        fruits.forEach(fruit -> System.out.println(fruit));

        System.out.println(fruits);
        System.out.println("index 2: " + fruits.get(2));
        System.out.println("Index of grape: " + fruits.indexOf("grape"));

        List moreFruits = List.of("cherry", "plum"); // Immutable List
    }

    public static void queueDemo() {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        var removed = fruits.remove();

        System.out.println("Removed: " + removed);
        System.out.println("Head of queue " + fruits.peek());

        System.out.println(fruits);
    }

    public static void mapDemo() {
        Map<String, Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.putIfAbsent("orange", 17);

        //for (Map.Entry caloriesInfo : fruitCalories.entrySet()) {
        //    System.out.println(caloriesInfo.getKey() + ": " + caloriesInfo.getValue());
        //}

        fruitCalories.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println(fruitCalories);
        System.out.println("Banana calories: " + fruitCalories.get("banana"));
    }
}
