package com.bridgelabz.regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidCreditCardNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[4-6]{1}[0-9]{15}$";
        Pattern pattern = Pattern.compile(regex);

        System.out.print("Enter credit card number: ");
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        if(matcher.matches()){
            char firstDigit = input.charAt(0);
            if (firstDigit == '4') {
                System.out.println("Valid Visa Card");
            } else if (firstDigit == '5') {
                System.out.println("Valid MasterCard");
            } else if (firstDigit == '6') {
                System.out.println("Valid RuPay Card");
            } else {
            System.out.println("Invalid Credit Card Number");
            }
        }
    }
}
