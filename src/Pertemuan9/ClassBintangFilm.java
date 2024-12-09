package Pertemuan9;

// Membuat Class dengan nama BintangFilm
class BintangFilm {
    // atributnya
    private String nama;
    private Boolean pria;

    // konstruktor : fungsi yang dijalankan ketika objek diciptakan
    BintangFilm(String nama, Boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    // Method tanpa return dengan parameter
    @SuppressWarnings("unused")
    private void Isikan(String nama, Boolean pria) {
        this.nama = nama; // this adalah objek sekarang
        this.pria = pria;
    }

    // method dengan return tanpa parameter
    String perolehNama() {
        return (nama);
    }

    // Memperoleh Jenis Kelamin dengan tanpa parameter
    String perolehJenisKelamin() {
        if (pria) {
            return "PRIA";
        } else {
            return "WANITA";
        }
    }
}

public class ClassBintangFilm {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        // buat dua objek BintangFilm siA dan siB
        BintangFilm siA = new BintangFilm("BUDI", true);
        BintangFilm siB = new BintangFilm("HANI", false);

        // Menampilkan objek siA dan siB
        System.out.println("siA => " + siA.perolehNama() + ", " + siA.perolehJenisKelamin());
        System.out.println("siB => " + siB.perolehNama() + ", " + siB.perolehJenisKelamin());
    }
}
