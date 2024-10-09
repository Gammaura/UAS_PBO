package Pertemuan4;

import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        Scanner input = new Scanner(System.in); 
        int jumlahNilai = 0;
        double totalNilai = 0;
        char lanjut;

        do {
            System.out.print("MASUKKAN NILAI : ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
            jumlahNilai++;

            System.out.print("APAKAH ANDA INGIN MEMASUKKAN NILAI LAIN? (Y/N) : ");
            lanjut = input.next().charAt(0);

        } while (lanjut == 'y' || lanjut == 'Y');

        double ratarata = totalNilai / jumlahNilai;
        System.out.println("RATA-RATA NILAI : " + ratarata);

        input.close();

    }
}