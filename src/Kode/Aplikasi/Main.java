package Kode.Aplikasi;

import javax.swing.SwingUtilities;

import Kode.gui.LoginPage;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginPage());
    }
}
