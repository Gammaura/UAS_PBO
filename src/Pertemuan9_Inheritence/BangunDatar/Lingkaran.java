package Pertemuan9_Inheritence.BangunDatar;

class Lingkaran extends BangunDatar {
    float r;
    final float PI = 3.14f;

    @Override
    float luas() {
        // Menghitung luas lingkaran dan mengembalikan hasilnya sebagai float
        float hasil = PI * r * r;
        System.out.println("LUAS LINGKARAN : " + hasil);
        return hasil;
    }

    @Override
    float keliling() {
        // Menghitung keliling lingkaran dan mengembalikan hasilnya sebagai float
        float hasil = 2 * PI * r;
        System.out.println("KELILING LINGKARAN : " + hasil);
        System.out.println();
        return hasil;
    }
}
