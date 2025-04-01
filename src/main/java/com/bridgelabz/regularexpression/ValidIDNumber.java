package com.bridgelabz.regularexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIDNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
        Pattern pattern = Pattern.compile(regex);

        System.out.print("Enter SSN Number: ");
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        List<String> values = new ArrayList<>();
        if(matcher.find()){
            System.out.println("Valid SSN number");
        }
        else{
            System.out.println("Invalid SSN number");
        }
    }
}
