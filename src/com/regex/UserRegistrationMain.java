package com.regex;

public class UserRegistrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Regex");
       UserRegistration user = new UserRegistration();
        user.validFirstName();
        user.validLastName();
        user.ValidEmail();
        user.preDefineMobileFormat();
        user.validPasswordMin8CharacterRule1();
    }
}
