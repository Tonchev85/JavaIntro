package Homework5;

public class Animal {
    private String name;
    private String breed;
    private int age;
    private boolean address;

    public Animal (String name, String breed, int age, boolean address) {
        setName(name);
        setAge(age);
        setBreed(breed);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }else {
            System.out.println("Invalid data!");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.isEmpty()) {
            this.breed = breed;
        } else {
            System.out.println("Invalid data!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }else{
            System.out.println("Invalid data!");
        }
    }

    public boolean isAddress() {
        return address;
    }

    public void setAddress(boolean address) {
        this.address = address;
    }
    public void printData(){
        System.out.printf("This cat's name is: %s.%nThis cat`s age: %d.%nThis cat`s breed is: %s.%n", name, age, breed);
        if (address){
            System.out.println("This cat is domestic.");
        }else {
            System.out.println("This cat is homeless.");
        }
    }
}
