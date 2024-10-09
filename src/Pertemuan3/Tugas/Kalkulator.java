package Pertemuan3;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.print("\033[H\033[2J");

            System.out.print("\nNAMA : ARDITYA ADJIE ROSANDI");
            System.out.print("\nNIM  : 20230801274");

            int menu, pilihan;
            double a, b;
            double hasil;

            System.out.println("\nKALKULATOR BY GAMMAURA");
            System.out.println("\n1. KALKULATOR A");
            System.out.println("2. KALKULATOR B");
            System.out.println("\n0. KELUAR");

            System.out.print("\nMASUKKAN PILIHAN : ");
            menu = input.nextInt();

            if (menu == 1) {

                System.out.print("\033[H\033[2J");

                System.out.println("\nKALKULATOR A");
                System.out.println("\n1. PENJUMLAHAN");
                System.out.println("2. PENGURANGAN");
                System.out.println("3. PERKALIAN");
                System.out.println("4. PEMBAGIAN");

                System.out.print("\nMASUKKAN PILIHAN : ");
                pilihan = input.nextInt();

                    if (pilihan == 1) {

                        System.out.print("\033[H\033[2J");

                        System.out.println("\nKALKULATOR PENJUMLAHAN");
                        System.out.print("\nMASUKKAN ANGKA PERTAMA : ");
                        a = input.nextDouble();
                        System.out.print("MASUKKAN ANGKA KEDUA   : ");
                        b = input.nextDouble();

                        hasil = a + b;

                        System.out.print("\nHASIL PENJUMLAHAN = ");
                        System.out.println(hasil);
                        
                        System.out.print("\nKETIK ANGKA APA SAJA UNTUK MELANJUTKAN : ");
                        input.nextInt();

                    }

                    if (pilihan == 2) {

                        System.out.print("\033[H\033[2J");
                        
                        System.out.println("\nKALKULATOR PENGURANGAN");
                        System.out.print("\nMASUKKAN ANGKA PERTAMA : ");
                        a = input.nextDouble();
                        System.out.print("MASUKKAN ANGKA KEDUA   : ");
                        b = input.nextDouble();

                        hasil = a - b;

                        System.out.print("\nHASIL PENGURANGAN = ");
                        System.out.println(hasil);

                        System.out.print("\nKETIK ANGKA APA SAJA UNTUK MELANJUTKAN : ");
                        input.nextInt();

                    }

                    if (pilihan == 3) {

                        System.out.print("\033[H\033[2J");

                        System.out.println("\nKALKULATOR PERKALIAN");
                        System.out.print("\nMASUKKAN ANGKA PERTAMA : ");
                        a = input.nextDouble();
                        System.out.print("MASUKKAN ANGKA KEDUA   : ");
                        b = input.nextDouble();

                        hasil = a * b;

                        System.out.print("\nHASIL PERKALIAN = ");
                        System.out.println(hasil);

                        System.out.print("\nKETIK ANGKA APA SAJA UNTUK MELANJUTKAN : ");
                        input.nextInt();

                    }

                    if (pilihan == 4) {

                        System.out.print("\033[H\033[2J");

                        System.out.println("\nKALKULATOR PEMBAGIAN");
                        System.out.print("\nMASUKKAN ANGKA PERTAMA : ");
                        a = input.nextDouble();
                        System.out.print("MASUKKAN ANGKA KEDUA   : ");
                        b = input.nextDouble();

                        hasil = a / b;

                            if (b == 0) {
                                System.out.println("\nHASIL PEMBAGIAN = TAK HINGGA");
                            }

                            else {
                                System.out.print("\nHASIL PEMBAGIAN = ");
                                System.out.println(hasil);
                            }

                        System.out.print("\nKETIK ANGKA APA SAJA UNTUK MELANJUTKAN : ");
                        input.nextInt();

                    }

                    continue;
   
            }

            if (menu == 2) {

                System.out.print("\033[H\033[2J");

                System.out.println("\nKALKULATOR B");
                System.out.print("\nMASUKKAN ANGKA PERTAMA : ");
                double angka1 = input.nextDouble();

                System.out.println("\n(TAMBAH GUNAKAN => (+)");
                System.out.println("(KURANG GUNAKAN => (-)");
                System.out.println("(KALI GUNAKAN => (*)");
                System.out.println("(BAGI GUNAKAN => (/)");
                System.out.print("\nMASUKKAN OPERATOR : ");
                char operator = input.next().charAt(0);

                System.out.print("\nMASUKKAN ANGKA KEDUA : ");
                double angka2 = input.nextDouble();

                switch (operator) {

                    case '+':
                        hasil = angka1 + angka2;
                        System.out.println("\nHASIL PENJUMLAHAN : " + hasil);
                        System.out.print("\nKETIK ANGKA APA SAJA UNTUK MELANJUTKAN : ");
                        input.nextInt();
                        break;

                    case '-':
                        hasil = angka1 - angka2;
                        System.out.println("\nHASIL PENGURANGAN : " + hasil);
                        System.out.print("\nKETIK ANGKA APA SAJA UNTUK MELANJUTKAN : ");
                        input.nextInt();
                        break;

                    case '*':
                        hasil = angka1 * angka2;
                        System.out.println("\nHASIL PERKALIAN : " + hasil);
                        System.out.print("\nKETIK ANGKA APA SAJA UNTUK MELANJUTKAN : ");
                        input.nextInt();
                        break;

                    case '/':
                        if (angka2 == 0) {
                            System.out.println("\nHASIL PEMBAGIAN = TAK HINGGA");
                            System.out.print("\nKETIK ANGKA APA SAJA UNTUK MELANJUTKAN : ");
                            input.nextInt();
                        }

                        else if (angka2 != 0) {
                            hasil = angka1 / angka2;
                            System.out.println("\nHASIL PEMBAGIAN : " + hasil);
                            System.out.print("\nKETIK ANGKA APA SAJA UNTUK MELANJUTKAN : ");
                            input.nextInt();
                        } 
                        
                        break;

                    default:
                        System.out.println("OPERATOR TIDAK TERSEDIA");
                }

            } 
            
            if (menu == 0) {
                System.out.println("\nPROGRAM SELESAI, TERIMAKASIH >_<");
                break;
            } 
            
            else {
                System.out.println("PILIHAN TIDAK TERSEDIA");
            }
        }

        input.close();
    }
}
