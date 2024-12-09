package Pertemuan4_Looping;

import java.util.Scanner;

public class Hadiah {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        //membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        //mengambil input
        System.out.print("MASUKKAN TOTAL BELANJA : RP. ");
        belanja = scan.nextInt();

        //Cek apakah dia belanja di atas 100.000
        if (belanja > 100000) {
            System.out.println("\nSELAMAT, ANDA MENDAPATKAN HADIAH!");
        }
        System.out.println("TERIMA KASIH ...");

        scan.close();
    }
}