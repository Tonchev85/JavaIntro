package homework.qa;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] createAray = new int[20];
        System.out.println("The numbers are");
        for (int i = 0; i < createAray.length; i++) {
            createAray[i] = i * 5;
        }
        for (int i = 0; i < createAray.length; i++) {
            System.out.println(createAray[i]);
        }
        System.out.println("====================");

        int numbers = 0;
        for (int i = 0; i < createAray.length; i++) {
            numbers += createAray[i];
        }
        int averageValue = numbers / createAray.length;
        System.out.println(" The average value is: " + averageValue);

        System.out.println("====================");

        int even = 0;
        int odd = 0;
        for (int i = 0; i < createAray.length; i++) {
            if (createAray[i] % 2 == 0) {
                odd += createAray[i];
            } else
                even += createAray[i];
        }
        System.out.printf("%nТhis number is even: %d%n", even);
        System.out.printf("Тhis number is odd: %d%n", odd);

        System.out.println("====================");

    }

}