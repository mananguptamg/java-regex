package com.bridgelabz.regularexpression;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidCurrenyValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\$\\d+(\\.\\d{1,2})?";
        Pattern pattern = Pattern.compile(regex);

        System.out.print("Enter String: ");
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        List<String> values = new ArrayList<>();
        while(matcher.find()){
            values.add(matcher.group());
        }
        for(String value : values){
            System.out.println(value);
        }
    }
}
