package Pertemuan10.PolymorfismeDinamis.Gambar;

public class Cetakgambar extends Bentuk {
    private void tampil(Bentuk[] obj) {
        // Polimorfisme
        // Memanggil method yang sama yaitu method gambar() dan hapus()
        // pada masing-masing class
        for (int i = 0; i < obj.length; i++) {
            obj[i].gambar();
            obj[i].hapus();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Array objek dari berbagai subclass Bentuk
        Bentuk[] obj = {
            new Lingkaran(),
            new Elips(),
            new Segitiga()
        };

        Cetakgambar cetak = new Cetakgambar();

        // Menampilkan method gambar() & hapus() pada class Bentuk (superclass)
        System.out.println("Memanggil method gambar() dan hapus() pada superclass dan subclass:");
        cetak.tampil(obj);
    }
}

