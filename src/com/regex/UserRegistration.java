package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void validFirstName(){
        Pattern pattern = Pattern.compile("^[A-Z]{3}[a-z]{2,10}");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User FirstName");
        String firstName = scanner.next();

        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()){
            System.out.println("Valid Name");
        }
        else {
            System.out.println("Not Valid Name");
        }
    }

}
