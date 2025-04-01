package com.bridgelabz.regularexpression;

import java.util.*;
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String spacesRemoved = input.replaceAll("\\s+", " ");
        System.out.println("String after removing extra spaces: " + spacesRemoved);
    }
}
