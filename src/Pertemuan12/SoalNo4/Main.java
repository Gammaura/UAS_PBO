package Pertemuan12.SoalNo4;

// Interface untuk kemampuan hewan
interface Movement {
    void move();
}

interface Flying {
    void fly();
}

// Abstract Class Animal
abstract class Animal {
    private String nama;
    private String sifat;
    private int ukuran;

    public Animal() {}

    public Animal(String nama, int ukuran) {
        this.nama = nama;
        this.ukuran = ukuran;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getSifat() {
        return sifat;
    }
}

// Class Mamalia (Superclass)
class Mamalia extends Animal implements Movement {
    private String jalan;
    private String jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    public Mamalia() {}

    public Mamalia(String nama) {
        super.setNama(nama);
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public String getJalan() {
        return jalan;
    }

    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }

    @Override
    public void move() {
        System.out.println("MAMALIA BERJALAN DENGAN " + jumlahKaki + " KAKI DI " + jalan + ".");
    }
}

// Class Aves (Superclass)
class Aves extends Animal implements Flying {
    private String jenisAves;
    private boolean bisaTerbang;

    public Aves() {}

    public Aves(String nama, int ukuran) {
        super(nama, ukuran);
    }

    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    public String getJenisAves() {
        return jenisAves;
    }

    @Override
    public void fly() {
        if (bisaTerbang) {
            System.out.println("AVES INI BISA TERBANG.");
        } else {
            System.out.println("AVES INI TIDAK BISA TERBANG.");
        }
    }
}

// Class Ayam (Subclass)
class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiadu;

    public Ayam() {}

    public Ayam(String nama, int ukuran) {
        super(nama, ukuran);
    }

    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setBisaDiadu(boolean bisaDiadu) {
        this.bisaDiadu = bisaDiadu;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }

    @Override
    public final void fly() {
        System.out.println("AYAM BIASANYA TIDAK BISA TERBANG JAUH.");
    }
}

// Class Merpati (Subclass)
class Merpati extends Aves {
    public Merpati() {}

    public Merpati(String nama, int ukuran) {
        super(nama, ukuran);
    }

    @Override
    public void fly() {
        System.out.println("MERPATI TERBANG TINGGI DAN JAUH.");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        // Mamalia Object
        Mamalia mamalia = new Mamalia("SINGA");
        mamalia.setJumlahKaki(4);
        mamalia.setBisaJalan(true);
        mamalia.setJalan("PADANG RUMPUT");
        System.out.println("NAMA MAMALIA : " + mamalia.getNama());
        mamalia.move();

        // Ayam Object
        Ayam ayam = new Ayam("AYAM JAGO", 3);
        ayam.setJenisAyam("AYAM ADUAN");
        ayam.setBisaDiadu(true);
        System.out.println("\nNAMA AVES : " + ayam.getNama());
        System.out.println("JENIS AVES : " + ayam.getJenisAyam());
        ayam.fly();

        // Merpati Object
        Merpati merpati = new Merpati("MERPATI POS", 2);
        System.out.println("\nNAMA AVES : " + merpati.getNama());
        merpati.fly();
    }
}
