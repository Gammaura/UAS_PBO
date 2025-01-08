package database;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

// Kelas untuk menyimpan data hewan
public class AnimalDatabase {
    private static List<Animal> animals = new ArrayList<>();

    // Metode untuk menambahkan hewan
    public static void addAnimal(String name, String type, String status) {
        animals.add(new Animal(name, type, status));
        System.out.println("Hewan berhasil didaftarkan: " + name);
    }

    // Metode untuk mendapatkan daftar hewan
    public static List<Animal> getAnimals() {
        return animals;
    }

    public static Connection getConnection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getConnection'");
    }
}

// Kelas untuk representasi hewan
public class Animal {
    private String name;
    private String type;
    private String status;

    public Animal(String name, String type, String status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Nama: " + name + ", Jenis: " + type + ", Status: " + status;
    }
}
