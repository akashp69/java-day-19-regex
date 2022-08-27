package com.javaregex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc = new Scanner(System.in);
    public void validateUserName() {
        System.out.println("Enter UserName");
        String userName = sc.next();
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";

        Pattern p = Pattern.compile(regex);

        Matcher matcher = p.matcher(userName);

        boolean result = matcher.matches();

        if (result) {
            System.out.println("Valid username");
        } else {
            System.out.println("Invalid username");
        }
    }
    public void validateLastName() {
        System.out.println("Enter Lastname");
        String lastName = sc.next();
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(lastName);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Valid lastname");
        } else {
            System.out.println("Invalid lastname");
        }
    }
    public void validateEmail() {
        System.out.println("Enter Email");
        String eMail = sc.next();
        String regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(eMail);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
    public void validPhoneNo() {
        System.out.println("Enter Phone no with country code");
        String mobileno = sc.next();
        String regex = "^[1-9]{2}\\s[0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(mobileno);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Valid MobileNo");
        } else {
            System.out.println("Invalid MobileNo");
        }
    }
    public static void main(String[] args) {
       
        UserRegistration registration = new UserRegistration();

        while (true) {

            System.out.println(
                    "Enter choice to validate\n" + "Enter 1 for UserName\n"
                            + "Enter 2 for Lastname\n" + "Enter 3 for Email\n" + "Enter 4 for phone number\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    registration.validateUserName();
                    break;
                case 2 :
                    registration.validateLastName();
                    break;
                case 3 :
                    registration.validateEmail();
                    break;
                case 4:
                    registration.validPhoneNo();
                    break;
                default :
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }
}