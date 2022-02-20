package qa.automation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number from 1 to 7 for the day of the week:");

        int chooseDay = scanner.nextInt();

        switch (chooseDay){
            case 1:
                System.out.println("You entered 1. So the day of the week is Monday");
                break;
            case 2:
                System.out.println("You entered 2. So the day of the week is Tuesday");
                break;
            case 3:
                System.out.println("You entered 3. So the day of the week is Wednesday");
                break;
            case 4:
                System.out.println("You entered 4. So the day of the week is Thursday");
                break;
            case 5:
                System.out.println("You entered 5. So the day of the week is Friday");
                break;
            case 6:
                System.out.println("You entered 6. So the day of the week is Saturday");
                break;
            case 7:
                System.out.println("You entered 7. So the day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid Number");
        }
        System.out.println("======================");

        System.out.println("Please enter the length of the rectangle:");

        double length = scanner.nextInt();

        System.out.println("Please enter the width of the rectangle:");

        int width = scanner.nextInt();

        int perimeter = (int) ((width * 2) + (length * 2));
        int face = (int) (width * length);

        System.out.println(" The perimeter of a rectangle is " + perimeter);
        System.out.println(" The face of a rectangle is " + face);

        System.out.println("======================");

        System.out.println("Please enter a number");

        int number = (scanner.nextInt());

        if ( number > 0){
            System.out.println( "The number is positive");
        }else if ( number<0){
            System.out.println("The number is negative");
        }
        System.out.println("======================");

        System.out.println("Please enter a first number");

        int firstNumber = scanner.nextInt();

        System.out.println("Please enter a second number");

        int secondNumber = scanner.nextInt();

        System.out.println("Please enter a third number");

        int thirdNumber = scanner.nextInt();

        int largest = firstNumber;

        if (secondNumber>largest) largest = secondNumber;

        if (thirdNumber>largest) largest = thirdNumber;

        System.out.println("The largest number is :" + largest);
    }
}
