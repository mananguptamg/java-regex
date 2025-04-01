package com.bridgelabz.regularexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgrammingLanguageExtraction {
    public static void main(String[] args) {
        String[] languages = {"Java","Ruby","Go","Swift","PHP","Kotlin","Python","Javascript","C++","C"};
        String regex = String.join("|", languages);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> languagesList = new ArrayList<>();
        while (matcher.find()) {
            languagesList.add(matcher.group());
        }
        for (String language : languagesList) {
            System.out.println(language);
        }
    }
}
