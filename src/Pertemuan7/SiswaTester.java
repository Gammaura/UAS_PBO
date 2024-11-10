package Pertemuan7;

class Siswa {
    private String nama;           // Private: hanya bisa diakses dalam kelas ini
    private int nilaiUjian;        // Private: hanya bisa diakses dalam kelas ini

    // Constructor
    public Siswa(String nama, int nilaiUjian) {
        this.nama = nama;
        setNilaiUjian(nilaiUjian); // Gunakan setter untuk validasi nilai awal
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nilai ujian
    public int getNilaiUjian() {
        return nilaiUjian;
    }

    // Setter untuk nilai ujian
    public void setNilaiUjian(int nilaiUjian) {
        // Validasi nilai (0-100)
        if (nilaiUjian >= 0 && nilaiUjian <= 100) {
            this.nilaiUjian = nilaiUjian;
        } else {
            System.out.println("\nNILAI HARUS ANTARA 0 DAN 100");
        }
    }

    // Metode untuk menampilkan informasi siswa
    public void tampilkanInfo() {
        System.out.println("NAMA SISWA : " + nama);
        System.out.println("NILAI UJIAN : " + nilaiUjian);
    }
}

// Kelas utama untuk menjalankan program
public class SiswaTester {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        // Membuat objek Siswa
        Siswa siswa1 = new Siswa("ANDI", 85);
        siswa1.tampilkanInfo();

        // Menggunakan setter untuk mengubah nama dan nilai ujian
        siswa1.setNama("BUDI");
        siswa1.setNilaiUjian(95);

        // Menampilkan informasi yang telah diperbarui
        System.out.println("\nSETELAH DIUBAH : ");
        siswa1.tampilkanInfo();

        // Menguji validasi dengan memasukkan nilai yang tidak valid
        siswa1.setNilaiUjian(105); // Output: Nilai harus antara 0 dan 100.
    }
}
