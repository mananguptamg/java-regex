package com.bridgelabz.regularexpression;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalWordExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b[A-Z][A-Za-z]*\\b";
        Pattern capital = Pattern.compile(regex);

        System.out.print("Enter text ");
        String input = scanner.nextLine();
        Matcher matcher = capital.matcher(input);

        List<String> capitalLetters = new ArrayList<>();
        while(matcher.find()){
            capitalLetters.add(matcher.group());
        }
        for(String letters: capitalLetters){
            System.out.println(letters);
        }
    }
}
