package Pertemuan4.Tugas;

import java.util.Scanner;

public class TiketKereta{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Menu;
        
        @SuppressWarnings("unused")
        String Back;
        String Pilihan;

        while (true) {

            System.out.print("\033[H\033[2J");

            System.out.println("NAMA : ARDITYA ADJIE ROSANDI");
            System.out.println("NIM  : 20230801274");

            System.out.println("\n==========================================");
            System.out.println("||  SELAMAT DATANG DI STASIUN GAMMAURA  ||");
            System.out.println("==========================================");
            System.out.println("|| 1. MENAMPILKAN DAFTAR TIKET          ||");
            System.out.println("|| 2. MENAMPILKAN JADWAL KEBERANGKATAN  ||");
            System.out.println("|| 3. PEMESANAN TIKET SECARA ONLINE     ||");
            System.out.println("||                                      ||");
            System.out.println("|| 0. KELUAR DARI PROGRAM               ||");
            System.out.println("==========================================");
            System.out.println("||    TANGERANG     |     YOGYAKARTA    ||");
            System.out.println("==========================================");

            System.out.print("\nMASUKKAN PILIHAN : ");
            Menu = scanner.nextInt();

            if (Menu == 1) {

                System.out.print("\033[H\033[2J");

                System.out.println("==================================================");
                System.out.println("||     DAFTAR TIKET KERETA STASIUN GAMMAURA     ||");
                System.out.println("==================================================");
                System.out.println("||  1. EKONOMI                    (RP 100.000)  ||");
                System.out.println("||  2. BISNIS                     (RP 200.000)  ||");
                System.out.println("||  3. EKSEKUTIF                  (RP 300.000)  ||");
                System.out.println("==================================================");
                System.out.println("||  PROMO :                                     ||");
                System.out.println("||                                              ||");
                System.out.println("||  DISKON 10% : UNTUK PEMBELIAN                ||");
                System.out.println("||               MINIMAL Rp 1.000.000           ||");
                System.out.println("||                                              ||");
                System.out.println("||  DISKON 5%  : UNTUK PEMBELIAN                ||");
                System.out.println("||               MINIMAL Rp 500.000             ||");
                System.out.println("||                                              ||");
                System.out.println("||  DISKON 2%  : UNTUK PEMBELIAN                ||");
                System.out.println("||               MINIMAL Rp 250.000             ||");
                System.out.println("==================================================");

                System.out.print("\nKETIK APA SAJA UNTUK KEMBALI : ");
                Back = scanner.next();
                continue;

            } 
            
            if (Menu == 2) {

                System.out.print("\033[H\033[2J");

                System.out.println("==================================================");
                System.out.println("||        JADWAL KERETA STASIUN GAMMAURA        ||");
                System.out.println("==================================================");
                System.out.println("||  KELAS EKONOMI :                             ||");
                System.out.println("||  G-1010 = 06.00 WIB, TIBA 12.00 WIB          ||");
                System.out.println("||  G-1011 = 09.00 WIB, TIBA 15.00 WIB          ||");
                System.out.println("||  G-1012 = 12.00 WIB, TIBA 18.00 WIB          ||");
                System.out.println("||  G-1013 = 15.00 WIB, TIBA 21.00 WIB          ||");
                System.out.println("||  G-1014 = 18.00 WIB, TIBA 24.00 WIB          ||");
                System.out.println("||                                              ||");
                System.out.println("||  KELAS BISNIS :                              ||");
                System.out.println("||  G-2010 = 07.00 WIB, TIBA 13.00 WIB          ||");
                System.out.println("||  G-2011 = 10.00 WIB, TIBA 16.00 WIB          ||");
                System.out.println("||  G-2012 = 13.00 WIB, TIBA 19.00 WIB          ||");
                System.out.println("||  G-2013 = 16.00 WIB, TIBA 22.00 WIB          ||");
                System.out.println("||  G-2014 = 19.00 WIB, TIBA 01.00 WIB          ||");
                System.out.println("||                                              ||");
                System.out.println("||  KELAS EKSEKUTIF :                           ||");
                System.out.println("||  G-3010 = 08.00 WIB, TIBA 14.00 WIB          ||");
                System.out.println("||  G-3011 = 11.00 WIB, TIBA 17.00 WIB          ||");
                System.out.println("||  G-3012 = 14.00 WIB, TIBA 20.00 WIB          ||");
                System.out.println("||  G-3013 = 17.00 WIB, TIBA 23.00 WIB          ||");
                System.out.println("||  G-3014 = 20.00 WIB, TIBA 02.00 WIB          ||");
                System.out.println("==================================================");

                System.out.print("\nKETIK APA SAJA UNTUK KEMBALI : ");
                Back = scanner.next();
                continue;

            } 
            
            if (Menu == 3) {

                int Ekonomi = 100000;
                int Bisnis = 200000;
                int Eksekutif = 300000;

                String Nama;

                int JenisTiket;
                int Jumlah;
                int JumlahEkonomi = 0;
                int JumlahBisnis = 0;
                int JumlahEksekutif = 0;

                int Total = 0;
                int Diskon = 0;

                System.out.print("\033[H\033[2J");

                System.out.println("==================================================");
                System.out.println("||     DAFTAR TIKET KERETA STASIUN GAMMAURA     ||");
                System.out.println("==================================================");
                System.out.println("||  1. EKONOMI                    (RP 100.000)  ||");
                System.out.println("||  2. BISNIS                     (RP 200.000)  ||");
                System.out.println("||  3. EKSEKUTIF                  (RP 300.000)  ||");
                System.out.println("==================================================");
                System.out.println("||    PEMESANAN TIKET ONLINE STASIUN GAMMAURA   ||");
                System.out.println("==================================================");

                System.out.print("\nMASUKKAN NAMA PEMESAN : ");
                Nama = scanner.next();

                while (true) {

                    System.out.print("\nMASUKKAN JENIS TIKET (1/2/3) : ");
                    JenisTiket = scanner.nextInt();
                
                        if (JenisTiket == 1) {
                            System.out.print("MASUKKAN JUMLAH TIKET EKONOMI : ");
                            Jumlah = scanner.nextInt();
                            JumlahEkonomi += Jumlah;
                        }

                        if (JenisTiket == 2) {
                            System.out.print("MASUKKAN JUMLAH TIKET BISNIS : ");
                            Jumlah = scanner.nextInt();
                            JumlahBisnis += Jumlah;
                        }

                        if (JenisTiket == 3) {
                            System.out.print("MASUKKAN JUMLAH TIKET EKSEKUTIF : ");
                            Jumlah = scanner.nextInt();
                            JumlahEksekutif += Jumlah;
                        }

                    System.out.print("\nAPAKAH INGIN MEMESAN TIKET LAGI? (Y/N) : ");
                    Pilihan = scanner.next();

                        if (Pilihan.equals("Y")) {
                            continue;
                        }

                        if (Pilihan.equals("N")) {
                            break;
                        }

                }

                Total = (Ekonomi * JumlahEkonomi) + (Bisnis * JumlahBisnis) + (Eksekutif * JumlahEksekutif);

                System.out.println("\nPESANAN ATAS NAMA : " + Nama);
                System.out.println("\nANDA MEMESAN : ");
                if (JumlahEkonomi > 0) {
                    System.out.println(JumlahEkonomi + " TIKET EKONOMI");
                }
                if (JumlahBisnis > 0) {
                    System.out.println(JumlahBisnis + " TIKET BISNIS");
                }
                if (JumlahEksekutif > 0) {
                    System.out.println(JumlahEksekutif + " TIKET EKSEKUTIF");
                }

                System.out.println("\nTOTAL HARGA : RP " + Total);

                if (Total >= 1000000) {
                    Diskon = Total * 90 / 100;
                    System.out.println("ANDA MENDAPAT DISKON SEBESAR 10%, ANDA HANYA PERLU MEMBAYAR SEBESAR RP " + Diskon);
                } 
                
                else if (Total >= 500000) {
                    Diskon = Total * 95 / 100;
                    System.out.println("ANDA MENDAPAT DISKON SEBESAR 5%, ANDA HANYA PERLU MEMBAYAR SEBESAR RP " + Diskon);
                } 
                
                else if (Total >= 250000) {
                    Diskon = Total * 98 / 100;
                    System.out.println("ANDA MENDAPAT DISKON SEBESAR 2%, ANDA HANYA PERLU MEMBAYAR SEBESAR RP " + Diskon);
                }

                System.out.print("\nKETIK APA SAJA UNTUK KEMBALI : ");
                Back = scanner.next();

                JumlahEkonomi = 0;
                JumlahBisnis = 0;
                JumlahEksekutif = 0;

                continue;

            } 
            
            if (Menu == 0) {
                System.out.print("TERIMAKASIH ...");
                break;
            } 
            
            else {
                continue;
            }
        }

        scanner.close();
    }
    
}