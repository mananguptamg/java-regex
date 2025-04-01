package com.bridgelabz.regularexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "https?://www\\.[a-z0-9-]+\\.[a-z]{2,}";
        Pattern link = Pattern.compile(regex);

        System.out.print("Enter text ");
        String input = scanner.nextLine();
        Matcher matcher = link.matcher(input);

        List<String> linksList = new ArrayList<>();
        while(matcher.find()){
            linksList.add(matcher.group());
        }
        for(String links: linksList){
            System.out.println(links);
        }
    }
}
