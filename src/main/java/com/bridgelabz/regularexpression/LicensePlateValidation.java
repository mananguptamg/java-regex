package com.bridgelabz.regularexpression;

import java.util.regex.*;
import java.util.Scanner;

public class LicensePlateValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern plate = Pattern.compile(regex);

        System.out.print("Enter plate number: ");
        String input = scanner.nextLine();
        Matcher matcher = plate.matcher(input);

        if(matcher.find()){
            System.out.println("Valid License Plate");
        }
        else{
            System.out.println("Invalid License Plate");
        }
    }
}
