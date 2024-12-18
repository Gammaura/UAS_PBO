package Pertemuan12.SoalNo1;

class Dosen {
    private String nik;
    private String nama;

    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public void view() {
        System.out.println("NIK : " + nik);
        System.out.println("NAMA : " + nama);
    }
}

// Subclass: Rektor
class Rektor extends Dosen {
    private int tahunMasuk;

    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void viewRektor() {
        view();
        System.out.println("TAHUN MASUK : " + tahunMasuk);
    }
}

// Subclass: Dekan
class Dekan extends Dosen {
    private String fakultas;

    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void viewDekan() {
        view();
        System.out.println("FAKULTAS : " + fakultas);
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        // Object Dosen
        Dosen dosen = new Dosen("101", "ARDITYA ADJIE ROSANDI");
        System.out.println("==|| DATA DOSEN ||==");
        dosen.view();
        System.out.println();

        // Object Rektor
        Rektor rektor = new Rektor("102", "DHCIKY HARYADI SUPRIYONO", 2022);
        System.out.println("==|| DATA REKTOR ||==");
        rektor.viewRektor();
        System.out.println();

        // Object Dekan
        Dekan dekan = new Dekan("103", "AVRIAN RIZKY MAULANA", "ILMU KOMPUTER");
        System.out.println("==|| DATA DEKAN ||==");
        dekan.viewDekan();
    }
}
