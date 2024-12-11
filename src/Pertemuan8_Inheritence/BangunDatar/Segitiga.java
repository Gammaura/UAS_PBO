package Pertemuan8_Inheritence.BangunDatar;

class Segitiga extends BangunDatar {
    float alas, tinggi;

    @Override
    float luas() {
        // Menghitung luas segitiga dan mengembalikan hasilnya sebagai float
        float hasil = 0.5f * alas * tinggi;
        System.out.println("LUAS SEGITIGA: " + hasil);
        return hasil;
    }

    @Override
    float keliling() {
        // Keliling segitiga belum didefinisikan dengan lengkap
        System.out.println("KELILING SEGITIGA: BELUM DIDEFINISIKAN (BUTUH SISI-SISI LAIN");
        System.out.println();
        return 0;
    }
}
