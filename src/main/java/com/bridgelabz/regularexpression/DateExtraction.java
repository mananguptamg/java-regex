package com.bridgelabz.regularexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern date = Pattern.compile(regex);

        System.out.print("Enter text ");
        String input = scanner.nextLine();
        Matcher matcher = date.matcher(input);

        List<String> dateList = new ArrayList<>();
        while(matcher.find()){
            dateList.add(matcher.group());
        }
        for(String dates: dateList){
            System.out.println(dates);
        }
    }
}
