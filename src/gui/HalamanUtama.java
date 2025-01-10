package gui;

import javax.swing.*;
import java.awt.*;

public class HalamanUtama extends JFrame {
    private JPanel contentPanel; // Panel untuk konten utama
    private CardLayout cardLayout; // Layout untuk menampilkan halaman berbeda
    private JPanel mainPanel; // Panel utama

    public HalamanUtama() {
        setTitle("HOME PAGE");

        // Mendapatkan ukuran layar desktop
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width + 64;
        int screenHeight = screenSize.height;

        // Mengatur ukuran jendela agar sesuai dengan ukuran layar desktop
        setSize(screenWidth, screenHeight);
        setLocation((screenWidth - getWidth()) / 2, (screenHeight - getHeight()) / 2);

        // Panel utama dengan gambar latar belakang
        mainPanel = new JPanel(new BorderLayout()) {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("images/background.jpg");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

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
            (getWidth() - loginPanel.getWidth()) / 2,
            (getHeight() - loginPanel.getHeight()) * 72 / 100
        );

        // Foto profil
        ImageIcon profileIcon = new ImageIcon("login.jpg"); // Ganti dengan path gambar profil
        JLabel profilePicture = new JLabel();
        profilePicture.setIcon(profileIcon);
        profilePicture.setHorizontalAlignment(SwingConstants.CENTER);

        // Username
        JLabel usernameLabel = new JLabel("ADMIN", SwingConstants.CENTER);
        usernameLabel.setForeground(Color.WHITE);
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Tambahkan komponen profil
        JPanel profilePanel = new JPanel();
        profilePanel.setLayout(new BoxLayout(profilePanel, BoxLayout.Y_AXIS));
        profilePanel.setBackground(new Color(45, 45, 45));
        profilePanel.add(Box.createRigidArea(new Dimension(0, 10)));
        profilePanel.add(profilePicture);
        profilePanel.add(Box.createRigidArea(new Dimension(0, 10)));
        profilePanel.add(usernameLabel);
        profilePanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Sidebar panel
JPanel sidebarPanel = new JPanel();
sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
sidebarPanel.setBackground(new Color(50, 50, 50));

// Mengubah ukuran sidebarPanel
sidebarPanel.setPreferredSize(new Dimension(250, getHeight())); // Lebar 250px dan tinggi sesuai dengan tinggi frame

sidebarPanel.add(profilePanel);

        // Tambahkan tombol sidebar
        JButton btnHome = createSidebarButton("Home", "login.jpg");
        sidebarPanel.add(btnHome);

        // Menu dengan sub-menu: Pelayanan Hewan
        JButton btnPelayananHewan = createSidebarButton("Pelayanan Hewan", "path/to/pelayanan-icon.png");
        JPanel subMenuPelayanan = createSubMenu(new String[]{"Pengobatan Hewan", "Penitipan Hewan"});
        sidebarPanel.add(btnPelayananHewan);
        sidebarPanel.add(subMenuPelayanan);

        JButton btnPembayaran = createSidebarButton("Pembayaran", "path/to/payment-icon.png");
        sidebarPanel.add(btnPembayaran);

        JButton btnHistory = createSidebarButton("History", "path/to/history-icon.png");
        JButton btnLogout = createSidebarButton("Logout", "path/to/logout-icon.png");

        sidebarPanel.add(btnHistory);
        sidebarPanel.add(btnLogout);

        // Panel konten
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        // Tambahkan halaman konten
        contentPanel.add(createHomePage(), "Home");
        contentPanel.add(createPelayananPage(), "Pelayanan Hewan");

        // Tambahkan komponen ke main panel
        mainPanel.add(sidebarPanel, BorderLayout.WEST);
        mainPanel.add(contentPanel, BorderLayout.CENTER);

        // Tambahkan main panel ke frame
        add(mainPanel);

        // Aksi tombol
        btnHome.addActionListener(e -> cardLayout.show(contentPanel, "Home"));
        btnPelayananHewan.addActionListener(e -> toggleSubMenu(subMenuPelayanan));
    }

    private JButton createSidebarButton(String text, String iconPath) {
        JButton button = new JButton(text);
        button.setIcon(new ImageIcon(iconPath));
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setBackground(new Color(70, 70, 70));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.PLAIN, 14));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setMaximumSize(new Dimension(180, 40));
        return button;
    }

    private JPanel createSubMenu(String[] subItems) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(55, 55, 55));
        panel.setVisible(false); // Default disembunyikan

        for (String item : subItems) {
            JButton subButton = new JButton(item);
            subButton.setHorizontalAlignment(SwingConstants.LEFT);
            subButton.setBackground(new Color(70, 70, 70));
            subButton.setForeground(Color.WHITE);
            subButton.setFont(new Font("Arial", Font.PLAIN, 12));
            subButton.setFocusPainted(false);
            subButton.setBorderPainted(false);
            subButton.setMaximumSize(new Dimension(180, 35));
            panel.add(subButton);
        }

        return panel;
    }

    private void toggleSubMenu(JPanel subMenu) {
        subMenu.setVisible(!subMenu.isVisible());
        subMenu.getParent().revalidate();
        subMenu.getParent().repaint();
    }

    private JPanel createHomePage() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Halaman Home"));
        return panel;
    }

    private JPanel createPelayananPage() {
        JPanel panel = new JPanel();
        panel.add(new JLabel("Halaman Pelayanan Hewan"));
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HalamanUtama frame = new HalamanUtama();
            frame.setVisible(true);
        });
    }
}