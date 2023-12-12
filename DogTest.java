class Dog {
    int age;
    String name, race, sound;

    Dog(int age, String name, String race, String sound) {
        this.age = age;
        this.name = name;
        this.race = race;
        this.sound = sound;
    }

    void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Race: " + this.race);
    }

    String makeSound() {
        return this.sound;
    }
}

public class DogTest {
    public static void main(String[] args) {
        Dog rover = new Dog(2, "Rover", "Dalmatian", "Woof!!!");
        Dog rex = new Dog(4, "Rex", "Australian terrier", "woofwoof");

        System.out.println("Dog info:");
        rover.printInfo();
        System.out.println("Dog says: " + rover.makeSound());
        System.out.println();
        rex.printInfo();
        System.out.println("Dog says: " + rex.makeSound());
    }
}