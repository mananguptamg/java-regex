package com.bridgelabz.regularexpression;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAddressExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
        Pattern email = Pattern.compile(regex);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();
        Matcher matcher = email.matcher(input);

        List<String> emailList = new ArrayList<>();
        while (matcher.find()) {
            emailList.add(matcher.group());
        }
        for (String mails : emailList) {
            System.out.println(mails);
        }
    }
}
