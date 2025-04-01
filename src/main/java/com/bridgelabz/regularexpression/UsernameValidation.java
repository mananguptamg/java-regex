package com.bridgelabz.regularexpression;

import java.util.regex.*;
import java.util.Scanner;

public class UsernameValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[a-z][A-Za-z0-9_]{4,14}$";
        Pattern username = Pattern.compile(regex);

        System.out.print("Enter username: ");
        String input = scanner.nextLine();
        Matcher matcher = username.matcher(input);

        if(matcher.find()){
            System.out.println("Valid Username");
        }
        else{
            System.out.println("Invalid Username");
        }
    }
}
