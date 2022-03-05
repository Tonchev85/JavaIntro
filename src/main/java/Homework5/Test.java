package Homework5;

public class Test {
    public static void main(String[] args) {

        Cat fluffyCat = new Cat();
        fluffyCat.setName("Sunny");
        fluffyCat.setBreed("Siberian cat");
        fluffyCat.setAge(7);
        fluffyCat.setAddress(true);
        fluffyCat.printData();
        fluffyCat.voice();

        System.out.println("====================");

        Cat streetCat = new Cat("Sasho", "Unknown breed", 5, false);
        streetCat.printData();
        streetCat.voice();
    }
}
