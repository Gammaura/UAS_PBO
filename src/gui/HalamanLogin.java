package gui;

import controllers.UserController;

import javax.swing.*;
import java.awt.*;

public class HalamanLogin extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private UserController userController;

    public HalamanLogin() {
        userController = new UserController(); // Inisialisasi UserController
        setTitle("SIGN IN");

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
                ImageIcon icon = new ImageIcon("images/login.jpg");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        mainPanel.setLayout(null);

        // Panel login dengan efek transparansi dan bayangan
        JPanel loginPanel = new JPanel() {
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
        loginPanel.setSize(500, 400);
        loginPanel.setLayout(null);

        loginPanel.setLocation(
            (getWidth() - loginPanel.getWidth()) / 2 - 39,
            (getHeight() - loginPanel.getHeight()) * 72 / 100
        );

        // Label judul
        JLabel titleLabel = new JLabel("SIGN IN");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 25));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(190, 20, 250, 40);
        loginPanel.add(titleLabel);

        // Label judul
        JLabel akunLabel = new JLabel("Belum Punya Akun?");
        akunLabel.setFont(new Font("Arial", Font.BOLD, 14));
        akunLabel.setForeground(Color.WHITE);
        akunLabel.setBounds(174, 284, 250, 40);
        loginPanel.add(akunLabel);

        // Input username
        usernameField = new JTextField();
        usernameField.setBounds(100, 80, 300, 40);
        usernameField.setFont(new Font("Arial", Font.PLAIN, 18));
        usernameField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        usernameField.setForeground(Color.GRAY);
        usernameField.setText("Masukkan Username*");
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (usernameField.getText().equals("Masukkan Username*")) {
                    usernameField.setText("");
                    usernameField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (usernameField.getText().isEmpty()) {
                    usernameField.setText("Masukkan Username*");
                    usernameField.setForeground(Color.GRAY);
                }
            }
        });
        loginPanel.add(usernameField);

        // Input password
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 140, 300, 40);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 18));
        passwordField.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        passwordField.setForeground(Color.GRAY);
        passwordField.setEchoChar((char) 0);
        passwordField.setText("Masukkan Password*");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals("Masukkan Password*")) {
                    passwordField .setText("");
                    passwordField.setEchoChar('•');
                    passwordField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (passwordField.getPassword().length == 0) {
                    passwordField.setText("Masukkan Password*");
                    passwordField.setEchoChar((char) 0);
                    passwordField.setForeground(Color.GRAY);
                }
            }
        });
        loginPanel.add(passwordField);

        // Tombol Login
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 200, 300, 40);
        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(new Color(70, 130, 180)); // Warna yang sama dengan tombol Buat Akun
        loginButton.setFocusPainted(false);
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 2));
        loginButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                loginButton.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(50, 110, 160), 3),
                    BorderFactory.createEmptyBorder(2, 2, 2, 2)
                ));
                loginButton.setBackground(new Color(90, 150, 200)); // Warna lebih cerah saat hover
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                loginButton.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 2));
                loginButton.setBackground(new Color(70, 130, 180)); // Kembali ke warna awal
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                loginButton.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(40, 100, 140), 4),
                    BorderFactory.createEmptyBorder(1, 1, 1, 1)
                ));
                loginButton.setBackground(new Color(60, 120, 180)); // Warna lebih gelap saat ditekan
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                loginButton.setBorder(BorderFactory.createLineBorder(new Color(50, 110, 160), 3));
                loginButton.setBackground(new Color(90, 150, 200)); // Warna hover kembali
            }
        });

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Autentikasi user
            if (userController.authenticate(username, password)) {
                new HalamanUtama();
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username atau password salah!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        loginPanel.add(loginButton);

        // Tombol Buat Akun
        JButton signUpButton = new JButton("Buat Akun");
        signUpButton.setBounds(100, 320, 300, 40); // Ditempatkan di bawah tombol Login
        signUpButton.setFont(new Font("Arial", Font.BOLD, 16));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(new Color(70, 130, 180)); // Warna yang sama dengan tombol Login
        signUpButton.setFocusPainted(false);
        signUpButton.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 2));
        signUpButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Tambahkan efek shadow saat mouse masuk dan keluar
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                signUpButton.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(50, 110, 160), 3),
                    BorderFactory.createEmptyBorder(2, 2, 2, 2)
                ));
                signUpButton.setBackground(new Color(90, 150, 200)); // Warna lebih cerah saat hover
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                signUpButton.setBorder(BorderFactory.createLineBorder(new Color(70, 130, 180), 2));
                signUpButton.setBackground(new Color(70, 130, 180)); // Kembali ke warna awal
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                signUpButton.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(40, 100, 140), 4),
                    BorderFactory.createEmptyBorder(1, 1, 1, 1)
                ));
                signUpButton.setBackground(new Color(60, 120, 180)); // Warna lebih gelap saat ditekan
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                signUpButton.setBorder(BorderFactory.createLineBorder(new Color(50, 110, 160), 3));
                signUpButton.setBackground(new Color(90, 150, 200)); // Warna hover kembali
            }
        });

        // Tambahkan ActionListener untuk tombol
        signUpButton.addActionListener(e -> {
            new HalamanBuatAkun(); // Membuka frame Sign Up
            setVisible(false); // Menyembunyikan frame login
        });
        loginPanel.add(signUpButton);

        // Tambahkan panel login ke panel utama
        mainPanel.add(loginPanel);

        // Pastikan tampilan diperbarui
        SwingUtilities.invokeLater(() -> {
            mainPanel.revalidate();
            mainPanel.repaint();
        });

        // Tambahkan panel utama ke frame
        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HalamanLogin());
    }
}