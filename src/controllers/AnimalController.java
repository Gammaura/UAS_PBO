package controllers;

import database.AnimalDatabase;
import models.Animal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalController {

    public void registerAnimal(Animal animal) {
        String query = "INSERT INTO animals (name, type, status) VALUES (?, ?, ?)";
        try (Connection connection = AnimalDatabase.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, animal.getName());
            statement.setString(2, animal.getType());
            statement.setString(3, animal.getStatus());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Animal> getAllAnimals() {
        List<Animal> animals = new ArrayList<>();
        String query = "SELECT * FROM animals";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Animal animal = new Animal();
                animal.setId(resultSet.getInt("id"));
                animal.setName(resultSet.getString("name"));
                animal.setType(resultSet.getString("type"));
                animal.setStatus(resultSet.getString("status"));
                animals.add(animal);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animals;
    }

    public void updateAnimal(Animal animal) {
        String query = "UPDATE animals SET name = ?, type = ?, status = ? WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, animal.getName());
            statement.setString(2, animal.getType());
            statement.setString(3, animal.getStatus());
            statement.setInt(4, animal.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAnimal(int id) {
        String query = "DELETE FROM animals WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}