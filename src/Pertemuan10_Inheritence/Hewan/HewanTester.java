package Pertemuan10_Inheritence.Hewan;

// Superclass
class Animal {
    // Properti
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Metode
    public void speak() {
        System.out.println("SUARA HEWAN");
    }
}

// Subclass
class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name); // Memanggil constructor dari superclass
    }

    // Override metode speak
    @Override
    public void speak() 
    {
        System.out.println(name + " BILANG GUKGUKGUK");
    }
}

public class HewanTester {
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");
        Dog dog = new Dog("DIKDOG");
        dog.speak();
    }
}