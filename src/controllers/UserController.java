package controllers;

import java.util.HashMap;
import java.util.Map;

public class UserController {
    private Map<String, String> userDatabase; // Simulasi database pengguna

    public UserController() {
        userDatabase = new HashMap<>(); // Inisialisasi userDatabase
        userDatabase.put("pangeran naga", "rajalance");
        userDatabase.put("dikdok", "poke");
        userDatabase.put("", "poke");
    }

    // Metode untuk mendaftarkan pengguna baru
    public boolean registerUser (String username, String password) {
        if (userDatabase.containsKey(username)) {
            return false; // Username sudah digunakan
        }
        userDatabase.put(username, password); // Simpan username dan password
        return true; // Pendaftaran berhasil
    }

    // Metode untuk autentikasi (digunakan di halaman login)
    public boolean authenticate(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}