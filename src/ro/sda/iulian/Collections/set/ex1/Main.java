package ro.sda.iulian.Collections.set.ex1;
/**
 * ##### Collections LIST Exercise 4
 * - Write a Java program to create a new array list, add some colors (string) and print out the collection.
 * - Write a Java program to iterate through all elements in a array list.
 * - Write a Java program to insert an element into the array list at the first position.
 * - Write a Java program to retrieve an element (at a specified index) from a given array list.
 * - Write a Java program to update specific array element by given element.
 * - Write a Java program to remove the third element from a array list.
 * - Write a Java program to search an element in a array list.
 * - Write a Java program to sort a given array list.
 * - Write a Java program to copy one array list into another.
 * - Write a Java program to reverse elements in a array list..
 * - Write a Java program of swap two elements in an array list.
 * - Write a Java program to clone an array list to another array list.
 * - Write a Java program to empty an array list.
 * - Write a Java program to test an array list is empty or not.
 */

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("teal");
        colors.add("blue");
        colors.add("violet");
        System.out.println(colors);
        String color ="violet";
        if(colors.contains(color)){
            System.out.println(color);
        }
        for(String color1:colors){
            if(color1.startsWith("y")){
                System.out.println(color1);
            }
        }
        colors.remove("yellow");
        if(colors.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List is not empty");
        }
        Set<String> othercolors = new HashSet<>();
        othercolors.add("brown");
        othercolors.add("black");
        othercolors.add("orange");
        colors.addAll(othercolors);
        System.out.println(colors);
    }
}
