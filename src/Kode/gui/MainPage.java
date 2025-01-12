package Kode.gui;

import javax.swing.*;

import Kode.controllers.UserController;

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
        setSize(screenWidth, screenHeight);
        setLayout(null);

        // Panel dasar (Panel A) dengan gambar latar belakang
        JPanel A = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("images/background.jpg");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        A.setBounds(0, 0, screenWidth, screenHeight);
        A.setLayout(null);

        // Panel utama (Panel B)
        JPanel B = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                
                // Tambahkan bayangan
                g2d.setColor(new Color(0, 0, 0, 100)); // Bayangan transparan
                g2d.fillRoundRect(5, 5, getWidth() - 10, getHeight() - 10, 20, 20);

                // Latar belakang panel transparan
                g2d.setColor(new Color(0, 0, 0, 100));
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
            }
        };
        B.setBounds((screenWidth - (screenWidth * 2 / 3)) / 2, (screenHeight - (screenHeight * 2 / 3)) / 2, screenWidth * 2 / 3, screenHeight * 2 / 3);
        B.setLayout(null);
        B.setOpaque(false);

        // Panel C (sebelah kiri)
        JPanel C = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.DARK_GRAY);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        C.setBounds(0, 0, B.getWidth() / 6, B.getHeight());
        C.setLayout(null);

        // Panel D (sebelah kanan)
        JPanel D = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.LIGHT_GRAY);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        D.setBounds(C.getWidth(), 0, B.getWidth() - C.getWidth(), B.getHeight());
        D.setLayout(new CardLayout()); // Jika menggunakan CardLayout

        // Panel E (Profile user di dalam Panel C)
        JPanel E = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon icon = new ImageIcon("images/image.jpg");
                g.drawImage(icon.getImage(), 0, 0, getWidth(), getHeight(), this);

                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                // Tambahkan bayangan
                g2d.setColor(new Color(0, 0, 0, 0));
                g2d.fillRoundRect(5, 5, getWidth() - 10, getHeight() - 10, 20, 20);
            }
        };
        E.setBounds((C.getWidth() - 100) / 2, (C.getHeight() - 100) / 16, 100, 100);
        E.setLayout(null);

        JLabel C1Label = new JLabel("USER");
        C1Label.setFont(new Font("Arial", Font.BOLD, 20));
        C1Label.setForeground(Color.WHITE);
        C1Label.setBounds((C.getWidth() - C1Label.getPreferredSize().width) / 2, (C.getHeight() - C1Label.getPreferredSize().height) / 5, 130, 30);
        C.add(C1Label);

        // Sidebar panel
        JPanel F = new JPanel();
        F.setLayout(new BoxLayout(F, BoxLayout.Y_AXIS));
        F.setBackground(Color.DARK_GRAY);
        F.setBounds((C.getWidth() - (C.getWidth() * 2 / 3)) / 2 - 25, (C.getHeight() - 100) / 3, C.getWidth() - 20, C.getHeight() / 2);

        // Tambahkan tombol sidebar
        JButton btnHome = createSidebarButton("Home");
        JButton btnPerawatanHewan = createSidebarButton("Perawatan Hewan");
        JButton btnPenitipanHewan = createSidebarButton("Penitipan Hewan");
        JButton btnStatusPelayanan = createSidebarButton("Status Pelayanan");
        JButton btnStatusPembayaran = createSidebarButton("Status Pembayaran");
        JButton btnHistory = createSidebarButton("History");

        // Tambahkan tombol dan sub-menu ke sidebar
        F.add(btnHome);
        F.add(btnPerawatanHewan);
        F.add(btnPenitipanHewan);
        F.add(btnStatusPelayanan);
        F.add(btnStatusPembayaran);
        F.add(btnHistory);

        // Tambahkan sidebar ke panel A
        C.add(F);

        // Panel konten
        cardLayout = new CardLayout();
        contentPanel = new JPanel(cardLayout);

        contentPanel.setPreferredSize(new Dimension(D.getWidth() - 100, D.getHeight() - 100));
        D.add(contentPanel);

        // Tambahkan halaman konten
        contentPanel.add(createHomePage(), "Home");
        contentPanel.add(createPerawatanHewanPage(), "Perawatan Hewan");
        contentPanel.add(createPenitipanHewanPage(), "Penitipan Hewan");
        contentPanel.add(createStatusPelayananPage(), "StatusPelayanan");
        contentPanel.add(createStatusPembayaranPage(), "StatusPembayaran");
        contentPanel.add(createHistoryPage(), "History");

        JButton exitButton = new JButton("LOGOUT");
        exitButton.setBounds((C.getWidth() - 100) / 2, (C.getHeight() - 80), 100, 40); // Ukuran dan posisi tombol
        exitButton.setBackground(new Color(255, 0, 0)); // Warna tombol merah
        exitButton.setForeground(Color.WHITE); // Warna teks putih
        exitButton.setFocusPainted(false);
        exitButton.setFont(new Font("Arial", Font.BOLD, 14));

        // Tambahkan aksi untuk keluar program
        exitButton.addActionListener(e -> {
            dispose();
            new LoginPage().setVisible(true);
        });
        C.add(exitButton);

        contentPanel.add(createHomePage(), "Home");
        contentPanel.add(createPerawatanHewanPage(), "Perawatan Hewan");
        contentPanel.add(createPenitipanHewanPage(), "Penitipan Hewan");
        contentPanel.add(createStatusPelayananPage(), "Status Pelayanan");
        contentPanel.add(createStatusPembayaranPage(), "Status Pembayaran");
        contentPanel.add(createHistoryPage(), "History");

        btnHome.addActionListener(e -> cardLayout.show(contentPanel, "Home"));
        btnPerawatanHewan.addActionListener(e -> cardLayout.show(contentPanel, "Perawatan Hewan"));
        btnPenitipanHewan.addActionListener(e -> cardLayout.show(contentPanel, "Penitipan Hewan"));
        btnStatusPelayanan.addActionListener(e -> cardLayout.show(contentPanel, "Status Pelayanan"));
        btnStatusPembayaran.addActionListener(e -> cardLayout.show(contentPanel, "Status Pembayaran"));
        btnHistory.addActionListener(e -> cardLayout.show(contentPanel, "History"));

        // Menambahkan komponen ke masing-masing panel
        C.add(E);
        B.add(D);
        B.add(C);
        A.add(B);

        // Menambahkan panel A ke frame
        add(A);

        setVisible(true);
    }

    private JButton createSidebarButton(String text) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.LEFT_ALIGNMENT); // Rata kiri untuk tombol dalam BoxLayout
        button.setPreferredSize(new Dimension(100, 40));
        button.setMaximumSize(new Dimension(200, 40)); // Ukuran tombol
        button.setFocusPainted(false);                // Hilangkan fokus saat dipilih
        button.setBackground(new Color(70, 70, 70));  // Warna tombol
        button.setForeground(Color.WHITE);            // Warna teks
        button.setFont(new Font("Arial", Font.PLAIN, 16)); // Font teks
        button.setHorizontalAlignment(SwingConstants.LEFT); // Teks berada di kiri tombol
        return button;
    }

    // Halaman konten untuk "Home"
    private JPanel createHomePage() {
        // Panel utama dengan layout BorderLayout untuk membagi dua bagian kiri dan kanan
        JPanel panelA = new JPanel(new BorderLayout());
    
        JPanel A1 = new JPanel();
        A1.setBackground(Color.LIGHT_GRAY);
        JLabel label1 = new JLabel("HOME");
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setForeground(Color.BLACK);
        A1.add(label1, BorderLayout.CENTER);
    
        JPanel A2 = new JPanel();
        A2.setBackground(Color.LIGHT_GRAY);
        JLabel label2 = new JLabel("PET KLINIK");
        label2.setFont(new Font("Arial", Font.BOLD, 24));
        label2.setForeground(Color.BLACK);
        A2.add(label2, BorderLayout.CENTER);
    
        JPanel A3 = new JPanel(new BorderLayout());
        A3.setBackground(Color.ORANGE);
 
        JLabel label3 = new JLabel("JAM LAYANAN", SwingConstants.CENTER);
        label3.setFont(new Font("Arial", Font.BOLD, 18));
        label3.setForeground(Color.BLACK);
        label3.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        A3.add(label3, BorderLayout.NORTH);

        JTextArea textJam = new JTextArea(" SENIN : 09:00 - 20:00 \n SELASA : 09:00 - 20:00 \n RABU : 09:00 - 20:00 \n KAMIS : 09:00 - 20:00 \n JUMAT : 09:00 - 20:00 \n SABTU : 09:00 - 20:00 \n ");
        textJam.setEditable(false);
        textJam.setFont(new Font("Arial", Font.PLAIN, 14));
        textJam.setMargin(new Insets(10, 10, 10, 10));
        A3.add(textJam, BorderLayout.CENTER);
 
        // Panel Jadwal Dokter
        JPanel A4 = new JPanel(new BorderLayout());
        A4.setBackground(Color.ORANGE);

        JLabel label4 = new JLabel("JADWAL DOKTER", SwingConstants.CENTER);
        label4.setFont(new Font("Arial", Font.BOLD, 18));
        label4.setForeground(Color.BLACK);
        label4.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        A4.add(label4, BorderLayout.NORTH);
 
        JTextArea textJadwalDokter = new JTextArea("Dokter 1: 09:00 - 12:00\nDokter 2: 13:00 - 17:00");
        textJadwalDokter.setEditable(false);
        textJadwalDokter.setFont(new Font("Arial", Font.PLAIN, 14));
        textJadwalDokter.setMargin(new Insets(10, 10, 10, 10));
        A4.add(textJadwalDokter, BorderLayout.CENTER);

        JPanel panelTengah = new JPanel(new GridLayout(1, 2, 10, 0));
        panelTengah.setBackground(Color.GRAY);
        panelTengah.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Padding di sekitar grid

        // Menambahkan panel A3 dan panelJadwalDokter ke panel tengah
        panelTengah.add(A3);
        panelTengah.add(A4);
 
        // Menambahkan panel-panel ke frame
        panelA.add(A1, BorderLayout.NORTH);
        panelA.add(A2, BorderLayout.SOUTH);
        panelA.add(panelTengah, BorderLayout.CENTER);
    
        return panelA;
    }    

    // Halaman konten untuk "Pelayanan Hewan"
    private JPanel createPerawatanHewanPage() {
        // Panel utama dengan layout BorderLayout untuk membagi dua bagian kiri dan kanan
        JPanel panelB = new JPanel(new BorderLayout());
    
        JPanel B1 = new JPanel();
        B1.setBackground(Color.LIGHT_GRAY);
        JLabel label1 = new JLabel("PERAWATAN HEWAN");
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setForeground(Color.BLACK);
        B1.add(label1, BorderLayout.CENTER);
    
        JPanel B2 = new JPanel();
        B2.setBackground(Color.LIGHT_GRAY);
        JLabel label2 = new JLabel("PET KLINIK");
        label2.setFont(new Font("Arial", Font.BOLD, 24));
        label2.setForeground(Color.BLACK);
        B2.add(label2, BorderLayout.CENTER);

        panelB.add(B1, BorderLayout.NORTH);
        panelB.add(B2, BorderLayout.SOUTH);

        return panelB;
    }

    // Halaman konten untuk "Pelayanan Hewan"
    private JPanel createPenitipanHewanPage() {
        // Panel utama dengan layout BorderLayout untuk membagi dua bagian kiri dan kanan
        JPanel panelB = new JPanel(new BorderLayout());
    
        JPanel B1 = new JPanel();
        B1.setBackground(Color.LIGHT_GRAY);
        JLabel label1 = new JLabel("PENITIPAN HEWAN");
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setForeground(Color.BLACK);
        B1.add(label1, BorderLayout.CENTER);
    
        JPanel B2 = new JPanel();
        B2.setBackground(Color.LIGHT_GRAY);
        JLabel label2 = new JLabel("PET KLINIK");
        label2.setFont(new Font("Arial", Font.BOLD, 24));
        label2.setForeground(Color.BLACK);
        B2.add(label2, BorderLayout.CENTER);

        panelB.add(B1, BorderLayout.NORTH);
        panelB.add(B2, BorderLayout.SOUTH);

        return panelB;
    }

    // Halaman konten untuk "Status Pelayanan"
    private JPanel createStatusPelayananPage() {
        // Panel utama dengan layout BorderLayout untuk membagi dua bagian kiri dan kanan
        JPanel panelB = new JPanel(new BorderLayout());
    
        JPanel B1 = new JPanel();
        B1.setBackground(Color.LIGHT_GRAY);
        JLabel label1 = new JLabel("STATUS PELAYANAN");
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setForeground(Color.BLACK);
        B1.add(label1, BorderLayout.CENTER);
    
        JPanel B2 = new JPanel();
        B2.setBackground(Color.LIGHT_GRAY);
        JLabel label2 = new JLabel("PET KLINIK");
        label2.setFont(new Font("Arial", Font.BOLD, 24));
        label2.setForeground(Color.BLACK);
        B2.add(label2, BorderLayout.CENTER);

        panelB.add(B1, BorderLayout.NORTH);
        panelB.add(B2, BorderLayout.SOUTH);

        return panelB;
    }

    // Halaman konten untuk "Pembayaran"
    private JPanel createStatusPembayaranPage() {
        // Panel utama dengan layout BorderLayout untuk membagi dua bagian kiri dan kanan
        JPanel panelB = new JPanel(new BorderLayout());
    
        JPanel B1 = new JPanel();
        B1.setBackground(Color.LIGHT_GRAY);
        JLabel label1 = new JLabel("STATUS PEMBAYARAN");
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setForeground(Color.BLACK);
        B1.add(label1, BorderLayout.CENTER);
    
        JPanel B2 = new JPanel();
        B2.setBackground(Color.LIGHT_GRAY);
        JLabel label2 = new JLabel("PET KLINIK");
        label2.setFont(new Font("Arial", Font.BOLD, 24));
        label2.setForeground(Color.BLACK);
        B2.add(label2, BorderLayout.CENTER);

        panelB.add(B1, BorderLayout.NORTH);
        panelB.add(B2, BorderLayout.SOUTH);

        return panelB;
    }

    // Halaman konten untuk "History"
    private JPanel createHistoryPage() {
        // Panel utama dengan layout BorderLayout untuk membagi dua bagian kiri dan kanan
        JPanel panelB = new JPanel(new BorderLayout());
    
        JPanel B1 = new JPanel();
        B1.setBackground(Color.LIGHT_GRAY);
        JLabel label1 = new JLabel("HISTORY");
        label1.setFont(new Font("Arial", Font.BOLD, 24));
        label1.setForeground(Color.BLACK);
        B1.add(label1, BorderLayout.CENTER);
    
        JPanel B2 = new JPanel();
        B2.setBackground(Color.LIGHT_GRAY);
        JLabel label2 = new JLabel("PET KLINIK");
        label2.setFont(new Font("Arial", Font.BOLD, 24));
        label2.setForeground(Color.BLACK);
        B2.add(label2, BorderLayout.CENTER);

        panelB.add(B1, BorderLayout.NORTH);
        panelB.add(B2, BorderLayout.SOUTH);

        return panelB;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainPage::new);
    }
}
