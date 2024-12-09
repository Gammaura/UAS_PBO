package Pertemuan10_Inheritence.Kendaraan;

class Vehicle {
    String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Metode untuk menampilkan informasi kendaraan
    public void displayInfo() {
        System.out.println("BRAND : " + brand);
    }
}

// Subclass
class Car extends Vehicle {
    int doors;

    // Constructor
    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    // Overloading metode displayInfo
    public void displayInfo(String type) 
    {
        super.displayInfo();
        System.out.println("TIPE : " + type);
        System.out.println("PINTU : " + doors);
    }
}

public class KendaraanTester {
    public static void main(String[] args) 
    {
        System.out.print("\033[H\033[2J");
        
        Car car = new Car("TOYOTA", 4);
        car.displayInfo("SEDAN");
    }
}