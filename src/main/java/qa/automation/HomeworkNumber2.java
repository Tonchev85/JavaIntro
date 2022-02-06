package qa.automation;

import java.util.Scanner;

public class HomeworkNumber2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = "My name is <myName>";

        String changeName = name.replace("<myName>", scanner.nextLine());
        System.out.println(changeName);

        System.out.println("======================");

        System.out.println("First string:");
        String firstString = scanner.nextLine();

        System.out.println("Second string:");
        String secondString = scanner.nextLine();

        if (firstString.equals(secondString)){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }

        System.out.println("======================");

        String countTheWords = "the number of words in the sentence";

        System.out.println("the number of letters in the sentence is" +" " + countTheWords.length());
        String [] stringArray = countTheWords.split(" ");
        System.out.println( "\""+countTheWords + "\"" + " is " + stringArray.length );

        System.out.println("======================");

        String firstName = "Emil";
        String  secondName = "Ivanov";
        String  thirdName = "Tonchev";

        System.out.println(firstName + " " + secondName +" " + thirdName);
    }
}
