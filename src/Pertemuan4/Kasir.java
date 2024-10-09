package Pertemuan4;

import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        //deklarasi variabel dan Scanner
        int belanjaan, diskon, bayar;
        String kartu;
        Scanner scan = new Scanner(System.in);
        //mengambil input
        System.out.print("APAKAH MEMILIKI KARTU MEMBER? (YA/TIDAK) : ");
        kartu = scan.nextLine();
        System.out.print("MASUKKAN TOTAL BELANJA : ");
        belanjaan = scan.nextInt();
        //proses diskon
        if (kartu.equalsIgnoreCase("YA")) {
            if (belanjaan > 500000) {
                diskon = 50000;
            } else if (belanjaan > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else {
            if (belanjaan > 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }
        // close the scanner
        scan.close();
        //total yang harus dibayar
        bayar = belanjaan - diskon;
        //tampilkan total bayar
        System.out.println("TOTAL YANG HARUS DIBAYAR : " + bayar);
    }
}
