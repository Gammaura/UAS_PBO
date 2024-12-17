package Pertemuan11.Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        Scanner scanner = new Scanner(System.in);
        FoodMenu menuMakanan = new Makanan();
        FoodMenu menuMinuman = new Minuman();

        double totalHarga = 0;

        System.out.println("\nSELAMAT DATANG DI RESTORAN GAMMAURA!\n");

        boolean selesai = false;
        while (!selesai) {
            // Tampilkan menu utama
            System.out.println("==||==||==||==||==||==||==||==");
            System.out.println("\n  1. PESAN MAKANAN");
            System.out.println("  2. PESAN MINUMAN");
            System.out.println("  3. PEMBAYARAN");
            System.out.println("  4. KELUAR");
            System.out.println("\n==||==||==||==||==||==||==||==");
            System.out.print("\nMASUKKAN PILIHAN : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline setelah nextInt()

            switch (pilihan) {
                case 1:
                    // Pemesanan makanan
                    System.out.print("\033[H\033[2J");
                    System.out.println("==||==|| MENU MAKANAN ||==||==");
                    menuMakanan.tampilkanMenu();
                    System.out.println("\n==||==||==||==||==||==||==||==");
                    System.out.print("\nMASUKKAN NOMOR MENU : ");
                    int nomorMakanan = scanner.nextInt();
                    System.out.print("MASUKKAN JUMLAH : ");
                    int jumlahMakanan = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline

                    switch (nomorMakanan) {
                        case 1:
                            totalHarga += 25000 * jumlahMakanan;
                            System.out.println(jumlahMakanan + " BURGER BERHASIL DITAMBAHKAN!\n");
                            break;
                        case 2:
                            totalHarga += 40000 * jumlahMakanan;
                            System.out.println(jumlahMakanan + " PIZZA BERHASIL DITAMBAHKAN!\n");
                            break;
                        case 3:
                            totalHarga += 20000 * jumlahMakanan;
                            System.out.println(jumlahMakanan + " SANDWICH BERHASIL DITAMBAHKAN!\n");
                            break;
                        default:
                            System.out.println("MENU MAKANAN TIDAK VALID!\n");
                    }
                    break;

                case 2:
                    // Pemesanan minuman
                    System.out.print("\033[H\033[2J");
                    System.out.println("==||==|| MENU MAKANAN ||==||==");
                    menuMinuman.tampilkanMenu();
                    System.out.println("\n==||==||==||==||==||==||==||==");
                    System.out.print("\nMASUKKAN NOMOR MENU : ");
                    int nomorMinuman = scanner.nextInt();
                    System.out.print("MASUKKAN JUMLAH : ");
                    int jumlahMinuman = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline

                    switch (nomorMinuman) {
                        case 1:
                            totalHarga += 15000 * jumlahMinuman;
                            System.out.println(jumlahMinuman + " KOPI BERHASIL DITAMBAHKAN!\n");
                            break;
                        case 2:
                            totalHarga += 10000 * jumlahMinuman;
                            System.out.println(jumlahMinuman + " TEH BERHASIL DITAMBAHKAN!\n");
                            break;
                        case 3:
                            totalHarga += 20000 * jumlahMinuman;
                            System.out.println(jumlahMinuman + " JUS BERHASIL DITAMBAHKAN!\n");
                            break;
                        default:
                            System.out.println("MENU MINUMAN TIDAK VALID!\n");
                    }
                    break;

                case 3:
                    // Pembayaran
                    if (totalHarga == 0) {
                        System.out.println("\nANDA BELUM MEMESAN APAPUN. SILAKAN PESAN TERLEBIH DAHULU.");
                    } else {
                        System.out.println("\nRINCIAN PESANAN ANDA");
                        System.out.println("TOTAL YANG HARUS DIBAYAR : RP " + totalHarga);

                        System.out.print("\nMASUKKAN JUMLAH UANG YANG DIBAYARKAN : RP ");
                        double uangDibayar = scanner.nextDouble();

                        if (uangDibayar >= totalHarga) {
                            double kembalian = uangDibayar - totalHarga;
                            System.out.println("\nPEMBAYARAN BERHASIL!");
                            System.out.println("KEMBALIAN ANDA : RP " + kembalian);
                            selesai = true; // Mengakhiri program setelah pembayaran
                        } else {
                            System.out.println("\nUANG YANG ANDA MASUKKAN TIDAK CUKUP. SILAKAN ULANGI PEMBAYARAN.");
                        }
                    }
                    break;

                case 4:
                    // Keluar dari program
                    System.out.println("\nTERIMA KASIH TELAH BERKUNJUNG KE RESTORAN GAMMAURA!");
                    selesai = true;
                    break;

                default:
                    System.out.println("PILIHAN TIDAK VALID. SILAKAN COBA LAGI.\n");
            }
        }
        scanner.close();
    }
}
