package qa.automation;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class MyFirstJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your First name");

        String firstName = scanner.next();

        System.out.println("Please enter your Last name");

        String lastName = scanner.next();

        System.out.println("Please enter your hobby");

        String hobby = scanner.next();

        System.out.println("Your name is " + firstName + " " + lastName +
                " and your favorite hobby is " + hobby);


    }
}
