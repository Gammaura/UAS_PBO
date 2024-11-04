package Pertemuan7;

class Mahasiswa {
    public String nama;              // Public: bisa diakses dari mana saja
    protected int usia;              // Protected: bisa diakses dari dalam package dan subclass
    private String jurusan;          // Private: hanya bisa diakses dalam kelas ini

    // Constructor
    public Mahasiswa(String nama, int usia, String jurusan) {
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    // Getter untuk atribut private jurusan
    public String getJurusan() {
        return jurusan;
    }

    // Setter untuk atribut private jurusan
    public void setJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }

    // Metode untuk menampilkan informasi
    public void tampilkanInfo() {
        System.out.println("NAMA : " + nama);
        System.out.println("USIA : " + usia);
        System.out.println("JURUSAN : " + jurusan);
    }
}

// Kelas utama untuk menjalankan program
public class MhsTester {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("ANDI", 21, "TEKNIK INFORMATIKA");

        // Mengakses atribut public
        System.out.println("NAMA MAHASISWA : " + mahasiswa1.nama); // Output: Andi

        // Mengakses atribut protected (dapat diakses dalam package yang sama)
        System.out.println("USIA MAHASISWA : " + mahasiswa1.usia); // Output: 21

        // Mengakses atribut private menggunakan getter
        System.out.println("JURUSAN MAHASISWA : " + mahasiswa1.getJurusan()); // Output: Teknik Informatika

        // Mengubah nilai atribut private menggunakan setter
        mahasiswa1.setJurusan("SISTEM INFORMASI");
        System.out.println("JURUSAN MAHASISWA SETELAH DIUBAH : " + mahasiswa1.getJurusan()); // Output: Sistem Informasi

        // Menampilkan informasi lengkap mahasiswa
        mahasiswa1.tampilkanInfo();
    }
}
