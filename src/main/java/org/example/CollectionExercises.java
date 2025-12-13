package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        // Use a loop to set every element to "apple"
        // Replace the line below with your implementation
        String[] appleArray = new String[size];
        for (int i = 0; i < size; i++) {
            appleArray[i] = "apple";
        }

        return appleArray;
    }
    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        int size = Math.min(fruits.length, 3);
        String[] firstThreeArray = new String[size];
        for (int i = 0; i < size; i++) {
            firstThreeArray[i] = fruits[i];
        }
        return firstThreeArray;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("cherry");
        fruitList.add("date");
        fruitList.add("elderberry");

        return fruitList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> threeFruits = new ArrayList<String>();
        threeFruits.add(fruit1);
        threeFruits.add(fruit2);
        threeFruits.add(fruit3);
        return threeFruits;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String, String> fruitsAndColors = new HashMap<String, String>();
        fruitsAndColors.put("apple", "red");
        fruitsAndColors.put("banana", "yellow");
        fruitsAndColors.put("cherry", "red");
        fruitsAndColors.put("date", "brown");
        fruitsAndColors.put("elderberry", "black");
        return fruitsAndColors;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        String appleColor = fruitMap.get("apple");
        return appleColor;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> fruitsHashSet = new HashSet<String>();
        fruitsHashSet.add(fruit1);
        fruitsHashSet.add(fruit2);
        fruitsHashSet.add(fruit3);
        return fruitsHashSet;
    }
}
