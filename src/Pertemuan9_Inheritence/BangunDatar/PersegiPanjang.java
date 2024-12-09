package Pertemuan9_Inheritence.BangunDatar;

class PersegiPanjang extends BangunDatar {
    float panjang, lebar;

    @Override
    float luas() {
        // Menghitung luas persegi panjang dan mengembalikan hasilnya sebagai float
        float hasil = panjang * lebar;
        System.out.println("LUAS PERSEGI PANJANG : " + hasil);
        return hasil;
    }

    @Override
    float keliling() {
        // Menghitung keliling persegi panjang dan mengembalikan hasilnya sebagai float
        float hasil = 2 * (panjang + lebar);
        System.out.println("KELILING PERSEGI PANJANG : " + hasil);
        System.out.println();
        return hasil;
    }
}
