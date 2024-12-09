package Pertemuan10.Inheritence.Pegawai;

public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        
        // Membuat objek berdasarkan class
        Manager manager = new Manager();
        Kasir kasir = new Kasir();
        Koki koki = new Koki();
        Pelayan pelayan = new Pelayan();
        Satpam satpam = new Satpam();

        // Memasukkan nilai variabel menggunakan objek
        manager.nama = "SYIFA";
        manager.id_pegawai = 1;
        manager.gaji = "7 JUTA";

        kasir.nama = "ALDI";
        kasir.id_pegawai = 2;
        kasir.gaji = "3 JUTA";

        koki.nama = "REZA";
        koki.id_pegawai = 3;
        koki.gaji = "2 JUTA";

        pelayan.nama = "DEAN";
        pelayan.id_pegawai = 4;
        pelayan.gaji = "1,2 JUTA";

        satpam.nama = "DIKI";
        satpam.id_pegawai = 5;
        satpam.gaji = "3 JUTA";

        // Menjalankan fungsi pada superclass

        manager.menampilkan();
        manager.tugas();

        kasir.menampilkan();
        kasir.tugas();

        koki.menampilkan();
        koki.tugas();

        pelayan.menampilkan();
        pelayan.tugas();

        satpam.menampilkan();
        satpam.tugas();
    }
}
