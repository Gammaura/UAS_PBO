package Pertemuan9_Inheritence.BangunDatar;

class Persegi extends BangunDatar {
    float sisi;

    @Override
    float luas() {
        // Menghitung luas persegi dan mengembalikan hasilnya sebagai float
        float hasil = sisi * sisi;
        System.out.println("LUAS PERSEGI: " + hasil);
        return hasil;
    }

    @Override
    float keliling() {
        // Menghitung keliling persegi dan mengembalikan hasilnya sebagai float
        float hasil = 4 * sisi;
        System.out.println("KELILING PERSEGI : " + hasil);
        System.out.println();
        return hasil;
    }
}
