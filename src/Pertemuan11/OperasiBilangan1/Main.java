package Pertemuan11.OperasiBilangan1;

public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.println("OPERASI ARTIMATIKA JAVA\n");

        // Nilai A dan B
        double a = 10.5;
        double b = 0.5;

        // Array Operasi
        OperasiBilangan[] operasiArray = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        // Cetak semua operasi
        PrintOperasi cetak = new PrintOperasi();
        cetak.cetakSemua(operasiArray, a, b);
    }   
}
