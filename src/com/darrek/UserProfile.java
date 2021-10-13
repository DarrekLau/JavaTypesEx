package com.darrek;
import java.util.Scanner;

public class UserProfile {

    public static void main(String[] args) {

        String name, gender, jobPreference, nationality, bloodType ;
        int age, birthYear;
        Scanner input = new Scanner(System.in);
        System.out.println ("Please Enter your name: ");
        name = input.nextLine();
        System.out.println ("Please Enter your age: ");
        age = input.nextInt();
        System.out.println("Please enter your gender: ");
        gender = input.next();
        System.out.println("Please enter your Job Preference: " );
        jobPreference = input.next();
        System.out.println("Please enter your nationality: ");
        nationality = input.next();
        System.out.println("Please enter your blood type: ");
        bloodType = input.next();

        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your gender is " + gender);
        System.out.println("Your Job Preference is " + jobPreference);
        System.out.println ("Your nationality is " + nationality);
        System.out.println("Your blood type is " + bloodType);

        final int year = 2021;
        birthYear= year - age;
        System.out.println("Your birth year is " + birthYear);

    }
}
