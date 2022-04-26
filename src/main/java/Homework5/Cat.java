package Homework5;

public class Cat extends Animal{

    public Cat(String name, String breed, int age, boolean address) {
        super(name, breed, age, address);
    }
    public Cat(){
    }

    public void voice(){
        System.out.println("Meow Meow Meow");
    }
}
