package com.bridgelabz.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveBadWords {
    public static void main(String[] args) {
        String[] badWords = {"damn", "stupid"};
        String regex = String.join("|", badWords);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        String censoredSentence = matcher.replaceAll("****");
        System.out.println("Censored sentence: " + censoredSentence);
    }
}
