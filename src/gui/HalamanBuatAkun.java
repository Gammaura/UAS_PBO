package gui;

import controllers.UserController;

import javax.swing.*;
import java.awt.*;

public class HalamanBuatAkun extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private UserController userController;

    public HalamanBuatAkun() {
        userController = new UserController(); // Inisialisasi UserController
        setTitle("CREATE ACCOUNT");

        // Mendapatkan ukuran layar desktop
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width + 64;
        int screenHeight = screenSize.height;

        // Mengatur ukuran jendela agar sesuai dengan ukuran layar desktop
        setSize(screenWidth, screenHeight);
        setLocation((screenWidth - getWidth()), (screenHeight - getHeight()));

        // Panel utama dengan gambar latar belakang
        JPanel mainPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("images/login.jpg"); // Gambar latar belakang
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        mainPanel.setLayout(null);

        // Panel buat akun dengan efek transparansi dan bayangan
        JPanel createAccountPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Tambahkan bayangan
                g2d.setColor(new Color(0, 0, 0, 100));
                g2d.fillRoundRect(5, 5, getWidth() - 10, getHeight() - 10, 20, 20);

                // Latar belakang panel
                g2d.setColor(new Color(0, 0, 0, 150)); // Transparansi
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            }
        };
        createAccountPanel.setSize(500, 400);
        createAccountPanel.setLayout(null);

        createAccountPanel.setLocation(
            (getWidth() - createAccountPanel.getWidth()) / 2 - 39,
            (getHeight() - createAccountPanel.getHeight()) * 72 / 100
        );

        // Label judul
        JLabel titleLabel = new JLabel("CREATE ACCOUNT");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 25));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(124, 20, 250, 40);
        createAccountPanel.add(titleLabel);

        // Input username
        usernameField = new JTextField();
        usernameField.setBounds(100, 80, 300, 40);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 18));
        usernameField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        usernameField.setForeground(Color.GRAY);
        usernameField.setText("Username");
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (usernameField.getText().equals("Username")) {
                    usernameField.setText("");
                    usernameField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (usernameField.getText().isEmpty()) {
                    usernameField.setText("Username");
                    usernameField.setForeground(Color.GRAY);
                }
            }
        });
        createAccountPanel.add(usernameField);

        // Input password
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 140, 300, 40);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
        passwordField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        passwordField.setForeground(Color.GRAY);
        passwordField.setEchoChar((char) 0);
        passwordField.setText("Password");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals("Password")) {
                    passwordField.setText("");
                    passwordField.setEchoChar('•');
                    passwordField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (passwordField.getPassword().length == 0) {
                    passwordField.setText("Password");
                    passwordField.setEchoChar((char) 0);
                    passwordField.setForeground(Color.GRAY);
                }
            }
        });
        createAccountPanel.add(passwordField);

        // Input konfirmasi password
        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(100, 200, 300, 40);
        confirmPasswordField.setFont(new Font("Arial", Font.PLAIN, 18));
        confirmPasswordField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        confirmPasswordField.setForeground(Color.GRAY);
        confirmPasswordField.setEchoChar((char) 0);
        confirmPasswordField.setText("Konfirmasi Password");
        confirmPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (String.valueOf(confirmPasswordField.getPassword()).equals("Konfirmasi Password")) {
                    confirmPasswordField.setText("");
                    confirmPasswordField.setEchoChar('•');
                    confirmPasswordField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (confirmPasswordField.getPassword().length == 0) {
                    confirmPasswordField.setText("Konfirmasi Password");
                    confirmPasswordField.setEchoChar((char) 0);
                    confirmPasswordField.setForeground(Color.GRAY);
                }
            }
        });
        createAccountPanel.add(confirmPasswordField);

        // Tombol Buat Akun
        JButton registerButton = new JButton("Buat Akun");
        registerButton.setFont(new Font("Arial", Font.BOLD, 16));
        registerButton.setBackground(new Color(70, 130, 180));
        registerButton.setForeground(Color.WHITE);
        registerButton.setFocusPainted(false);
        registerButton.setBounds(100, 260, 300, 40);
        registerButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String confirmPassword = new String(confirmPasswordField.getPassword());

            if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(this, "Password dan konfirmasi tidak cocok!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (userController.registerUser (username, password)) {
                JOptionPane.showMessageDialog(this, "Akun berhasil dibuat!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new HalamanLogin(); // Kembali ke halaman login
            } else {
                JOptionPane.showMessageDialog(this, "Username sudah digunakan!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        createAccountPanel.add(registerButton);

        // Tombol Kembali
        JButton backButton = new JButton("Kembali");
        backButton.setFont(new Font("Arial", Font.BOLD, 16));
        backButton.setBackground(new Color(220, 20, 60));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButton.setBounds(100, 320, 300, 40);
        backButton.addActionListener(e -> {
            dispose();
            new HalamanLogin(); // Kembali ke halaman login
        });
        createAccountPanel.add(backButton);

        // Tambahkan panel buat akun ke panel utama
        mainPanel.add(createAccountPanel);

        // Tambahkan panel utama ke frame
        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HalamanBuatAkun();
    }
}