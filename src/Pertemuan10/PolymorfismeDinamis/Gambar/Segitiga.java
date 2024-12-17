package Pertemuan10.PolymorfismeDinamis.Gambar;

public class Segitiga extends Bentuk {
    protected void gambar() {
        System.out.println("subclass -> Menggambar Segitiga");
    }

    protected void hapus() {
        System.out.println("subclass -> Menghapus Gambar Segitiga");
    }
}

