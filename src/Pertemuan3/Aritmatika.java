package Pertemuan3;

public class Aritmatika {
    public static void main(String[] args) {
        //Sedikit angka
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;

        System.out.print("\033[H\033[2J");
        
        System.out.println("NILAI VARIABEL");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);

        //Penjumlahan angka
        System.out.println("\nPENJUMLAHAN");
        System.out.println(" i + j = " + (i + j));
        System.out.println(" x + y = " + (x + y));

        //Pengurangan angka
        System.out.println("\nPENGURANGAN");
        System.out.println(" i - j = " + (i - j));
        System.out.println(" x - y = " + (x - y));

        //Perkalian angka
        System.out.println("\nPERKALIAN");
        System.out.println(" i * j = " + (i * j));
        System.out.println(" x * y = " + (x * y));

        //Pembagian angka
        System.out.println("\nPEMBAGIAN");
        System.out.println(" i / j = " + (i / j));
        System.out.println(" x / y = " + (x / y));

        //Menghitung hasil modulus dari pembagian
        System.out.println("\nMODULUS");
        System.out.println(" i % j = " + (i % j));
        System.out.println(" x % y = " + (x % y));

        //Tipe penggabungan
        System.out.println("\nPENGGABUNGAN");
        System.out.println(" i + j = " + (j + y));
        System.out.println(" i * x = " + (i * x));
    }
}