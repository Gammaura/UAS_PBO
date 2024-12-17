package Pertemuan11.OperasiBilangan2;

import Pertemuan11.OperasiBilangan2.Abstract.OperasiBilanganAbs;
import Pertemuan11.OperasiBilangan2.Final.OperasiBilanganAbsCetak;
import Pertemuan11.OperasiBilangan2.Polimorfisme.OperasiPembagian;
import Pertemuan11.OperasiBilangan2.Polimorfisme.OperasiPengurangan;
import Pertemuan11.OperasiBilangan2.Polimorfisme.OperasiPenjumlahan;
import Pertemuan11.OperasiBilangan2.Polimorfisme.OperasiPerkalian;

public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.println("OPERASI ARITMATIKA JAVA\n");
        double A = 6.5, B = 0.5;

        // Array untuk polimorfisme
        OperasiBilanganAbs[] operasiBilangan = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        // Final class untuk mencetak
        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(operasiBilangan, A, B);
    }
}
