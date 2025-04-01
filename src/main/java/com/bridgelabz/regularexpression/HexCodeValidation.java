package com.bridgelabz.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HexCodeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^#[0-9a-fA-F]{6}$";
        Pattern hexCode = Pattern.compile(regex);

        System.out.print("Enter hex code: ");
        String input = scanner.nextLine();
        Matcher matcher = hexCode.matcher(input);

        if(matcher.find()){
            System.out.println("Valid Code");
        }
        else{
            System.out.println("Invalid Code");
        }
    }
}
