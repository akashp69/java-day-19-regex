package com.javaregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc=new Scanner(System.in);
    public void validateLastname() {
        System.out.println("Enter LastName");
        String LastName=sc.next();
        String regex = "^[A-Z]{1}[a-zA-z0-9]{2,}$";

        Pattern p = Pattern.compile(regex);

        Matcher matcher = p.matcher(LastName);

        boolean result = matcher.matches();

        if(result){
            System.out.println("Valid lastname");
        }
        else {
            System.out.println("Invalid lastname");
        }
    }
    public static void main(String[] args) {

        UserRegistration registration=new UserRegistration();

        while(true) {

            System.out.println("Enter choice.............\n " +"1)LastName\n");

            int choice=sc.nextInt();

            switch(choice) {
                case 1:
                    registration.validateLastname();
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }
}