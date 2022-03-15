package ro.sda.iulian.exceptions.ex1;

import java.util.Scanner;

/**
 * 1. Write an application that will read the input and print back value that user provided, use try-catch statements to parse the input, e.g.
 * I/O:
 * Input: 10
 * Output: int -> 10
 * Input: 10.0
 * Output: double -> 10.0
 * Input: „Hello!”
 * Output: „Hey! That’s not a value! Try once more.”
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a value: ");

        String stringvalue = scanner.nextLine();

        try {
            int value = Integer.parseInt(stringvalue);
            System.out.println("int -> " + value);
        } catch (NumberFormatException e) {
            try {
                double value = Double.parseDouble(stringvalue);
                System.out.println("double -> " + value);
            } catch (NumberFormatException e1) {
                System.out.println("That's not a value!");
            }finally{
                System.out.println("This is the finally for double");
            }
        }finally{
            System.out.println("This is the finally for int");
        }
    }
}