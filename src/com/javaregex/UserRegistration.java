package com.javaregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc=new Scanner(System.in);
    public void validateUseremail() {
        System.out.println("Enter Useremail");
        String Useremail =sc.next();
        String regex = "^[a-z0-9+_.-]+@(.+)$";

        Pattern p = Pattern.compile(regex);

        Matcher matcher = p.matcher(Useremail);

        boolean result = matcher.matches();

        if(result){
            System.out.println("Valid useremail");
        }
        else {
            System.out.println("Invalid useremail");
        }
    }
    public static void main(String[] args) {

        UserRegistration registration=new UserRegistration();

        while(true) {

            System.out.println("Enter choice.............\n " +"1)Useremail\n");

            int choice=sc.nextInt();

            switch(choice) {
                case 1:
                    registration.validateUseremail();
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }
    }
}