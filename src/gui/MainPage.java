package gui;

import controllers.UserController;

import javax.swing.*;
import java.awt.*;

public class MainPage extends JFrame {
    private UserController userController;
    private CardLayout cardLayout;
    private JPanel contentPanel;

    public MainPage() {
        userController = new UserController(); // Inisialisasi UserController

        // Mendapatkan ukuran layar desktop
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        // Menghapus border dan menyiapkan frame
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mengatur mode fullscreen dengan GraphicsDevice
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = env.getDefaultScreenDevice();
        device.setFullScreenWindow(this); // Mengatur frame menjadi fullscreen

        JPanel A = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Menggambar kotak dengan sudut siku-siku (tanpa melengkung)
                g2d.setColor(Color.DARK_GRAY);
                g2d.fillRect(0, 0, getWidth(), getHeight()); // Menggambar kotak penuh
            }
        };

        A.setSize(screenWidth / 6, screenHeight);
        A.setLayout(null);
        A.setOpaque(true);
        A.setLocation(0, 0);

        JPanel B = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Menggambar kotak dengan sudut siku-siku (tanpa melengkung)
                g2d.setColor(Color.WHITE);
                g2d.fillRect(0, 0, getWidth(), getHeight()); // Menggambar kotak penuh
            }
        };

        B.setSize(screenWidth * 5 / 6, screenHeight);
        B.setLayout(null);
        B.setOpaque(true);
        B.setLocation(0, 0);

        // Panel login dengan efek transparansi dan bayangan
        JPanel C = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("images/profile.jpg");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Tambahkan bayangan
                g2d.setColor(new Color(0, 0, 0, 200));
                g2d.fillRoundRect(5, 5, getWidth() - 10, getHeight() - 10, 20, 20);

            }
        };
        C.setSize(160, 160);
        C.setLayout(null);
        C.setLocation(20, 20);

        JLabel A1Label = new JLabel("USER");
        A1Label.setFont(new Font("Arial", Font.BOLD, 20));
        A1Label.setForeground(Color.WHITE);
        A1Label.setBounds(30, 190, 130, 30);
        A.add(A1Label);

        // Sidebar panel
        JPanel sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
        sidebarPanel.setBackground(new Color(50, 50, 50));
        sidebarPanel.setBounds(0, 230, screenWidth / 6, screenHeight - 230);

        // Tambahkan tombol sidebar
        JButton btnHome = createSidebarButton("Home");
        JButton btnPelayananHewan = createSidebarButton("Pelayanan Hewan");
        JButton btnPembayaran = createSidebarButton("Pembayaran");
        JButton btnHistory = createSidebarButton("History");
        JButton btnLogout = createSidebarButton("Logout");

        // Sub-menu Pelayanan Hewan
        JPanel subMenuPelayanan = createSubMenu(new String[]{"Pengobatan Hewan", "Penitipan Hewan"});
        subMenuPelayanan.setVisible(false);

        // Tambahkan aksi untuk toggle sub-menu
        btnPelayananHewan.addActionListener(e -> toggleSubMenu(subMenuPelayanan));

        // Tambahkan tombol dan sub-menu ke sidebar
        sidebarPanel.add(btnHome);
        sidebarPanel.add(btnPelayananHewan);
        sidebarPanel.add(subMenuPelayanan);
        sidebarPanel.add(btnPembayaran);
        sidebarPanel.add(btnHistory);
        sidebarPanel.add(Box.createVerticalGlue()); // Spacer untuk tombol logout di bagian bawah
        sidebarPanel.add(btnLogout);

        // Tambahkan sidebar ke panel A
        A.add(sidebarPanel);

        // Panel konten
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        // Tambahkan halaman konten
        contentPanel.add(createHomePage(), "Home");
        contentPanel.add(createPelayananPage(), "Pelayanan Hewan");

        // Tambahkan sidebar dan konten ke frame
        add(A, BorderLayout.WEST);
        add(contentPanel, BorderLayout.CENTER);

        // Aksi tombol
        btnHome.addActionListener(e -> cardLayout.show(contentPanel, "Home"));
        btnLogout.addActionListener(e -> {
            dispose();
            new LoginPage().setVisible(true);
        });

        add(A);
        add(B);

        setVisible(true);
    }

    private JButton createSidebarButton(String text) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.setMaximumSize(new Dimension(200, 40)); // Ukuran tombol
        button.setFocusPainted(false);
        button.setBackground(new Color(70, 70, 70));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        return button;
    }

    // Metode untuk membuat sub-menu
    private JPanel createSubMenu(String[] items) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(60, 60, 60));

        for (String item : items) {
            JButton subButton = createSidebarButton(item);
            subButton.setFont(new Font("Arial", Font.PLAIN, 14));
            panel.add(subButton);
        }
        return panel;
    }

    // Metode untuk toggle sub-menu
    private void toggleSubMenu(JPanel subMenu) {
        subMenu.setVisible(!subMenu.isVisible());
        revalidate();
        repaint();
    }

    // Halaman konten untuk "Home"
    private JPanel createHomePage() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        JLabel label = new JLabel("Home Page");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(label);
        return panel;
    }

    // Halaman konten untuk "Pelayanan Hewan"
    private JPanel createPelayananPage() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        JLabel label = new JLabel("Pelayanan Hewan Page");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(label);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainPage::new);
    }
}
