package Pertemuan6.Tugas;

import java.util.Scanner;

class BangunDatar {
    // Atribut untuk bangun datar
    double sisi, panjang, lebar, jariJari, alas, tinggi;

    // Konstruktor untuk persegi
    BangunDatar(double sisi) {
        this.sisi = sisi;
    }

    // Konstruktor untuk persegi panjang
    BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Konstruktor untuk lingkaran
    BangunDatar(double jariJari, boolean isLingkaran) {
        this.jariJari = jariJari;
    }

    // Konstruktor untuk segitiga
    BangunDatar(double alas, double tinggi, boolean isSegitiga) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Metode untuk menghitung luas persegi
    double luasPersegi() {
        return sisi * sisi;
    }

    // Metode untuk menghitung luas persegi panjang
    double luasPersegiPanjang() {
        return panjang * lebar;
    }

    // Metode untuk menghitung luas lingkaran
    double luasLingkaran() {
        return Math.PI * jariJari * jariJari;
    }

    // Metode untuk menghitung luas segitiga
    double luasSegitiga() {
        return 0.5 * alas * tinggi;
    }
}

public class ProgramBangunDatar {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        Scanner input = new Scanner(System.in);

        System.out.println("PILIH BANGUN DATAR UNTUK MENGHITUNG LUAS");
        System.out.println("\n1. LUAS PERSEGI");
        System.out.println("2. LUAS PERSEGI PANJANG");
        System.out.println("3. LUAS LINGKARAN");
        System.out.println("4. LUAS SEGITIGA");
        System.out.print("\nMASUKKAN PILIHAN : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("\033[H\033[2J");
                
                System.out.print("MASUKKAN PANJANG SISI PERSEGI : ");
                double sisiPersegi = input.nextDouble();
                BangunDatar persegi = new BangunDatar(sisiPersegi);
                System.out.println("LUAS PERSEGI : " + persegi.luasPersegi());
                break;

            case 2:
                System.out.print("\033[H\033[2J");

                System.out.print("MASUKKAN PANJANG PERSEGI PANJANG : ");
                double panjang = input.nextDouble();
                System.out.print("MASUKKAN LEBAR PERSEGI PANJANG : ");
                double lebar = input.nextDouble();
                BangunDatar persegiPanjang = new BangunDatar(panjang, lebar);
                System.out.println("LUAS PERSEGI PANJANG : " + persegiPanjang.luasPersegiPanjang());
                break;

            case 3:
                System.out.print("\033[H\033[2J");

                System.out.print("MASUKKAN JARI-JARI LINGKARAN : ");
                double jariJariLingkaran = input.nextDouble();
                BangunDatar lingkaran = new BangunDatar(jariJariLingkaran, true);
                System.out.println("LUAS LINGKARAN : " + lingkaran.luasLingkaran());
                break;

            case 4:
                System.out.print("\033[H\033[2J");

                System.out.print("MASUKKAN PANJANG ALAS SEGITIGA : ");
                double alas = input.nextDouble();
                System.out.print("MASUKKAN TINGGI SEGITIGA : ");
                double tinggiSegitiga = input.nextDouble();
                BangunDatar segitiga = new BangunDatar(alas, tinggiSegitiga, true);
                System.out.println("LUAS SEGITIGA : " + segitiga.luasSegitiga());
                break;

            default:
                System.out.println("PILIHAN TIDAK VALID.");
                break;
        }

        input.close();
    }
}
