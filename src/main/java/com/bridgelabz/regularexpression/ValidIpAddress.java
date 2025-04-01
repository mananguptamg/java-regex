package com.bridgelabz.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIpAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);

        System.out.print("Enter ip address: ");
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            System.out.println("Valid IP Address");
        }
        else{
            System.out.println("Invalid IP Address");
        }
    }
}
