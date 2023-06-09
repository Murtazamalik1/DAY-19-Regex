package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public void validFirstName() {
        Pattern pattern = Pattern.compile("^[A-Z]{3}[a-z]{2,10}");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User FirstName");
        String firstName = scanner.next();

        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Not Valid Name");
        }
    }

    public void validLastName() {
        Pattern pattern = Pattern.compile("^[a-z]{2,10}[A-Z]{3}$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User LastName");
        String lastName = scanner.next();

        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Valid LastName");
        } else {
            System.out.println("Not Valid LastName");
        }
    }

    public void ValidEmail() {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Email");
        String validEmail = scanner.next();

        Matcher matcher = pattern.matcher(validEmail);
        if (matcher.matches()) {
            System.out.println(" Email Name Is Valid");
        } else {
            System.out.println("Not Valid Email");
        }
    }

    public void preDefineMobileFormat() {
        Pattern pattern = Pattern.compile("^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Mobile Number");
        String mobileFormat = scanner.next();
        Matcher matcher = pattern.matcher(mobileFormat);
        if (matcher.matches()) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Not Valid Mobile Number");
        }
    }

    public void validPasswordMin8CharacterRule1() {
        Pattern pattern = Pattern.compile("[A-Za-z0-9]{8}");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Password Min 8 character");
        String password = scanner.next();
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid password");
        } else {
            System.out.println("Not Valid password");
        }
    }
    public void validPasswordAtLeastOneNumericNumberCaseRule3() {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{6}[0-9]{1}$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Password ");
        String password = scanner.next();
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid password");
        } else {
            System.out.println("Not Valid password");
        }
    }

    public void ValidPasswordOneSpecialCharacterRule4(){
        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User Password ");
        String password = scanner.next();
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid password");
        } else {
            System.out.println("Not Valid password");
        }
    }

}